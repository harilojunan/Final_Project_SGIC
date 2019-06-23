package com.sgic.internal.product.controller.dto;

public class ProductData {
	
	// DTO Entity table
	Long productRegiId; 
	String productCompName;
	String productAbbr;
	String productLicenseName;
	String produtLicensePeriod;
	String produtItAdminName;
	String productStartDate;
	String productEndDate;
	String productDescribtion;
	
	// DTO getter setter 
	public Long getProductRegiId() {
		return productRegiId;
	}
	
	public void setProductRegiId(Long productRegiId) {
		this.productRegiId = productRegiId;
	}
	
	public String getProductCompName() {
		return productCompName;
	}
	
	public void setProductCompName(String productCompName) {
		this.productCompName = productCompName;
	}
	
	public String getProductAbbr() {
		return productAbbr;
	}
	
	public void setProductAbbr(String productAbbr) {
		this.productAbbr = productAbbr;
	}
	
	public String getProductLicenseName() {
		return productLicenseName;
	}
	
	public void setProductLicenseName(String productLicenseName) {
		this.productLicenseName = productLicenseName;
	}
	
	public String getProdutLicensePeriod() {
		return produtLicensePeriod;
	}
	
	public void setProdutLicensePeriod(String produtLicensePeriod) {
		this.produtLicensePeriod = produtLicensePeriod;
	}
	
	public String getProdutItAdminName() {
		return produtItAdminName;
	}
	
	public void setProdutItAdminName(String produtItAdminName) {
		this.produtItAdminName = produtItAdminName;
	}
	
	public String getProductStartDate() {
		return productStartDate;
	}
	
	public void setProductStartDate(String productStartDate) {
		this.productStartDate = productStartDate;
	}
	
	public String getProductEndDate() {
		return productEndDate;
	}
	
	public void setProductEndDate(String productEndDate) {
		this.productEndDate = productEndDate;
	}
	
	public String getProductDescribtion() {
		return productDescribtion;
	}
	
	public void setProductDescribtion(String productDescribtion) {
		this.productDescribtion = productDescribtion;
	}
	
}
