package com.springdockerdemo.entity;

import java.util.Objects;

public class Employee {
	private String firstName;
	private String lastName;
	private String postion;
	private Address address;
	public Employee(String firstName, String lastName, String postion, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.postion = postion;
		this.address = address;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPostion() {
		return postion;
	}
	public void setPostion(String postion) {
		this.postion = postion;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, firstName, lastName, postion);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Employee)) {
			return false;
		}
		Employee other = (Employee) obj;
		return Objects.equals(address, other.address) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName) && Objects.equals(postion, other.postion);
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", postion=" + postion + ", address="
				+ address + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getPostion()=" + getPostion() + ", getAddress()=" + getAddress() + ", hashCode()=" + hashCode()
				+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}
	
}
