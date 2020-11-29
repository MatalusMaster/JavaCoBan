package com.javacoban.bai40;

public class NhanVien extends Person {
	double luong;

	public double getLuong() {
		return luong;
	}

	public void setLuong(double luong) {
		this.luong = luong;
	}

	public void mucLuong() {
		System.out.println("Muc luong");
	}
}
