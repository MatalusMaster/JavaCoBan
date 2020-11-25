package com.javacoban.bai14;

import java.util.Scanner;

public class DocDuLieu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		System.out.println("Gia tri cua x la " + x);
		
		System.out.println("Vui long nhap gia tri cua y va z :");
		long y = scanner.nextLong();
		double z = scanner.nextDouble();
		double tong = z + y;
		System.out.println("Tong gia tri cua y va z la " + tong);
		
		boolean b = scanner.nextBoolean();
		short s = scanner.nextShort();
		String str = scanner.nextLine();
	}

}
