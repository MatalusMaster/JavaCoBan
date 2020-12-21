package com.javacoban.bai47;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();

		Person p = new Employee(); // Day la tinh da hinh trong java

		emp.setLuong(13);
		emp.setTen("Sang");

		p.setTen("Hoi");
		// p.setLuong(100); => khong dung duoc vi Person khong co ham setLuong =>
		// compile

		emp.thongTin();
		p.thongTin(); // RunTime tro den doi tuong con

		Person person = new Person();
		person.thongTin(); // tro den doi tuong cha

	}

}
