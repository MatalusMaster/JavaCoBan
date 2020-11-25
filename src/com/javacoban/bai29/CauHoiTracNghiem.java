package com.javacoban.bai29;

import java.util.Scanner;

public class CauHoiTracNghiem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Tui ten la gi? ");
			System.out.println("1. Tui ten la Hoi");
			System.out.println("2. Tui ten la Sang");
			System.out.println("q. thoat chuong trinh");

			String traLoi = scanner.nextLine();
			if (traLoi.equals("1")) {
				System.out.println("Tra loi sai cmnr");
				break;
			} else if (traLoi.equals("2")) {
				System.out.println("Ban tra loi dung roi do");
				break;
			} else if (traLoi.equals("q")) {
				System.out.println("Thoat");
				break;
			} else {
				System.out.println("Vui long chon cau tra loi");
			}
		}

	}

}
