package com.javacoban.bai52;

public abstract class Person {
	private String ten;

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

}
