package com.javacoban.bai45;

public class Person {
	private String ten;
	private Address address;

	public Person() {

	}

	public Person(String ten) {
		super();
		this.ten = ten;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
