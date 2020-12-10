package com.javacoban.bai45;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] employees = new Employee[3];
		Scanner scanner = new Scanner(System.in);

		System.out.println("Vui long nhap thong tin cua 3 nhan vien");
		for (int i = 0; i < employees.length; i++) {
			String tenDuong = scanner.nextLine();
			String ten = scanner.nextLine();
			double luong = scanner.nextDouble();

			Address address = new Address(tenDuong);
			Employee emp = new Employee(ten, luong);
			emp.setAddress(address);
			employees[i] = emp;
			// Xoa bo nho diem cua ban phim
			scanner.nextLine();
		}

		System.out.println("Thong tin nhan vien da nhap vao la:");
		for (Employee emp : employees) {
			System.out.println(emp.getTen() + " " + emp.getAddress().getTenDuong() + " " + emp.getLuong());
		}
	}

}
