package com.tut;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="student_Address")

public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="address_id")
	private int addressId;
	
	@Column(length = 50, name="Street")
	private String street;
	
	@Column(length = 30, name= "CITY")
	private String city;
	
	@Column(name="is_Open")
	private boolean isOpen;
	
	@Transient
	private double x;
	
	@Column(name="Added_Date")
	@Temporal(TemporalType.DATE)
	private Date addDate;
	
	
	
	public Address()
	{
		super();
	 }
	
	public Address(int addressId, String street, String city, boolean isOpen, double x, Date addDate) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.city = city;
		this.isOpen = isOpen;
		this.x = x;
		this.addDate = addDate;
	}

	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public boolean isOpen() {
		return isOpen;
	}
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public Date getAddDate() {
		return addDate;
	}
	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", street=" + street + ", city=" + city + ", isOpen=" + isOpen
				+ ", x=" + x + ", addDate=" + addDate + "]";
	}
	
	
	

}
