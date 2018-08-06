package com.renguanyu.tool.geocoding.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * PmProjectSurvey entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "PM_PROJECT_SURVEY", schema = "PM")
public class PmProjectSurvey implements java.io.Serializable {

	// Fields

	private String id;
	private String projectcode;
	private String projectname;
	private String projectunit;
	private String construnit;
	private String constrcontent;
	private String constrplace;
	private String constrplaceinfo;
	private String projectcategory;
	private String regionid;
	private String projectwh;
	private String projectdate;
	private String surfilename;
	private String constryear;
	private String pifuwenhao;
	private String pifufilename;
	private BigDecimal isnkproject;
	private String subcategory;
	private String cswenhao;
	private String createBy;
	private String createDate;
	private String updateBy;
	private String updateDate;
	private String remarks;
	private String delFlag;
	private String officeId;
	private String companyId;
	private String sbznid;
	private String sfsfqxm;
	private String sfqid;
	private String sfqname;
	private String jsxz;
	private String lng;
	private String lat;
	private String sfzjtz;
	private String feedback;
	private String wtdid;
	private String dlxhfsj;
	private String password;
	private String projectpublicity;
	private BigDecimal construStatus;
	private BigDecimal surveyStatus;
	private BigDecimal investStatus;
	private BigDecimal commitStatus;
	private BigDecimal returnStatus;
	private String headerId;
	private Long page;
	private String fname;
	private String label;
	private String xmlx;
	private String zgdw;

	// Constructors

	/** default constructor */
	public PmProjectSurvey() {
	}

