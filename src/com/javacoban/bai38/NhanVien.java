package com.javacoban.bai38;

public class NhanVien {
	private String ten;
	private int tuoi;
	private String diaChi;

	public NhanVien() {

	}

	public NhanVien(String ten, String diaChi, int tuoi) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.diaChi = diaChi;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

}
