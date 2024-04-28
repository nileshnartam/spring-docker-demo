package com.springdockerdemo.entity;

import java.util.Objects;

public class Address {
	private String addressLine1;
	private String addressLine2;
	private String country;
	private String state;
	private String postalCode;
	public Address(String addressLine1, String addressLine2, String country, String state, String postalCode) {
		super();
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.country = country;
		this.state = state;
		this.postalCode = postalCode;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	@Override
	public int hashCode() {
		return Objects.hash(addressLine1, addressLine2, country, postalCode, state);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(addressLine1, other.addressLine1) && Objects.equals(addressLine2, other.addressLine2)
				&& Objects.equals(country, other.country) && Objects.equals(postalCode, other.postalCode)
				&& Objects.equals(state, other.state);
	}
	@Override
	public String toString() {
		return "Address [addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", country=" + country
				+ ", state=" + state + ", postalCode=" + postalCode + ", getAddressLine1()=" + getAddressLine1()
				+ ", getAddressLine2()=" + getAddressLine2() + ", getCountry()=" + getCountry() + ", getState()="
				+ getState() + ", getPostalCode()=" + getPostalCode() + ", hashCode()=" + hashCode() + ", getClass()="
				+ getClass() + ", toString()=" + super.toString() + "]";
	}
	
}
