package com.lawencon.lms.model;

import java.math.BigInteger;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.lawencon.base.BaseEntity;

@Entity
@Table(name = "invoices")
public class Invoices extends BaseEntity {

	@Column(name = "invoices_code", length = 10, nullable = false)
	private String invoicesCode;

	@Column(name = "invoices_date", nullable = false)
	private LocalDateTime invoicesDate;

	@Column(name = "store_name", length = 50, nullable = false)
	private String storeName;

	@Column(name = "price", nullable = false)
	private BigInteger price;

	public String getInvoicesCode() {
		return invoicesCode;
	}

	public void setInvoicesCode(String invoicesCode) {
		this.invoicesCode = invoicesCode;
	}

	public LocalDateTime getInvoicesDate() {
		return invoicesDate;
	}

	public void setInvoicesDate(LocalDateTime invoicesDate) {
		this.invoicesDate = invoicesDate;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public BigInteger getPrice() {
		return price;
	}

	public void setPrice(BigInteger price) {
		this.price = price;
	}

}
