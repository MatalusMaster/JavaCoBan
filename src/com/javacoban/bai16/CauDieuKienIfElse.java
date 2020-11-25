package com.javacoban.bai16;

import java.util.Scanner;

public class CauDieuKienIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Vui long nhap gia tri cua x: ");
		int x = scanner.nextInt();
	
		if(x > 5) {
			System.out.println("X lon hon 5");
		} else {
			if(x == 5) {
				System.out.println("X bang 5");
			} else {
				System.out.println("X nho hon 5");
			}
		}
		
		System.out.println("Vui long nhap gia tri cua y: ");
		int y = scanner.nextInt();
		
		if (y == 5) {
			System.out.println("y bang 5");
		} else {
			if (y > 5) {
				System.out.println("y lon hon 5");
			} else {
				System.out.println("y nho hon 5");
			}
		}
	}

}
