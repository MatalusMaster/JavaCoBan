package com.javacoban.bai42;

public class Employee extends Person {

	public void xuatTen() {
		this.ten = "Employee";
		System.out.println("Ten cua class la " + this.ten);

		super.xuatTen();
		super.ten = "Sang";
		this.ten = "Hoi";
	}
}
