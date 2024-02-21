#!/usr/bin/env groovy

import org.xml.sax.ErrorHandler
import static javax.xml.XMLConstants.W3C_XML_SCHEMA_NS_URI
import javax.xml.transform.Source
import javax.xml.transform.stream.StreamSource
import javax.xml.validation.SchemaFactory

def createValidator(List<URL> xsds) {
  Source[] sources = new Source[xsds.size()];
  xsds.eachWithIndex { xsd, i ->
    sources[i] = new StreamSource(xsd.newInputStream())
  }

  return SchemaFactory.newInstance(W3C_XML_SCHEMA_NS_URI)
               .newSchema(sources)
               .newValidator()
}

List findProblems(File xml, def vald) {
  vald.with { validator ->
    List exceptions = []
    Closure<Void> handler = { exception -> exceptions << exception }
    errorHandler = [ warning: handler, fatalError: handler, error: handler ] as ErrorHandler
    validate(new StreamSource(xml))
    exceptions
  }
}

// schemas for validation
def schemaUrls = ['https://www.w3.org/2001/XMLSchema.xsd']
def schemas = []
schemaUrls.each { schema ->
  def url
  if (schema.startsWith('http') || schema.startsWith('file:')) {
    url = new URL(schema)
  }
  else {
    url = new File(schema).toURL()
  }
  schemas.add(url);
  println "Schema: $url"
}

// Workaround for issue with references to dtd files being resolved locally - download dtd files to local folder
new File('XMLSchema.dtd').text = new URL('https://www.w3.org/2001/XMLSchema.dtd').text
new File('datatypes.dtd').text = new URL('https://www.w3.org/2001/datatypes.dtd').text

def validator = createValidator(schemas)

def errorSchemas = []
def schemaProblems = [:]

def root = new File('.')
root.eachFileRecurse { file ->
  if (file.isFile() && file.name.endsWith('.xsd')) {
    println "Validating schema file $file"

    try {
      def problems = findProblems(file, validator)

      problems.each {
        println "Problem @ line $it.lineNumber, col $it.columnNumber : $it.message"
      }
      if (problems.size() > 0) {
        errorSchemas << file
        schemaProblems[file] = problems
        println "\nOverall ${problems.size()} errors."
      }
      else {
        println 'Validation successful.'
      }
    } catch (e) {
      e.printStackTrace()
      errorSchemas << file
      schemaProblems[file] = [[lineNumber: 0, columnNumber: 0, message: e.message]]
    }
  }
}

println ""

if (errorSchemas) {
  println "Schemas with errors:"
  println ""

  errorSchemas.each { file ->
    println "  - $file"
    schemaProblems[file].each {
      println "    Problem @ line $it.lineNumber, col $it.columnNumber : $it.message"
    }
  }
  // exit with error
  System.exit(1)
}
else {
  println "All schemas validated successfully"
}
