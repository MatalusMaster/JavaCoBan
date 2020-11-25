package com.javacoban.bai15;

import java.util.Scanner;

public class CauDieuKienIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhap gia tri cua x: ");
		int x = scanner.nextInt();
		
		if(x > 5) {
			System.out.println("x lon hon 5");
		}
		
		if(x == 5) {
			System.out.println("x bang 5");
		}
		
		if(x < 5) {
			System.out.println("x nho hon 5");
		}
		
		System.out.println("Ket thuc");
	}

}
