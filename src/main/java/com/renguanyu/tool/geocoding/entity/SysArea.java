package com.renguanyu.tool.geocoding.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * SysArea entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "SYS_AREA", schema = "UAMS")
@DynamicUpdate(true)
@DynamicInsert(true)
public class SysArea implements java.io.Serializable {

	// Fields

	private String id;
	private String parentId;
	private String parentIds;
	private String name;
	private Long sort;
	private String code;
	private String type;
	private String createBy;
	private Timestamp createDate;
	private String updateBy;
	private Timestamp updateDate;
	private String remarks;
	private String delFlag;
	private String shortName;
	private String cityCode;
	private String zipCode;
	private String mergerName;
	private String lng;
	private String lat;
	private String pinyin;
	private BigDecimal provinceid;
	private BigDecimal municipalityid;
	private String provincename;
	private String municipalityname;

	// Constructors

	/** default constructor */
	public SysArea() {
	}

	/** minimal constructor */
	public SysArea(String parentId, String name) {
		this.parentId = parentId;
		this.name = name;
	}

	/** full constructor */
	public SysArea(String parentId, String parentIds, String name, Long sort,
			String code, String type, String createBy, Timestamp createDate,
			String updateBy, Timestamp updateDate, String remarks,
			String delFlag, String shortName, String cityCode, String zipCode,
			String mergerName, String lng, String lat, String pinyin,
			BigDecimal provinceid, BigDecimal municipalityid,
			String provincename, String municipalityname) {
		this.parentId = parentId;
		this.parentIds = parentIds;
		this.name = name;
		this.sort = sort;
		this.code = code;
		this.type = type;
		this.createBy = createBy;
		this.createDate = createDate;
		this.updateBy = updateBy;
		this.updateDate = updateDate;
		this.remarks = remarks;
		this.delFlag = delFlag;
		this.shortName = shortName;
		this.cityCode = cityCode;
		this.zipCode = zipCode;
		this.mergerName = mergerName;
		this.lng = lng;
		this.lat = lat;
		this.pinyin = pinyin;
		this.provinceid = provinceid;
		this.municipalityid = municipalityid;
		this.provincename = provincename;
		this.municipalityname = municipalityname;
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

	@Column(name = "PARENT_ID", nullable = false, length = 64)
	public String getParentId() {
		return this.parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	@Column(name = "PARENT_IDS", length = 2000)
	public String getParentIds() {
		return this.parentIds;
	}

	public void setParentIds(String parentIds) {
		this.parentIds = parentIds;
	}

	@Column(name = "NAME", nullable = false)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "SORT", precision = 10, scale = 0)
	public Long getSort() {
		return this.sort;
	}

	public void setSort(Long sort) {
		this.sort = sort;
	}

	@Column(name = "CODE", length = 100)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "TYPE", length = 1)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "CREATE_BY", length = 64)
	public String getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	@Column(name = "CREATE_DATE", length = 11)
	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	@Column(name = "UPDATE_BY", length = 64)
	public String getUpdateBy() {
		return this.updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	@Column(name = "UPDATE_DATE", length = 11)
	public Timestamp getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}

	@Column(name = "REMARKS")
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

	@Column(name = "SHORT_NAME", length = 64)
	public String getShortName() {
		return this.shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	@Column(name = "CITY_CODE", length = 10)
	public String getCityCode() {
		return this.cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	@Column(name = "ZIP_CODE", length = 10)
	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Column(name = "MERGER_NAME")
	public String getMergerName() {
		return this.mergerName;
	}

	public void setMergerName(String mergerName) {
		this.mergerName = mergerName;
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

	@Column(name = "PINYIN", length = 32)
	public String getPinyin() {
		return this.pinyin;
	}

	public void setPinyin(String pinyin) {
		this.pinyin = pinyin;
	}

	@Column(name = "PROVINCEID", precision = 38, scale = 0)
	public BigDecimal getProvinceid() {
		return this.provinceid;
	}

	public void setProvinceid(BigDecimal provinceid) {
		this.provinceid = provinceid;
	}

	@Column(name = "MUNICIPALITYID", precision = 38, scale = 0)
	public BigDecimal getMunicipalityid() {
		return this.municipalityid;
	}

	public void setMunicipalityid(BigDecimal municipalityid) {
		this.municipalityid = municipalityid;
	}

	@Column(name = "PROVINCENAME", length = 32)
	public String getProvincename() {
		return this.provincename;
	}

	public void setProvincename(String provincename) {
		this.provincename = provincename;
	}

	@Column(name = "MUNICIPALITYNAME", length = 32)
	public String getMunicipalityname() {
		return this.municipalityname;
	}

	public void setMunicipalityname(String municipalityname) {
		this.municipalityname = municipalityname;
	}

}