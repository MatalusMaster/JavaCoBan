package com.javacoban.bai28;

import java.util.Scanner;

public class GiaiPhuongTrinhBac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ax^2 + bx + c = 0
		// a = 0 => x = -c/b
		// a != 0 => delta = b^2 - 4ac 
		// delta = 0 => x = -b/2a
		// delta < 0 => vo nghiem
		// delta > 0 => x = (-b + sqrt(delta))/2a and x = (-b - sqrt(delta))/2a
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Vui long nhap a,b,c :");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		
		if(a == 0) {
			System.out.println("Nghiem cua phuong trinh la " + -c/b);
		} else {
			double delta = b*b - 4*a*c;
			if(delta < 0) {
				System.out.println("Phuong trinh vo nghiem");
			} else if(delta == 0) {
				System.out.println("Phuong trinh co nghiem la " + -b/(2*a));
			} else {
				System.out.println("Phuong trinh co 2 nghiem :");
				System.out.println("x1 = " + (-b + Math.sqrt(delta))/(2*a));
				System.out.println("x2 = " + (-b - Math.sqrt(delta))/(2*a));
			}
		}
	}

}
