package com.lawencon.lms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.lawencon.base.BaseEntity;

@Entity
@Table(name = "companies")
public class Companies extends BaseEntity {

	@Column(name = "companies_code", length = 10, nullable = false)
	private String companiesCode;

	@Column(name = "companies_name", length = 255, nullable = false)
	private String companiesName;

	@Column(name = "companies_phone", nullable = false)
	private String companiesPhone;

	@Column(name = "companies_address", nullable = false)
	private String companiesAddress;

	public String getCompaniesCode() {
		return companiesCode;
	}

	public void setCompaniesCode(String companiesCode) {
		this.companiesCode = companiesCode;
	}

	public String getCompaniesName() {
		return companiesName;
	}

	public void setCompaniesName(String companiesName) {
		this.companiesName = companiesName;
	}

	public String getCompaniesPhone() {
		return companiesPhone;
	}

	public void setCompaniesPhone(String companiesPhone) {
		this.companiesPhone = companiesPhone;
	}

	public String getCompaniesAddress() {
		return companiesAddress;
	}

	public void setCompaniesAddress(String companiesAddress) {
		this.companiesAddress = companiesAddress;
	}

}
