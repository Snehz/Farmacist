package com.lti.projectgladiator.dto;

import org.springframework.web.multipart.MultipartFile;

public class BidderInfoDTO {

	private int id;
	private String username;
	private long contactno;
	private String email;
	private String addressline;
	private String city;
	private String state;
	private int pincode;
	
	//Account Details
	private long accountno;
	private String ifsccode;
	
	//Verification Details
	/*
	 * private MultipartFile btnaadhar; private MultipartFile btnpan; private
	 * MultipartFile btntrade;
	 */
	//Create Login
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public long getContactno() {
		return contactno;
	}

	public void setContactno(long contactno) {
		this.contactno = contactno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddressline() {
		return addressline;
	}

	public void setAddressline(String addressline) {
		this.addressline = addressline;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public long getAccountno() {
		return accountno;
	}

	public void setAccountno(long accountno) {
		this.accountno = accountno;
	}

	public String getIfsccode() {
		return ifsccode;
	}

	public void setIfsccode(String ifsccode) {
		this.ifsccode = ifsccode;
	}

	/*
	 * public MultipartFile getBtnaadhar() { return btnaadhar; }
	 * 
	 * public void setBtnaadhar(MultipartFile btnaadhar) { this.btnaadhar =
	 * btnaadhar; }
	 * 
	 * public MultipartFile getBtnpan() { return btnpan; }
	 * 
	 * public void setBtnpan(MultipartFile btnpan) { this.btnpan = btnpan; }
	 * 
	 * public MultipartFile getBtntrade() { return btntrade; }
	 */

	/*
	 * public void setBtntrade(MultipartFile btntrade) { this.btntrade = btntrade; }
	 */

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

}
