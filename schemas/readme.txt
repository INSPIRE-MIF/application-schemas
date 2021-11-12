W3C Schema for INSPIRE

      
Change log

INSPIRE schema release v.2021.2 - 15/11/2021 (https://github.com/INSPIRE-MIF/helpdesk-validator/releases/v2021.2)

Schema	Version	Change description											Change type
======	=======	====================================================================================================	==================================================
PF	v4.0.1	Added type and maxOccurs to riverBasinDistrict								non breaking change - bugfix

US-emf	v4.0.1	Added type to 'EnvironmentalManagementFacility' + missing parts in 'parentFacility'			non breaking change - bugfix

SO	v4.0.2	Added missing associations to OM_Observation + soilDerivedObjectObservation from 1 to [1..*]		breaking change - bugfix + enhancement

omso	v3.0.1	Changed TimeLocationValueTriple type from wml2:TimeValuePair to wml2:MeasurementTVP			breaking change - bugfix

common	v1.0.2	Corrected typo in the Dutch INSPIRE theme enumerations XSD						breaking change - bugfix

GE_gp	v4.0.1	Added type and nilReason to the distributioninfo							non breaking change - bugfix


Previous changes

Date        NS          Ver.   Description
=========== =========== ====== =================================================================================================================================================================
13-JUN-2012 inspire_dls 1.0.4  Renamed SpatialDataUniqueResourceIdentifier element to SpatialDataSetIdentifier. Added elements used in the Atom implementation and attributes used in the Opensearch. Changed service category in WFS20_Caps_Scenario2_long.xml
13-JUN-2012 inspire_dls 1.0.3  Added Unique Resource Identifier to atom top feed. Added SpatialDataUniqueResourceIdentifier to Extended Capabilities of WFS 2.0
04-MAY-2012 inspire_dls 1.0.0  Added inspire_dls folder for Download Services
26-APR-2011 common      1.0.1  Conformity element:
                               Restricted allowed citations to "INSPIRE interoperability of spatial data sets and services", according to the MD regulation 
                               requirements for the conformity element (page 17 of the MD regulation).
                               Inspire Themes:
                                  Removed leading blank from German, Bulgarian, Czech and Danish translations
22-MAR-2011 common      1.0.1  Wrong type in Romanian translation enumerations
17-MAR-2011 common      1.0.1  Changed alias inspire_com to inspire_common
                                  Conformity element: Added enumeration for citation of INSPIRE interoperability of spatial data sets and services
18-FEB-2011 common      1.0.0  Schema:
                                  changed encoding of language elements in extended capabilities
17-FEB-2011 common      1.0.0  Schema:
                                  introduced new namespaces
                                     http://inspire.ec.europa.eu/schemas/common/1.0
                                     http://inspire.ec.europa.eu/schemas/inspire_ds/1.0
                                     http://inspire.ec.europa.eu/schemas/inspire_vs/1.0
                                     http://inspire.ec.europa.eu/schemas/inspire_vs_ows11/1.0
                                  refactored to comply with OGC recommendations for schema repositories
04-FEB-2011 common       0.20  Schema:
                                  Moved non xsd files to other locations
                                  Renamed codelists as enumerations
31-JAN-2011 common       0.19  Schema:
                                  Removed language dependent schema implementations.
14-JAN-2011 common       0.18  Schema:
                                  added types and elements for INSPIRE service types
                                  added one or more leading zeros in geoboxdigits. e.g. 02.22
                                  Mappings:
                                     INSPIRE2HTML: Corrected Resource Locator to extract url from ResourceLocator.url
13-JAN-2011 common       0.16  Replaced xs:date and xs:dateTime with the new type iso8601Date which is a xs:string restricted through a regular expression that implements a subset of ISO 8601
                                      YEAR MONTH DAY TIME FRACTIONAL SECONDS TIME ZONE
                                      Examples:
                                         2010-01-01
                                         2010-01-01T11:12:22
                                         2010-01-01T11:12:22Z
                                         2010-01-01T11:12:22+10:00:00
                                         2010-01-01T11:12:22-10:00:00
                                         2010-01-01T11:12:22.1234+10:00:00
                                         2010-01-01T11:12:22.1234-10:00:00
                                    Added jaxb processing instructions and namespace in all top schema files
                                    XSLT Mappings updated to 0.16
                                    Added Microsoft language translator widget
            common       0.15   ResourceLocator:
                                      Changed Mediatype multiplicity from 1 to 0..n
                                      Mediatype constrained to enumeration values
                                    Verified all mappings
            common       0.14   Created schema files for all languages
            common       0.13   Added translations for all conformity citations 
            all          0.12   Introduced extended capabilities for WMS, OWS, CSW
			
			
			
			
Directory structure
+
  readme.txt                                                          This file
  -- common
    -- 1.0                                                            Version 1.0
      -- common.xsd                                                   Top schema file for http://inspire.ec.europa.eu/schemas/common/1.0
      -- network.xsd                                                  Definition of types for extended capabilities of OGC Services
      -- examples                                                     Sample documents
        -- inspireresourcemddataset.xml                               Sample dataset
        -- inspireresourcemdseries.xml                                Sample dataset series
        -- inspireresourcemdservice.xml                               Sample service
      -- enums                                                        Folder for translations of enumerations
        -- enum_bul.xsd                                               Enumerations for Bulgarian language
        -- enum_....xsd                                               Enumerations for ... language
  -- inspire_ds                                                       Root folder for schema documents for INSPIRE Discovery Service based on OGC CSW 2.0.2
    -- 1.0                                                            http://inspire.ec.europa.eu/schemas/inspire_ds/1.0
      -- inspire_ds.xsd                                               Top schema file
      -- bindings.xjb                                                 JAXB Binding file
      -- examples                                                     Sample documents
        -- CSW_INSPIREGeoportalCapabilities_InspireSchema_nocsw.xml
  -- inspire_vs                                                       Root folder for schema documents for INSPIRE View Service based on ISO 19128 (OGC WMS 1.3) http://inspire.ec.europa.eu/schemas/inspire_vs
    -- 1.0                                                            http://inspire.ec.europa.eu/schemas/inspire_vs/1.0
      -- inspire_vs.xsd                                               All-components schema file
      -- examples                                                     Sample documents
        -- wms_geoimage.xml
        -- WMS_Image2000GetCapabilities_InspireSchema.xml
  -- inspire_vs_ows11                                                 Root folder for schema documents for INSPIRE View Service based on OGC OWS 1.1 like WMTS 1.0
    -- 1.0                                                            http://inspire.ec.europa.eu/schemas/inspire_vs_ows11/1.0
      -- inspire_vs_ows_11.xsd                                        All-components schema file
      -- examples                                                     Sample documents
        -- WMTS_CapsMarek.xml
  -- inspire_dls                                                      Root folder for schema documents for INSPIRE Download Service based on OGC OWS 1.1 like WFS 2.0 and for datatypes used in Atom and OpenSearch extension elements
    -- 1.0                                                            http://inspire.ec.europa.eu/schemas/inspire_vs_ows11/1.0
      -- inspire_vs_ows_11.xsd                                        All-components schema file
      -- bindings.xjb                                                 JAXB binding file
      -- examples                                                     Sample documents
        -- WFS20_Caps_Scenario1_brief.xml                             Example of WFS 2.0 with INSPIRE Extended Capabilities Scenario 1 (brief)
        -- WFS20_Caps_Scenario2_long.xml                              Example of WFS 2.0 with INSPIRE Extended Capabilities Scenario 2 (long)
