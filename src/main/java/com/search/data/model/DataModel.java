package com.search.data.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/*import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;*/



/*
 * @AllArgsConstructor
 * 
 * @NoArgsConstructor
 * 
 * @Data
 */
@Entity
public class DataModel {

	// Data attributes

	@Id
	private Integer id;
	private String name;
	private String number;
	private String emailId;
	private String panCard;
	private String aadharCard;
	private String drivingLicence;
	private String bplId;
	private String address;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPanCard() {
		return panCard;
	}

	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

	public String getAadharCard() {
		return aadharCard;
	}

	public void setAadharCard(String aadharCard) {
		this.aadharCard = aadharCard;
	}

	public String getDrivingLicence() {
		return drivingLicence;
	}

	public void setDrivingLicence(String drivingLicence) {
		this.drivingLicence = drivingLicence;
	}

	public String getBplId() {
		return bplId;
	}

	public void setBplId(String bplId) {
		this.bplId = bplId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

	public DataModel() {
		super();
	}

	/**
	 * This Constructor to initialize only 1 parameters
	 */
	public DataModel(String panCard) {
		super();
		this.panCard = panCard;
	}

	/**
	 * This Constructor to initialize only 2 parameters
	 */
	public DataModel(String panCard, String aadharCard) {
		super();
		this.panCard = panCard;
		this.aadharCard = aadharCard;
	}

}

