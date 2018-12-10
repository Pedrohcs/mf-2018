USE loinc;

 LOAD DATA LOCAL INFILE 'Loinc.csv' 
 INTO TABLE Loinc 
 FIELDS TERMINATED BY ',' 
 OPTIONALLY ENCLOSED BY '"' 
 LINES TERMINATED BY '\r\n'  
 IGNORE 1 LINES
 
 (
   loinc_num,
  component,
  property,
  time_aspct,
  system,
  scale_typ,
  method_typ,
  class,
  VersionLastChanged,
  chng_type,
  DefinitionDescription,
  status,
  consumer_name,
  classtype,
  formula,
  species,
  exmpl_answers,
  survey_quest_text,
  survey_quest_src,
  unitsrequired,
  submitted_units,
  relatednames2,
  shortname,
  order_obs,
  cdisc_common_tests,
  hl7_field_subfield_id,
  external_copyright_notice,
  example_units,
  long_common_name,
  UnitsAndRange,
  document_section,
  example_ucum_units,
  example_si_ucum_units,
  status_reason,
  status_text,
  change_reason_public,
  common_test_rank,
  common_order_rank,
  common_si_test_rank,
  hl7_attachment_structure,
  ExternalCopyrightLink,
  PanelType,
	AskAtOrderEntry,
	AssociatedObservations,
	VersionFirstReleased,
	ValidHL7AttachmentRequest
	
 )
 ;

select count(*) from Loinc;

