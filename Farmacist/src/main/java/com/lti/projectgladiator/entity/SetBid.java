package com.lti.projectgladiator.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class SetBid {
	
	@Id
	@GeneratedValue
	@Column(name="set_bid_id")
	private int setBidId;
	@Column(name="crop_type")
	private String cropType;
	@Column(name="crop_name")
	private String cropName;
	@Column(name="fertilizer_type")
	private String fertilizerType;
	@Column(name="quantity")
	private int quantity;
	
	//relationships
	@ManyToOne
	@JoinColumn(name="f_id")
	private FarmerInfo farmerInfo;
	
	
	public int getSetBidId() {
		return setBidId;
	}

	public void setSetBidId(int setBidId) {
		this.setBidId = setBidId;
	}

	public String getCropType() {
		return cropType;
	}

	public void setCropType(String cropType) {
		this.cropType = cropType;
	}

	public String getCropName() {
		return cropName;
	}

	public void setCropName(String cropName) {
		this.cropName = cropName;
	}

	public String getFertilizerType() {
		return fertilizerType;
	}

	public void setFertilizerType(String fertilizerType) {
		this.fertilizerType = fertilizerType;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public FarmerInfo getFarmerInfo() {
		return farmerInfo;
	}

	public void setFarmerInfo(FarmerInfo farmerInfo) {
		this.farmerInfo = farmerInfo;
	}

	

}
