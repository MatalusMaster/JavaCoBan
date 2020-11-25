package com.javacoban.bai17;

import java.util.Scanner;

public class CauDieuKienSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Vui long nhap gia tri x : ");
		int x = scanner.nextInt();
		
		switch(x) {
		case 1: System.out.println(" x bang 1");
		break;
		case 2: System.out.println("x bang 2");
		break;
		case 3: System.out.println("x bang 3");
		break;
		default: System.out.println("x co gia tri deafult");
		}
	}

}
