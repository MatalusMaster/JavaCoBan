package com.javacoban.bai40;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhanVien nhanVien = new NhanVien();
		
		nhanVien.ten = "Sang";
		nhanVien.luong = 8;
		nhanVien.diaChi = "Cu Chi";
		// ham
		nhanVien.setDiaChi("Cu Chi");
		nhanVien.setLuong(8);
		nhanVien.setTen("Sang");
		nhanVien.mucLuong();
		
	}

}
