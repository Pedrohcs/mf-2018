package br.ufg.inf.pedrohcs.aula8.Connection;

import br.ufg.inf.pedrohcs.aula8.Model.Loinc;
import java.sql.*;
import java.util.ArrayList;

public class ConsultaLoinc {

    private void contructo(ArrayList<Loinc> result, ResultSet rs) throws SQLException {
        while(rs.next()) {
            Loinc loinc = new Loinc();
            loinc.setLoincNum(rs.getString("loinc_num"));
            loinc.setComponent(rs.getString("component"));
            loinc.setProperty(rs.getString("property"));
            loinc.setSys(rs.getString("system"));
            loinc.setScaleTyp(rs.getString("scale_typ"));
            loinc.setMethodTyp(rs.getString("method_typ"));
            loinc.setClasse(rs.getString("class"));
            loinc.setStatus(rs.getString("status"));
            loinc.setConsumerName(rs.getString("consumer_name"));
            loinc.setClassType(rs.getInt("classtype"));
            loinc.setSpecies(rs.getString("species"));
            loinc.setShortName(rs.getString("shortname"));
            loinc.setTimeAspct(rs.getString("time_aspct"));
            loinc.setVersionLastChanged(rs.getString("VersionLastChanged"));
            loinc.setChngType(rs.getString("chng_type"));
            loinc.setDefinitionDescription(rs.getString("DefinitionDescription"));
            loinc.setFormula(rs.getString("formula"));
            loinc.setExmplAnswer(rs.getString("exmpl_answers"));
            loinc.setSuveyQuestText(rs.getString("survey_quest_text"));
            loinc.setSuveyQuestSrc(rs.getString("survey_quest_src"));
            loinc.setUnitsrequired(rs.getString("unitsrequired"));
            loinc.setSubmittedUnits(rs.getString("submitted_units"));
            loinc.setRelatedNames2(rs.getString("relatednames2"));
            loinc.setOrderObs(rs.getString("order_obs"));
            loinc.setCdiscCommonTests(rs.getString("cdisc_common_tests"));
            loinc.setHl7FieldSubfieldId(rs.getString("hl7_field_subfield_id"));
            loinc.setExternalCopyrightNotice(rs.getString("external_copyright_notice"));
            loinc.setExampleUnits(rs.getString("example_units"));
            loinc.setLongCommonName(rs.getString("long_common_name"));
            loinc.setUnitsAndRange(rs.getString("UnitsAndRange"));
            loinc.setDocumentSection(rs.getString("document_section"));
            loinc.setExampleUcumUnits(rs.getString("example_ucum_units"));
            loinc.setExampleSiUcumUnits(rs.getString("example_si_ucum_units"));
            loinc.setStatusReason(rs.getString("status_reason"));
            loinc.setStatusText(rs.getString("status_text"));
            loinc.setChangeReasonPublic(rs.getString("change_reason_public"));
            loinc.setCommonTestRank(rs.getInt("common_test_rank"));
            loinc.setCommonOrderRank(rs.getInt("common_order_rank"));
            loinc.setCommonSiTestRank(rs.getInt("common_si_test_rank"));
            loinc.setHl7AttachmentStructure(rs.getString("hl7_attachment_structure"));
            loinc.setExternalCopyrightLink(rs.getString("ExternalCopyrightLink"));
            loinc.setPanelType(rs.getString("PanelType"));
            loinc.setAskAtOrderEntry(rs.getString("AskAtOrderEntry"));
            loinc.setAssociatedObservations(rs.getString("AssociatedObservations"));
            loinc.setVersionFirstReleased(rs.getString("VersionFirstReleased"));
            loinc.setValidHL7AttachmentRequest(rs.getString("ValidHL7AttachmentRequest"));
            result.add(loinc);
        }
    }

    private Connection connect = null;

