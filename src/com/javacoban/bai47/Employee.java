package com.javacoban.bai47;

public class Employee extends Person {
	private double luong;

	public double getLuong() {
		return luong;
	}

	public void setLuong(double luong) {
		this.luong = luong;
	}

	@Override
	public void thongTin() {
		System.out.println("Class con");
	}

}
