package com.javacoban.bai45;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] emps = new Employee[3];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Vui long nhap vao thong tin cua 3 nhan vien");
		
		for(int i = 0; i < emps.length; i++) {
			String tenDuong = scanner.nextLine();
			String ten = scanner.nextLine();
			double luong = scanner.nextDouble();
			
			Address address = new Address(tenDuong);
			Employee emp = new Employee(ten,luong);
			emp.setAddress(address);
			
			emps[i] = emp;
			
			//Xoa bo nho dem
			scanner.nextLine();
		}
		
		System.out.println("Thong tin nhan vien nhap vao: ");
		for(Employee emp : emps) {
			System.out.println(emp.getTen() + " " + emp.getAddress().getTenDuong() + " " + emp.getLuong());
		}
	}

}