    public ConsultaLoinc() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1/loincbd?"
                + "user=user1&password=user1&serverTimezone=UTC&useSSL=false");
    }

    public Loinc selectPorLoincNum(String loincNum) throws SQLException, ClassNotFoundException {
        Loinc loinc = null;

        PreparedStatement pstmt = this.connect.prepareStatement("SELECT * FROM loinc WHERE loinc_num = \""
                + loincNum + "\"");
        ResultSet rs = pstmt.executeQuery();
        while(rs.next()) {
            loinc = new Loinc();
            loinc.setLoincNum(rs.getString("loinc_num"));
            loinc.setComponent(rs.getString("component"));
            loinc.setProperty(rs.getString("property"));
            loinc.setSys(rs.getString("system"));
            loinc.setScaleTyp(rs.getString("scale_typ"));
            loinc.setMethodTyp(rs.getString("method_typ"));
            loinc.setClasse(rs.getString("class"));
            loinc.setStatus(rs.getString("status"));
            loinc.setConsumerName(rs.getString("consumer_name"));
            loinc.setClassType(rs.getInt("classtype"));
            loinc.setSpecies(rs.getString("species"));
            loinc.setShortName(rs.getString("shortname"));
            loinc.setTimeAspct(rs.getString("time_aspct"));
            loinc.setVersionLastChanged(rs.getString("VersionLastChanged"));
            loinc.setChngType(rs.getString("chng_type"));
            loinc.setDefinitionDescription(rs.getString("DefinitionDescription"));
            loinc.setFormula(rs.getString("formula"));
            loinc.setExmplAnswer(rs.getString("exmpl_answers"));
            loinc.setSuveyQuestText(rs.getString("survey_quest_text"));
            loinc.setSuveyQuestSrc(rs.getString("survey_quest_src"));
            loinc.setUnitsrequired(rs.getString("unitsrequired"));
            loinc.setSubmittedUnits(rs.getString("submitted_units"));
            loinc.setRelatedNames2(rs.getString("relatednames2"));
            loinc.setOrderObs(rs.getString("order_obs"));
            loinc.setCdiscCommonTests(rs.getString("cdisc_common_tests"));
            loinc.setHl7FieldSubfieldId(rs.getString("hl7_field_subfield_id"));
            loinc.setExternalCopyrightNotice(rs.getString("external_copyright_notice"));
            loinc.setExampleUnits(rs.getString("example_units"));
            loinc.setLongCommonName(rs.getString("long_common_name"));
            loinc.setUnitsAndRange(rs.getString("UnitsAndRange"));
            loinc.setDocumentSection(rs.getString("document_section"));
            loinc.setExampleUcumUnits(rs.getString("example_ucum_units"));
            loinc.setExampleSiUcumUnits(rs.getString("example_si_ucum_units"));
            loinc.setStatusReason(rs.getString("status_reason"));
            loinc.setStatusText(rs.getString("status_text"));
            loinc.setChangeReasonPublic(rs.getString("change_reason_public"));
            loinc.setCommonTestRank(rs.getInt("common_test_rank"));
            loinc.setCommonOrderRank(rs.getInt("common_order_rank"));
            loinc.setCommonSiTestRank(rs.getInt("common_si_test_rank"));
            loinc.setHl7AttachmentStructure(rs.getString("hl7_attachment_structure"));
            loinc.setExternalCopyrightLink(rs.getString("ExternalCopyrightLink"));
            loinc.setPanelType(rs.getString("PanelType"));
            loinc.setAskAtOrderEntry(rs.getString("AskAtOrderEntry"));
            loinc.setAssociatedObservations(rs.getString("AssociatedObservations"));
            loinc.setVersionFirstReleased(rs.getString("VersionFirstReleased"));
            loinc.setValidHL7AttachmentRequest(rs.getString("ValidHL7AttachmentRequest"));
        }

        return loinc;
    }

    public ArrayList<Loinc> selectPorClassType(int classtype) throws SQLException {
        ArrayList<Loinc> result = new ArrayList<Loinc>();

        PreparedStatement pstmt = this.connect.prepareStatement("SELECT * FROM loinc WHERE classtype = " + classtype);
        ResultSet rs = pstmt.executeQuery();
        contructo(result, rs);

        return result;
    }




    public ArrayList<Loinc> getByLoincComponent(String component) throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM loinc WHERE component = " + component;
        ArrayList<Loinc> result = new ArrayList<Loinc>();
        PreparedStatement pstmt = this.connect.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        contructo(result, rs);

        return result;
    }

    public ArrayList<Loinc> getByLoincProperty(String property) throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM loinc WHERE property = " + property;
        ArrayList<Loinc> result = new ArrayList<Loinc>();
        PreparedStatement pstmt = this.connect.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        contructo(result, rs);

        return result;
    }

    public ArrayList<Loinc> getByLoincSystem(String system) throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM loinc WHERE system = " + system;
        ArrayList<Loinc> result = new ArrayList<Loinc>();
        PreparedStatement pstmt = this.connect.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        contructo(result, rs);

        return result;
    }

    public ArrayList<Loinc> getByLoincScaleTyp(String scale_typ) throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM loinc WHERE scale_typ = " + scale_typ;
        ArrayList<Loinc> result = new ArrayList<Loinc>();
        PreparedStatement pstmt = this.connect.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        contructo(result, rs);

        return result;
    }

    public ArrayList<Loinc> getByLoincMethodTyp(String method_typ) throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM loinc WHERE method_typ = " + method_typ;
        ArrayList<Loinc> result = new ArrayList<Loinc>();
        PreparedStatement pstmt = this.connect.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        contructo(result, rs);

        return result;
    }

    public ArrayList<Loinc> getByLoincClass(String classe) throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM loinc WHERE class = " + classe;
        ArrayList<Loinc> result = new ArrayList<Loinc>();
        PreparedStatement pstmt = this.connect.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        contructo(result, rs);

        return result;
    }

    public ArrayList<Loinc> getByLoincStatus(String status) throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM loinc WHERE status = " + status;
        ArrayList<Loinc> result = new ArrayList<Loinc>();
        PreparedStatement pstmt = this.connect.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        contructo(result, rs);

        return result;
    }

    public ArrayList<Loinc> getByLoincConsumerName(String consumer_name)
            throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM loinc WHERE consumer_name = " + consumer_name;
        ArrayList<Loinc> result = new ArrayList<Loinc>();
        PreparedStatement pstmt = this.connect.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        contructo(result, rs);

        return result;
    }

    public ArrayList<Loinc> getByLoincSpecies(String species) throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM loinc WHERE species = " + species;
        ArrayList<Loinc> result = new ArrayList<Loinc>();
        PreparedStatement pstmt = this.connect.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        contructo(result, rs);

        return result;
    }

    public ArrayList<Loinc> getByLoincShortname(String shortname) throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM loinc WHERE shortname = " + shortname;
        ArrayList<Loinc> result = new ArrayList<Loinc>();
        PreparedStatement pstmt = this.connect.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        contructo(result, rs);

        return result;
    }

    public ArrayList<Loinc> getByLoincTimeAspct(String time_aspct) throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM loinc WHERE time_aspct = " + time_aspct;
        ArrayList<Loinc> result = new ArrayList<Loinc>();
        PreparedStatement pstmt = this.connect.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        contructo(result, rs);

        return result;
    }

    public ArrayList<Loinc> getByLoincVersionLastChanged(String VersionLastChanged)
            throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM loinc WHERE VersionLastChanged = " + VersionLastChanged;
        ArrayList<Loinc> result = new ArrayList<Loinc>();
        PreparedStatement pstmt = this.connect.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        contructo(result, rs);

        return result;
    }

    public ArrayList<Loinc> getByLoincChngType(String chng_type) throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM loinc WHERE chng_type = " + chng_type;
        ArrayList<Loinc> result = new ArrayList<Loinc>();
        PreparedStatement pstmt = this.connect.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        contructo(result, rs);

        return result;
    }

    public ArrayList<Loinc> getByLoincDefinitionDescriotion(String DefinitionDescription)
            throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM loinc WHERE DefinitionDescription = " + DefinitionDescription;
        ArrayList<Loinc> result = new ArrayList<Loinc>();
        PreparedStatement pstmt = this.connect.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        contructo(result, rs);

        return result;
    }

    public ArrayList<Loinc> getByLoincFormula(String formula) throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM loinc WHERE formula = " + formula;
        ArrayList<Loinc> result = new ArrayList<Loinc>();
        PreparedStatement pstmt = this.connect.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        contructo(result, rs);

        return result;
    }

    public ArrayList<Loinc> getByLoincExmplAnswars(String exmpl_answers)
            throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM loinc WHERE exmpl_answers = " + exmpl_answers;
        ArrayList<Loinc> result = new ArrayList<Loinc>();
        PreparedStatement pstmt = this.connect.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        contructo(result, rs);

        return result;
    }

    public ArrayList<Loinc> getByLoincSurveyQuestText(String survey_quest_text)
            throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM loinc WHERE survey_quest_text = " + survey_quest_text;
        ArrayList<Loinc> result = new ArrayList<Loinc>();
        PreparedStatement pstmt = this.connect.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        contructo(result, rs);

        return result;
    }

    public ArrayList<Loinc> getByLoincSurveyQuestSrc(String survey_quest_src)
            throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM loinc WHERE survey_quest_src = " + survey_quest_src;
        ArrayList<Loinc> result = new ArrayList<Loinc>();
        PreparedStatement pstmt = this.connect.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        contructo(result, rs);

        return result;
    }

    public ArrayList<Loinc> getByLoincUnitsrquired(String unitsrequired)
            throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM loinc WHERE unitsrequired = " + unitsrequired;
        ArrayList<Loinc> result = new ArrayList<Loinc>();
        PreparedStatement pstmt = this.connect.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        contructo(result, rs);

        return result;
    }

    public ArrayList<Loinc> getByLoincSubmittedUnits(String submitted_units)
            throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM loinc WHERE submitted_units = " + submitted_units;
        ArrayList<Loinc> result = new ArrayList<Loinc>();
        PreparedStatement pstmt = this.connect.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        contructo(result, rs);

        return result;
    }

    public ArrayList<Loinc> getByLoincRelatedNames2(String relatednames2) throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM loinc WHERE relatednames2 = " + relatednames2;
        ArrayList<Loinc> result = new ArrayList<Loinc>();
        PreparedStatement pstmt = this.connect.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        contructo(result, rs);

        return result;
    }

    public ArrayList<Loinc> getByLoincOrderObs(String order_obs) throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM loinc WHERE order_obs = " + order_obs;
        ArrayList<Loinc> result = new ArrayList<Loinc>();
        PreparedStatement pstmt = this.connect.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        contructo(result, rs);

        return result;
    }

    public ArrayList<Loinc> getByLoincCdiscCommonTests(String cdisc_common_tests)
            throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM loinc WHERE cdisc_common_tests = " + cdisc_common_tests;
        ArrayList<Loinc> result = new ArrayList<Loinc>();
        PreparedStatement pstmt = this.connect.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        contructo(result, rs);

        return result;
    }

    public ArrayList<Loinc> getByLoincHl7FieldSubfieldid(String hl7_field_subfield_id)
            throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM loinc WHERE hl7_field_subfield_id = " + hl7_field_subfield_id;
        ArrayList<Loinc> result = new ArrayList<Loinc>();
        PreparedStatement pstmt = this.connect.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        contructo(result, rs);

        return result;
    }

    public ArrayList<Loinc> getByLoincExternalCopyright(String external_copyright_notice)
            throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM loinc WHERE external_copyright_notice = " + external_copyright_notice;
        ArrayList<Loinc> result = new ArrayList<Loinc>();
        PreparedStatement pstmt = this.connect.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        contructo(result, rs);

        return result;
    }

    public ArrayList<Loinc> getByLoincExampleUnits(String example_units) throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM loinc WHERE example_units = " + example_units;
        ArrayList<Loinc> result = new ArrayList<Loinc>();
        PreparedStatement pstmt = this.connect.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        contructo(result, rs);

        return result;
    }

    public ArrayList<Loinc> getByLoincLongCommonName(String long_common_name) throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM loinc WHERE long_common_name = " + long_common_name;
        ArrayList<Loinc> result = new ArrayList<Loinc>();
        PreparedStatement pstmt = this.connect.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        contructo(result, rs);

        return result;
    }

    public ArrayList<Loinc> getByLoincUnitsAndRange(String UnitsAndRange) throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM loinc WHERE UnitsAndRange = " + UnitsAndRange;
        ArrayList<Loinc> result = new ArrayList<Loinc>();
        PreparedStatement pstmt = this.connect.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        contructo(result, rs);

        return result;
    }

    public ArrayList<Loinc> getByLoincDocumentSection(String document_section) throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM loinc WHERE document_section = " + document_section;
        ArrayList<Loinc> result = new ArrayList<Loinc>();
        PreparedStatement pstmt = this.connect.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        contructo(result, rs);

        return result;
    }

    public ArrayList<Loinc> getByLoincExampleUcumUnits(String example_ucum_units) throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM loinc WHERE example_ucum_units = " + example_ucum_units;
        ArrayList<Loinc> result = new ArrayList<Loinc>();
        PreparedStatement pstmt = this.connect.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        contructo(result, rs);

        return result;
    }

    public ArrayList<Loinc> getByLoincExampleSiUcumUnits(String example_si_ucum_units)
            throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM loinc WHERE example_si_ucum_units = " + example_si_ucum_units;
        ArrayList<Loinc> result = new ArrayList<Loinc>();
        PreparedStatement pstmt = this.connect.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        contructo(result, rs);

        return result;
    }

    public ArrayList<Loinc> getByLoincStatusReason(String status_reason) throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM loinc WHERE status_reason = " + status_reason;
        ArrayList<Loinc> result = new ArrayList<Loinc>();
        PreparedStatement pstmt = this.connect.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        contructo(result, rs);

        return result;
    }

    public ArrayList<Loinc> getByLoincStatusText(String status_text) throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM loinc WHERE status_text = " + status_text;
        ArrayList<Loinc> result = new ArrayList<Loinc>();
        PreparedStatement pstmt = this.connect.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        contructo(result, rs);

        return result;
    }

    public ArrayList<Loinc> getByLoincChangeReasonPublic(String change_reason_public)
            throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM loinc WHERE change_reason_public = " + change_reason_public;
        ArrayList<Loinc> result = new ArrayList<Loinc>();
        PreparedStatement pstmt = this.connect.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        contructo(result, rs);

        return result;
    }

    public ArrayList<Loinc> getByLoincCommonTestRank(int common_test_rank) throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM loinc WHERE common_test_rank = " + common_test_rank;
        ArrayList<Loinc> result = new ArrayList<Loinc>();
        PreparedStatement pstmt = this.connect.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        contructo(result, rs);

        return result;
    }

    public ArrayList<Loinc> getByLoincCommonOrderRank(int common_order_rank) throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM loinc WHERE common_order_rank = " + common_order_rank;
        ArrayList<Loinc> result = new ArrayList<Loinc>();
        PreparedStatement pstmt = this.connect.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        contructo(result, rs);

        return result;
    }

    public ArrayList<Loinc> getByLoincCommonSiTestRank(int common_si_test_rank)
            throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM loinc WHERE common_si_test_rank = " + common_si_test_rank;
        ArrayList<Loinc> result = new ArrayList<Loinc>();
        PreparedStatement pstmt = this.connect.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        contructo(result, rs);

        return result;
    }

    public ArrayList<Loinc> getByLoincHl7AttachmentStructure(String hl7_attachment_structure)
            throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM loinc WHERE hl7_attachment_structure = " + hl7_attachment_structure;
        ArrayList<Loinc> result = new ArrayList<Loinc>();
        PreparedStatement pstmt = this.connect.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        contructo(result, rs);

        return result;
    }

    public ArrayList<Loinc> getByLoincExternalCopy(String ExternalCopyrightLink) throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM loinc WHERE ExternalCopyrightLink = " + ExternalCopyrightLink;
        ArrayList<Loinc> result = new ArrayList<Loinc>();
        PreparedStatement pstmt = this.connect.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        contructo(result, rs);

        return result;
    }

    public ArrayList<Loinc> getByLoincPanelType(String PanelType) throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM loinc WHERE PanelType = " + PanelType;
        ArrayList<Loinc> result = new ArrayList<Loinc>();
        PreparedStatement pstmt = this.connect.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        contructo(result, rs);

        return result;
    }

    public ArrayList<Loinc> getByLoincAskAtOrderEntry(String AskAtOrderEntry) throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM loinc WHERE AskAtOrderEntry = " + AskAtOrderEntry;
        ArrayList<Loinc> result = new ArrayList<Loinc>();
        PreparedStatement pstmt = this.connect.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        contructo(result, rs);

        return result;
    }

    public ArrayList<Loinc> getByLoincAssociatedObs(String AssociatedObservations) throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM loinc WHERE AssociatedObservations = " + AssociatedObservations;
        ArrayList<Loinc> result = new ArrayList<Loinc>();
        PreparedStatement pstmt = this.connect.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        contructo(result, rs);

        return result;
    }

    public ArrayList<Loinc> getByLoincVersionFirstReleased(String VersionFirstReleased)
            throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM loinc WHERE VersionFirstReleased = " + VersionFirstReleased;
        ArrayList<Loinc> result = new ArrayList<Loinc>();
        PreparedStatement pstmt = this.connect.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        contructo(result, rs);

        return result;
    }

    public ArrayList<Loinc> getByLoincValidHL7(String ValidHL7AttachmentRequest) throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM loinc WHERE ValidHL7AttachmentRequest = " + ValidHL7AttachmentRequest;
        ArrayList<Loinc> result = new ArrayList<Loinc>();
        PreparedStatement pstmt = this.connect.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        contructo(result, rs);

        return result;
    }

    public void close() throws SQLException {
        this.connect.close();
    }
}