	/** full constructor */
	public PmProjectSurvey(String projectcode, String projectname,
						   String projectunit, String construnit, String constrcontent,
						   String constrplace, String constrplaceinfo, String projectcategory,
						   String regionid, String projectwh, String projectdate,
						   String surfilename, String constryear, String pifuwenhao,
						   String pifufilename, BigDecimal isnkproject, String subcategory,
						   String cswenhao, String createBy, String createDate,
						   String updateBy, String updateDate, String remarks, String delFlag,
						   String officeId, String companyId, String sbznid, String sfsfqxm,
						   String sfqid, String sfqname, String jsxz, String lng, String lat,
						   String sfzjtz, String feedback, String wtdid, String dlxhfsj,
						   String password, String projectpublicity, BigDecimal construStatus,
						   BigDecimal surveyStatus, BigDecimal investStatus,
						   BigDecimal commitStatus, BigDecimal returnStatus, String headerId,
						   Long page, String fname, String label, String xmlx, String zgdw) {
		this.projectcode = projectcode;
		this.projectname = projectname;
		this.projectunit = projectunit;
		this.construnit = construnit;
		this.constrcontent = constrcontent;
		this.constrplace = constrplace;
		this.constrplaceinfo = constrplaceinfo;
		this.projectcategory = projectcategory;
		this.regionid = regionid;
		this.projectwh = projectwh;
		this.projectdate = projectdate;
		this.surfilename = surfilename;
		this.constryear = constryear;
		this.pifuwenhao = pifuwenhao;
		this.pifufilename = pifufilename;
		this.isnkproject = isnkproject;
		this.subcategory = subcategory;
		this.cswenhao = cswenhao;
		this.createBy = createBy;
		this.createDate = createDate;
		this.updateBy = updateBy;
		this.updateDate = updateDate;
		this.remarks = remarks;
		this.delFlag = delFlag;
		this.officeId = officeId;
		this.companyId = companyId;
		this.sbznid = sbznid;
		this.sfsfqxm = sfsfqxm;
		this.sfqid = sfqid;
		this.sfqname = sfqname;
		this.jsxz = jsxz;
		this.lng = lng;
		this.lat = lat;
		this.sfzjtz = sfzjtz;
		this.feedback = feedback;
		this.wtdid = wtdid;
		this.dlxhfsj = dlxhfsj;
		this.password = password;
		this.projectpublicity = projectpublicity;
		this.construStatus = construStatus;
		this.surveyStatus = surveyStatus;
		this.investStatus = investStatus;
		this.commitStatus = commitStatus;
		this.returnStatus = returnStatus;
		this.headerId = headerId;
		this.page = page;
		this.fname = fname;
		this.label = label;
		this.xmlx = xmlx;
		this.zgdw = zgdw;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "uuid.hex")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "ID", unique = true, nullable = false, length = 64)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "PROJECTCODE", length = 200)
	public String getProjectcode() {
		return this.projectcode;
	}

	public void setProjectcode(String projectcode) {
		this.projectcode = projectcode;
	}

	@Column(name = "PROJECTNAME", length = 1000)
	public String getProjectname() {
		return this.projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	@Column(name = "PROJECTUNIT")
	public String getProjectunit() {
		return this.projectunit;
	}

	public void setProjectunit(String projectunit) {
		this.projectunit = projectunit;
	}

	@Column(name = "CONSTRUNIT", length = 3000)
	public String getConstrunit() {
		return this.construnit;
	}

	public void setConstrunit(String construnit) {
		this.construnit = construnit;
	}

	@Column(name = "CONSTRCONTENT", length = 2000)
	public String getConstrcontent() {
		return this.constrcontent;
	}

	public void setConstrcontent(String constrcontent) {
		this.constrcontent = constrcontent;
	}

	@Column(name = "CONSTRPLACE", length = 64)
	public String getConstrplace() {
		return this.constrplace;
	}

	public void setConstrplace(String constrplace) {
		this.constrplace = constrplace;
	}

	@Column(name = "CONSTRPLACEINFO", length = 2000)
	public String getConstrplaceinfo() {
		return this.constrplaceinfo;
	}

	public void setConstrplaceinfo(String constrplaceinfo) {
		this.constrplaceinfo = constrplaceinfo;
	}

	@Column(name = "PROJECTCATEGORY", length = 500)
	public String getProjectcategory() {
		return this.projectcategory;
	}

	public void setProjectcategory(String projectcategory) {
		this.projectcategory = projectcategory;
	}

	@Column(name = "REGIONID")
	public String getRegionid() {
		return this.regionid;
	}

	public void setRegionid(String regionid) {
		this.regionid = regionid;
	}

	@Column(name = "PROJECTWH", length = 500)
	public String getProjectwh() {
		return this.projectwh;
	}

	public void setProjectwh(String projectwh) {
		this.projectwh = projectwh;
	}

	@Column(name = "PROJECTDATE", length = 50)
	public String getProjectdate() {
		return this.projectdate;
	}

	public void setProjectdate(String projectdate) {
		this.projectdate = projectdate;
	}

	@Column(name = "SURFILENAME", length = 500)
	public String getSurfilename() {
		return this.surfilename;
	}

	public void setSurfilename(String surfilename) {
		this.surfilename = surfilename;
	}

	@Column(name = "CONSTRYEAR")
	public String getConstryear() {
		return this.constryear;
	}

	public void setConstryear(String constryear) {
		this.constryear = constryear;
	}

	@Column(name = "PIFUWENHAO", length = 100)
	public String getPifuwenhao() {
		return this.pifuwenhao;
	}

	public void setPifuwenhao(String pifuwenhao) {
		this.pifuwenhao = pifuwenhao;
	}

	@Column(name = "PIFUFILENAME", length = 500)
	public String getPifufilename() {
		return this.pifufilename;
	}

	public void setPifufilename(String pifufilename) {
		this.pifufilename = pifufilename;
	}

	@Column(name = "ISNKPROJECT", precision = 22, scale = 0)
	public BigDecimal getIsnkproject() {
		return this.isnkproject;
	}

	public void setIsnkproject(BigDecimal isnkproject) {
		this.isnkproject = isnkproject;
	}

	@Column(name = "SUBCATEGORY", length = 64)
	public String getSubcategory() {
		return this.subcategory;
	}

	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}

	@Column(name = "CSWENHAO", length = 100)
	public String getCswenhao() {
		return this.cswenhao;
	}

	public void setCswenhao(String cswenhao) {
		this.cswenhao = cswenhao;
	}

	@Column(name = "CREATE_BY", length = 64)
	public String getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	@Column(name = "CREATE_DATE")
	public String getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	@Column(name = "UPDATE_BY", length = 64)
	public String getUpdateBy() {
		return this.updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	@Column(name = "UPDATE_DATE")
	public String getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	@Column(name = "REMARKS", length = 510)
	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Column(name = "DEL_FLAG", length = 1)
	public String getDelFlag() {
		return this.delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}

	@Column(name = "OFFICE_ID", length = 64)
	public String getOfficeId() {
		return this.officeId;
	}

	public void setOfficeId(String officeId) {
		this.officeId = officeId;
	}

	@Column(name = "COMPANY_ID", length = 64)
	public String getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	@Column(name = "SBZNID", length = 64)
	public String getSbznid() {
		return this.sbznid;
	}

	public void setSbznid(String sbznid) {
		this.sbznid = sbznid;
	}

	@Column(name = "SFSFQXM", length = 50)
	public String getSfsfqxm() {
		return this.sfsfqxm;
	}

	public void setSfsfqxm(String sfsfqxm) {
		this.sfsfqxm = sfsfqxm;
	}

	@Column(name = "SFQID", length = 128)
	public String getSfqid() {
		return this.sfqid;
	}

	public void setSfqid(String sfqid) {
		this.sfqid = sfqid;
	}

	@Column(name = "SFQNAME", length = 512)
	public String getSfqname() {
		return this.sfqname;
	}

	public void setSfqname(String sfqname) {
		this.sfqname = sfqname;
	}

	@Column(name = "JSXZ", length = 64)
	public String getJsxz() {
		return this.jsxz;
	}

	public void setJsxz(String jsxz) {
		this.jsxz = jsxz;
	}

	@Column(name = "LNG", length = 32)
	public String getLng() {
		return this.lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	@Column(name = "LAT", length = 32)
	public String getLat() {
		return this.lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	@Column(name = "SFZJTZ", length = 128)
	public String getSfzjtz() {
		return this.sfzjtz;
	}

	public void setSfzjtz(String sfzjtz) {
		this.sfzjtz = sfzjtz;
	}

	@Column(name = "FEEDBACK", length = 128)
	public String getFeedback() {
		return this.feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	@Column(name = "WTDID", length = 1000)
	public String getWtdid() {
		return this.wtdid;
	}

	public void setWtdid(String wtdid) {
		this.wtdid = wtdid;
	}

	@Column(name = "DLXHFSJ", length = 1000)
	public String getDlxhfsj() {
		return this.dlxhfsj;
	}

	public void setDlxhfsj(String dlxhfsj) {
		this.dlxhfsj = dlxhfsj;
	}

	@Column(name = "PASSWORD", length = 1000)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "PROJECTPUBLICITY", length = 400)
	public String getProjectpublicity() {
		return this.projectpublicity;
	}

	public void setProjectpublicity(String projectpublicity) {
		this.projectpublicity = projectpublicity;
	}

	@Column(name = "CONSTRU_STATUS", precision = 22, scale = 0)
	public BigDecimal getConstruStatus() {
		return this.construStatus;
	}

	public void setConstruStatus(BigDecimal construStatus) {
		this.construStatus = construStatus;
	}

	@Column(name = "SURVEY_STATUS", precision = 22, scale = 0)
	public BigDecimal getSurveyStatus() {
		return this.surveyStatus;
	}

	public void setSurveyStatus(BigDecimal surveyStatus) {
		this.surveyStatus = surveyStatus;
	}

	@Column(name = "INVEST_STATUS", precision = 22, scale = 0)
	public BigDecimal getInvestStatus() {
		return this.investStatus;
	}

	public void setInvestStatus(BigDecimal investStatus) {
		this.investStatus = investStatus;
	}

	@Column(name = "COMMIT_STATUS", precision = 22, scale = 0)
	public BigDecimal getCommitStatus() {
		return this.commitStatus;
	}

	public void setCommitStatus(BigDecimal commitStatus) {
		this.commitStatus = commitStatus;
	}

	@Column(name = "RETURN_STATUS", precision = 22, scale = 0)
	public BigDecimal getReturnStatus() {
		return this.returnStatus;
	}

	public void setReturnStatus(BigDecimal returnStatus) {
		this.returnStatus = returnStatus;
	}

	@Column(name = "HEADER_ID", length = 64)
	public String getHeaderId() {
		return this.headerId;
	}

	public void setHeaderId(String headerId) {
		this.headerId = headerId;
	}

	@Column(name = "PAGE", precision = 10, scale = 0)
	public Long getPage() {
		return this.page;
	}

	public void setPage(Long page) {
		this.page = page;
	}

	@Column(name = "FNAME", length = 510)
	public String getFname() {
		return this.fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	@Column(name = "LABEL", length = 510)
	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Column(name = "XMLX", length = 510)
	public String getXmlx() {
		return this.xmlx;
	}

	public void setXmlx(String xmlx) {
		this.xmlx = xmlx;
	}

	@Column(name = "ZGDW", length = 510)
	public String getZgdw() {
		return this.zgdw;
	}

	public void setZgdw(String zgdw) {
		this.zgdw = zgdw;
	}

}