package com.javacoban.bai53;

public abstract class Employee extends Person {

	@Override
	public double luong() {
		System.out.println("Luong nhan vien");
		return 0;
	}

	// Person p = new Employee(); => Neu employee cung la 1 class abstract thi khong
	// the tao 1 object bang tu khoa new

}
