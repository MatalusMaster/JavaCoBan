package com.javacoban.bai19;

import java.util.Scanner;

import com.javacoban.baiso12.HinhChuNhat;
import com.javacoban.baiso12.HinhVuong;

public class MainMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Vui long chon che do tinh toan");
		System.out.println("1. Tinh chu vi va dien tich hinh vuong");
		System.out.println("2. Tinh chu vi va dien tich hinh chu nhat");

		int x = scanner.nextInt();
		switch (x) {
		case 1:
			System.out.println("Ban da chon tinh chu vi va dien tich hinh vuong. " + "Vui long nhap canh hinh vuong");
			float canhHinhVuong = scanner.nextFloat();
			System.out.println("Chu vi hinh vuong la: " + HinhVuong.chuVi(canhHinhVuong));
			System.out.println("Dien tich hinh vuong la: " + HinhVuong.dienTich(canhHinhVuong));
			break;
		case 2:
			System.out.println("Ban da chon tinh chu vi va dien tich hinh chu nhat."
					+ " Vui long nhap chieu dai va chieu rong hinh chu nhat");
			float chieuDai = scanner.nextFloat();
			float chieuRong = scanner.nextFloat();
			System.out.println("Chu vi hinh chu nhat la: " + HinhChuNhat.chuVi(chieuDai, chieuRong));
			System.out.println("Dien tich hinh chu nhat la: " + HinhChuNhat.dienTich(chieuDai, chieuRong));
			break;
		default: System.out.println(" Khong co lua chon nay");
		}
		
		System.out.println("Vui long chon che do tinh toan");
		System.out.println("1. Tinh chu vi va dien tich hinh vuong");
		System.out.println("2. Tinh chu vi va dien tich hinh chu nhat");

		int y = scanner.nextInt();
		// Menu bang if else
		if(y == 1) {
			System.out.println("Ban da chon tinh chu vi va dien tich hinh vuong. " + "Vui long nhap canh hinh vuong");
			float canhHinhVuong = scanner.nextFloat();
			System.out.println("Chu vi hinh vuong la: " + HinhVuong.chuVi(canhHinhVuong));
			System.out.println("Dien tich hinh vuong la: " + HinhVuong.dienTich(canhHinhVuong));
		} else if (y == 2) {
			System.out.println("Ban da chon tinh chu vi va dien tich hinh chu nhat."
					+ " Vui long nhap chieu dai va chieu rong hinh chu nhat");
			float chieuDai = scanner.nextFloat();
			float chieuRong = scanner.nextFloat();
			System.out.println("Chu vi hinh chu nhat la: " + HinhChuNhat.chuVi(chieuDai, chieuRong));
			System.out.println("Dien tich hinh chu nhat la: " + HinhChuNhat.dienTich(chieuDai, chieuRong));
		} else {
			System.out.println(" Khong co lua chon nay");
		}
	}

}
