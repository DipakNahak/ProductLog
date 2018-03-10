package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


/**
 * @author Dipak
 *
 */
@Entity
@Table(name="loc_tab1")
public class Location {
	@Id
	@Column(name="locId", length=10)
	@GenericGenerator(name = "sequence_loc_id", strategy = "com.app.util.LocationIdGenerator")
	@GeneratedValue(generator = "sequence_loc_id")  
	private String locId;

	private String locName;
	@Column(name="locType", length=10)
	private String locType;
	@Column(name="pincode", length=10)
	private String pincode;
	@Column(name="shippingType", length=10)
	private String shippingType;
	@Column(name="contactDetails", length=10)
	private String contactDetails;
	@Column(name="processCode", length=10)
	private String processCode;
	@Column(name="localTransport", length=10)
	private String localTransport;
	
	public String getLocId() {
		return locId;
	}
	public void setLocId(String locId) {
		this.locId = locId;
	}
	public String getLocName() {
		return locName;
	}
	public void setLocName(String locName) {
		this.locName = locName;
	}
	public String getLocType() {
		return locType;
	}
	public void setLocType(String locType) {
		this.locType = locType;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getShippingType() {
		return shippingType;
	}
	public void setShippingType(String shippingType) {
		this.shippingType = shippingType;
	}
	public String getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(String contactDetails) {
		this.contactDetails = contactDetails;
	}
	public String getProcessCode() {
		return processCode;
	}
	public void setProcessCode(String processCode) {
		this.processCode = processCode;
	}
	public String getLocalTransport() {
		return localTransport;
	}
	public void setLocalTransport(String localTransport) {
		this.localTransport = localTransport;
	}
	public Location(String locId, String locName, String locType, String pincode,
			String shippingType, String contactDetails, String processCode,
			String localTransport) {
		super();
		this.locId = locId;
		this.locName = locName;
		this.locType = locType;
		this.pincode = pincode;
		this.shippingType = shippingType;
		this.contactDetails = contactDetails;
		this.processCode = processCode;
		this.localTransport = localTransport;
	}
	public Location(String locId) {
		super();
		this.locId = locId;
	}
	@Override
	public String toString() {
		return "Location [locId=" + locId + ", locName=" + locName
				+ ", locType=" + locType + ", pincode=" + pincode
				+ ", shippingType=" + shippingType + ", contactDetails="
				+ contactDetails + ", processCode=" + processCode
				+ ", localTransport=" + localTransport + "]";
	}
	

}
