package com.javacoban.bai38;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mang = new int[5];

		NhanVien[] nhanViens = new NhanVien[3];

		Scanner scanner = new Scanner(System.in);
		System.out.println("Vui long nhap thong tin nhan vien: ");
		for (int i = 0; i < nhanViens.length; i++) {
			String ten = scanner.nextLine();
			String diaChi = scanner.nextLine();
			int tuoi = scanner.nextInt();

			nhanViens[i] = new NhanVien(ten, diaChi, tuoi);

			// Xoa bo nho dem
			scanner.nextLine();
		}

		System.out.println("Danh sach nhan vien vua nhap la: ");
		for (NhanVien nhanVien : nhanViens) {
			System.out.println(nhanVien.getTen() + " " + nhanVien.getTuoi() + " " + nhanVien.getDiaChi());
		}
	}

}
