package com.joole.main.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@SuppressWarnings("serial")
@Entity
@Table(name = "product", catalog = "joole")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Product implements java.io.Serializable{
	public Integer productID;
	public String productName;
	public String productBrand;
	public String productSeries;
	public String productModelNumber;
	public String productUseType;
	public String productApplication;
	public String productYear;
	public String productCFM;
	public String productWatts;
	public String productSound;
	public String productDiameter;
	public String productMounting;
	public String productAccessories;
	public String productDetails;
	public String productContactName;
	public String productContactPhone;
	public String productContactEmail;
	public String productContactWeb;
	public String productContactDepartment;
	public String productContactPhone2;
	public String productContactEmail2;
	public String productContactWeb2;
	
	public Product() {
	}
	
	public Product(String productName, String productBrand, String productSeries, String productModelNumber, String productUseType, String productApplication, String productYear) {
		this.productName = productName;
		this.productBrand = productBrand;
		this.productSeries = productSeries;
		this.productModelNumber = productModelNumber;
		this.productUseType = productUseType;
		this.productApplication = productApplication;
		this.productYear = productYear;
	}
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "productID", unique = true, nullable = false)
	public Integer getProductID() {
		return this.productID;
	}
	public void setProductID(Integer productID) {
		this.productID = productID;
	}
	
	@Column(name = "productName", nullable = false, length = 255)
	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	@Column(name = "productBrand", nullable = false, length = 255)
	public String getProductBrand() {
		return this.productBrand;
	}
	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}
	
	@Column(name = "productSeries", nullable = false, length = 255)
	public String getProductSeries() {
		return this.productSeries;
	}
	public void setProductSeries(String productSeries) {
		this.productSeries = productSeries;
	}
	
	@Column(name = "productModelNumber", nullable = false, length = 255)
	public String getProductModelNumber() {
		return this.productModelNumber;
	}
	public void setProductModelNumber(String productModelNumber) {
		this.productModelNumber = productModelNumber;
	}
	
	@Column(name = "productUseType", nullable = false, length = 255)
	public String getProductUseType() {
		return this.productUseType;
	}
	public void setProductUseType(String productUseType) {
		this.productUseType = productUseType;
	}
	
	@Column(name = "productApplication", nullable = false, length = 255)
	public String getProductApplication() {
		return this.productApplication;
	}
	public void setProductApplication(String productApplication) {
		this.productApplication = productApplication;
	}
	
	@Column(name = "productYear", nullable = false, length = 255)
	public String getProductYear() {
		return this.productYear;
	}
	public void setProductYear(String productYear) {
		this.productYear = productYear;
	}
	
	@Column(name = "productCFM", nullable = false, length = 255)
	public String getProductCFM() {
		return this.productCFM;
	}
	public void setProductCFM(String productCFM) {
		this.productCFM = productCFM;
	}
	
	@Column(name = "productWatts", nullable = false, length = 255)
	public String getProductWatts() {
		return this.productWatts;
	}
	public void setProductWatts(String productWatts) {
		this.productWatts = productWatts;
	}
	
	@Column(name = "productSound", nullable = false, length = 255)
	public String getProductSound() {
		return this.productSound;
	}
	public void setProductSound(String productSound) {
		this.productSound = productSound;
	}
	
	@Column(name = "productDiameter", nullable = false, length = 255)
	public String getProductDiameter() {
		return this.productDiameter;
	}
	public void setProductDiameter(String productDiameter) {
		this.productDiameter = productDiameter;
	}
	
	@Column(name = "productMounting", nullable = false, length = 255)
	public String getProductMounting() {
		return this.productMounting;
	}
	public void setProductMounting(String productMounting) {
		this.productMounting = productMounting;
	}
	
	@Column(name = "productAccessories", nullable = false, length = 255)
	public String getProductAccessories() {
		return this.productAccessories;
	}
	public void setProductAccessories(String productAccessories) {
		this.productAccessories = productAccessories;
	}
	
	@Column(name = "productDetails", nullable = false, length = 10000)
	public String getProductDetails() {
		return this.productDetails;
	}
	public void setProductDetails(String productDetails) {
		this.productDetails = productDetails;
	}
	
	@Column(name = "productContactName", nullable = false, length = 255)
	public String getProductContactName() {
		return this.productContactName;
	}
	public void setProductContactName(String productContactName) {
		this.productContactName = productContactName;
	}
	
	@Column(name = "productContactPhone", nullable = false, length = 255)
	public String getProductContactPhone() {
		return this.productContactPhone;
	}
	public void setProductContactPhone(String productContactPhone) {
		this.productContactPhone = productContactPhone;
	}
	
	@Column(name = "productContactEmail", nullable = false, length = 255)
	public String getProductContactEmail() {
		return this.productContactEmail;
	}
	public void setProductContactEmail(String productContactEmail) {
		this.productContactEmail = productContactEmail;
	}
	
	@Column(name = "productContactWeb", nullable = false, length = 255)
	public String getProductContactWeb() {
		return this.productContactWeb;
	}
	public void setProductContactWeb(String productContactWeb) {
		this.productContactWeb = productContactWeb;
	}
	
	@Column(name = "productContactDepartment", nullable = false, length = 255)
	public String getProductContactDepartment() {
		return this.productContactDepartment;
	}
	public void setProductContactDepartment(String productContactDepartment) {
		this.productContactDepartment = productContactDepartment;
	}
	
	@Column(name = "productContactPhone2", nullable = false, length = 255)
	public String getProductContactPhone2() {
		return this.productContactPhone2;
	}
	public void setProductContactPhone2(String productContactPhone2) {
		this.productContactPhone2 = productContactPhone2;
	}
	
	@Column(name = "productContactEmail2", nullable = false, length = 255)
	public String getProductContactEmail2() {
		return this.productContactEmail2;
	}
	public void setProductContactEmail2(String productContactEmail2) {
		this.productContactEmail2 = productContactEmail2;
	}
	
	@Column(name = "productContactWeb2", nullable = false, length = 255)
	public String getProductContactWeb2() {
		return this.productContactWeb2;
	}
	public void setProductContactWeb2(String productContactWeb2) {
		this.productContactWeb2 = productContactWeb2;
	}
}
