W3C Schema for INSPIRE

      
Change log

INSPIRE schema release v.2024.1.1 - 09/02/2022 (https://github.com/INSPIRE-MIF/application-schemas/releases/tag/2024.1.1)

Schema            Change description                                                                                                           Version    Change type
===============   ===========================================================================================================================  =======    ====================================
[us-govserv]      Updated the version of the imported us-net-common schema (from 4.0 to 5.0)                                                   v5.0       breaking change  Amendment 1089/2010
[us-net-el]       Updated the version of the imported us-net-common schema (from 4.0 to 5.0)                                                   v5.0       breaking change  Amendment 1089/2010
[us-net-ogc]      Updated the version of the imported us-net-common schema (from 4.0 to 5.0)                                                   v5.0       breaking change  Amendment 1089/2010
[us-net-sw]       Updated the version of the imported us-net-common schema (from 4.0 to 5.0)                                                   v5.0       breaking change  Amendment 1089/2010
[us-net-th]       Updated the version of the imported us-net-common schema (from 4.0 to 5.0)                                                   v5.0       breaking change  Amendment 1089/2010
[us-net-wa]       Updated the version of the imported us-net-common schema (from 4.0 to 5.0)                                                   v5.0       breaking change  Amendment 1089/2010


INSPIRE schema release v.2024.1 - 31/01/2022 (https://github.com/INSPIRE-MIF/application-schemas/releases/tag/2024.1)

Schema            Change description                                                                                                           Version    Change type
===============   ===========================================================================================================================  =======    ====================================
[hh]              Added new attributes to the EnvHealthDeterminantMeasure feature type, added new feature types, and removed some data types.  v5.0       breaking change  Amendment 1089/2010
[ps]              Fixed typo in inspireId, added a new attribute, and moved attributes to data type.                                           v5.0       breaking change  Amendment 1089/2010
                  Removed enumeration from the schema and changed the encoding of the attributes that refer to enumerations                                           
[us-net-common]   Defined datatype for the authorityRole attribute                                                                             v5.0       breaking change
                  Change encoding of the attributes that refer to enumerations                                                                            breaking change  Amendment 1089/2010
[hyp]             Changed the data type of the geometry attribute of the DrainageBasin feature type                                            v5.0       non-breaking change   Amendment 1089/2010
                  Removed enumeration from schema and changed encoding of the attributes that refer to enumerations    breaking change 
[lcv]             Added association role to the LandCoverUnit feature type                                                                     v5.0       breaking change  Amendment 1089/2010
[tn-w]            Removed the “abstract” stereotype for the TrafficSeparationScheme feature type                                               v5.0       non-breaking change
                  Removed enumerations from schema and changed encoding of the attributes that refer to enumerations                                      breaking change  Amendment 1089/2010
[su-vector]       Added a new attribute “statisticalUnitType” to the VectorStatisticalUnit feature type                                        v4.1       non-breaking change  Amendment 1089/2010
[plu]             Fixed the typo in the attribute "backgroudMapURI" of the data type BackgroundMapValue                                        v4.0.1     breaking change  Amendment 1089/2010
[ef]              Added a new attribute "thematicId" to the spatial object type AbstractMonitoringObject.                                      v4.1       non-breaking change  Amendment 1089/2010
[pf]              Changed the definition of the ProductionInstallation feature type                                                            v4.1       non-breaking change  Amendment 1089/2010
[tn-a]            Changed the datatype for the "controlTowers" association of the AerodromeNode feature type                                   v4.1       non-breaking change  Amendment 1089/2010
[ad]              Changed the datatype for the "building" association of the Address feature type                                              v4.1       non-breaking change  Amendment 1089/2010
[sr]              Changed the stereotype of the ShoreSegment object from featureType to dataType                                               v4.0.1     breaking change  Amendment 1089/2010

Converted enumerations into codelists                                                                                                                     breaking change  Amendment 1089/2010.
Below are the involved schemas:
BaseTypes.xsd                Removed VerticalPositionValue enumeration from BaseTypes schema                                                   v4.0
HydroPhysicalWaters.xsd      Removed enumeration from schema and changed encoding of the attributes that refer to enumerations                 v5.0
UtilityNetworksCommon.xsd    Changed encoding of the attributes that refer to enumerations                                                     v5.0
ObservableProperties.xsd     Removed enumeration from schema and changed encoding of the attributes that refer to enumerations                 v4.0
AdministrativeUnits.xsd      Removed enumeration from schema and changed encoding of the attributes that refer to enumerations                 v5.0
MaritimeUnits.xsd            Changed encoding of the attributes that refer to enumerations                                                     v4.0
ElevationBaseTypes.xsd       Removed enumeration from schema                                                                                   v5.0
ElevationGridCoverage.xsd    Changed encoding of the attributes that refer to enumerations                                                     v5.0
ElevationTin.xsd             Changed encoding of the attributes that refer to enumerations                                                     v5.0
ElevationVectorElements.xsd  Removed enumeration from schema and changed encoding of the attributes that refer to enumerations                 v5.0
NaturalRiskZonesCore.xsd     Removed enumeration from schema and changed encoding of the attributes that refer to enumerations                 v5.0
ProtectedSites.xsd           Removed enumeration from schema and changed encoding of the attributes that refer to enumerations                 v5.0
CommonTransportElements.xsd  Removed enumeration from schema and changed encoding of the attributes that refer to enumerations                 v5.0
RailwayTransportNetwork.xsd  Removed enumerations from schema and changed encoding of the attributes that refer to enumerations                v5.0
RoadTransportNetwork.xsd     Removed enumerations from schema and changed encoding of the attributes that refer to enumerations                v5.0
WaterTransportNetwork.xsd    Removed enumerations from schema and changed encoding of the attributes that refer to enumerations                v5.0




INSPIRE schema release v.2023.1 - 31/01/2023 (https://github.com/INSPIRE-MIF/application-schemas/releases/tag/2023.1)

Schema      Version  Change description                                                                                Change type
==========  =======  ================================================================================================  ==================================================
common      v1.0.3   Updated common.xsd in order to add Norwegian and Icelandic language +                             non-breaking change - bugfix
                     Added the related enum_nor.xsd and enum_ice.xsd schemas
ge_hg       v4.0.1   Added missing nillable attribute to some elements                                                 non-breaking change - bugfix



INSPIRE schema release v.2022.2 - 01/08/2022 (https://github.com/INSPIRE-MIF/application-schemas/releases/tag/2022.2)

Schema      Version  Change description                                                                                Change type
==========  =======  ================================================================================================  ==================================================
PF          v4.0.2   Added type to ‘type’ element in ProductionInstallation and ProductionInstallationPart             breaking change - bugfix
us-net-th   v4.0.1   Added type to 'thermalProductType' element                                                        breaking change - bugfix
inspire_vs  v1.0.2   SLD capabilities schema import added to inspire_vs.xsd schema                                     non-breaking change - bugfix
EL          v4.0.1   Set ‘endLifespanVersion’ multiplicity to [0..1] In ElevationGridCoverage, ElevationTIN and        non-breaking change - bugfix
                      ElevationVectorElements application schemas 
MR          v4.0.1   Added type to ‘sourceReference ‘element                                                           breaking change - bugfix


INSPIRE schema release v.2022.1 - 31/01/2022 (https://github.com/INSPIRE-MIF/application-schemas/releases/tag/2022.1)

Schema  Version  Change description                                                                                   Change type
======  =======  ==================================================================================================== ==================================================
common  v1.0.2   Updated common.xsd in order to add Croatian language + Added a related enum_hrv.xsd                  non-breaking change - bugfix


INSPIRE schema release v.2021.2 - 15/11/2021 (https://github.com/INSPIRE-MIF/application-schemas/releases/tag/2021.2)

Schema  Version  Change description                                                                                   Change type
======  =======  ==================================================================================================== ==================================================
PF      v4.0.1   Added type and maxOccurs to riverBasinDistrict                                                       non-breaking change - bugfix
US-emf  v4.0.1   Added type to 'EnvironmentalManagementFacility' + missing parts in 'parentFacility'                  non-breaking change - bugfix
SO      v4.0.2   Added missing associations to OM_Observation + soilDerivedObjectObservation from 1 to [1..*]         breaking change - bugfix + enhancement
omso    v3.0.1   Changed TimeLocationValueTriple type from wml2:TimeValuePair to wml2:MeasurementTVP                  breaking change - bugfix
common  v1.0.2   Corrected typo in the Dutch INSPIRE theme enumerations XSD                                           breaking change - bugfix
GE_gp   v4.0.1   Added type and nilReason to the distributioninfo                                                     non-breaking change - bugfix

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
