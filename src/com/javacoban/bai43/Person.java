package com.javacoban.bai43;

public class Person {
	private String ten;
	private DiaChi diaChi; // HAS-A, moi person HAS A mot dia chi
//
//	public Person() {
//
//	}

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

	public DiaChi getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(DiaChi diaChi) {
		this.diaChi = diaChi;
	}

}
