package com.lti.projectgladiator.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="F_BIDDER")
public class BidderInfo {

	//Personal Details
	@Id
	@GeneratedValue
	@Column(name="b_id")
	private int bid;
	@Column(name="b_name")
	private String bname;
	@Column(name="b_contactno")
	private long bcontactno;
	@Column(name="b_email")
	private String bemail;
	@Column(name="b_address")
	private String baddress;
	@Column(name="b_city")
	private String bcity;
	@Column(name="b_state")
	private String bstate;
	@Column(name="b_pincode")
	private int bpincode;
	
	//Account Details
	@Column(name="b_accno")
	private long baccno;
	@Column(name="b_ifsc")
	private String bifsc;
	
	//Verification Details
	@Column(name="b_aadhaar")
	private String baadhaar;
	@Column(name="b_pan")
	private String bpan;
	@Column(name="b_traderlicense")
	private String btraderlicense;
	
	//Create Login
	@Column(name="b_password")
	private String bpassword;
	
	
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBaadhaar() {
		return baadhaar;
	}
	public void setBaadhaar(String baadhaar) {
		this.baadhaar = baadhaar;
	}
	public String getBpan() {
		return bpan;
	}
	public void setBpan(String bpan) {
		this.bpan = bpan;
	}
	public String getBtraderlicense() {
		return btraderlicense;
	}
	public void setBtraderlicense(String btraderlicense) {
		this.btraderlicense = btraderlicense;
	}
	public String getBpassword() {
		return bpassword;
	}
	public void setBpassword(String bpassword) {
		this.bpassword = bpassword;
	}
	
	
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public long getBcontactno() {
		return bcontactno;
	}
	public void setBcontactno(long bcontactno) {
		this.bcontactno = bcontactno;
	}
	public String getBemail() {
		return bemail;
	}
	public void setBemail(String bemail) {
		this.bemail = bemail;
	}
	public String getBaddress() {
		return baddress;
	}
	public void setBaddress(String baddress) {
		this.baddress = baddress;
	}
	public String getBcity() {
		return bcity;
	}
	public void setBcity(String bcity) {
		this.bcity = bcity;
	}
	public String getBstate() {
		return bstate;
	}
	public void setBstate(String bstate) {
		this.bstate = bstate;
	}
	public int getBpincode() {
		return bpincode;
	}
	public void setBpincode(int bpincode) {
		this.bpincode = bpincode;
	}
	public long getBaccno() {
		return baccno;
	}
	public void setBaccno(long baccno) {
		this.baccno = baccno;
	}
	public String getBifsc() {
		return bifsc;
	}
	public void setBifsc(String bifsc) {
		this.bifsc = bifsc;
	}
	
	@Override
	public String toString() {
		return "BidderInfo [bname=" + bname + ", bcontactno=" + bcontactno + ", bemail=" + bemail + ", baddress="
				+ baddress + ", bcity=" + bcity + ", bstate=" + bstate + ", bpincode=" + bpincode + ", baccno=" + baccno
				+ ", bifsc=" + bifsc + ", baadhaar=" + baadhaar + ", bpan=" + bpan + ", btraderlicense="
				+ btraderlicense + ", bpassword=" + bpassword + "]";
	}
	
	
	
	
	
	
}
