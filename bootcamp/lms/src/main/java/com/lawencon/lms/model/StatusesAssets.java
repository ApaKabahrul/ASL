package com.lawencon.lms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.lawencon.base.BaseEntity;

@Entity
@Table(name = "statuses_assets")
public class StatusesAssets extends BaseEntity {

	@Column(name = "statuses_assets_code", length = 5, nullable = false)
	private String statusesAssetsCode;

	@Column(name = "statuses_assets_name", length = 15, nullable = false)
	private String statusesAssetsName;

	public String getStatusesAssetsCode() {
		return statusesAssetsCode;
	}

	public void setStatusesAssetsCode(String statusesAssetsCode) {
		this.statusesAssetsCode = statusesAssetsCode;
	}

	public String getStatusesAssetsName() {
		return statusesAssetsName;
	}

	public void setStatusesAssetsName(String statusesAssetsName) {
		this.statusesAssetsName = statusesAssetsName;
	}

}
