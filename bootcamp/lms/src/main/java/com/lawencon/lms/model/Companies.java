package com.lawencon.lms.model;

import com.lawencon.base.BaseEntity;

public class Companies extends BaseEntity {
	private String companiesCode;
	private String companiesName;
	private String companiesPhone;
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
