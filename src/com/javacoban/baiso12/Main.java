package com.javacoban.baiso12;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float chieuDai = 12.5f;
		float chieuRong = 15.5f;
		float canhHinhVuong = 10f;
		float banKinh = 20f;
		
		System.out.println("Chu vi hinh chu nhat la : " + HinhChuNhat.chuVi(chieuDai, chieuRong)
							+ ", Va Dien tich hinh chu nhat la: " + HinhChuNhat.dienTich(chieuDai, chieuRong));
		
		System.out.println("Chu vi hinh vuong la: " + HinhVuong.chuVi(canhHinhVuong)
							+ ", Va dien tich hinh vuong la: " + HinhVuong.dienTich(canhHinhVuong));
		
		System.out.println("Chu vi hinh tron la: " + HinhTron.chuVi(banKinh)
							+ ", Va dien tich hinh tron la: " + HinhTron.dienTich(banKinh));
		
	}

}
