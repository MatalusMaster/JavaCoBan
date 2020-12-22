package com.javacoban.bai51;

public class Person {
	private String ho;
	private String ten;

	public void setHoTen(String ho, String ten) {
		this.ten = ten;
		this.ho = ho;
	}

	public String getFullName() {
		return this.ten + " " + this.ho;
	}
}
