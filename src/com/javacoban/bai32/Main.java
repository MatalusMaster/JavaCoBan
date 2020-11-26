package com.javacoban.bai32;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.setAge(25);
		p1.setTen("Sang");
		
		p2.setAge(25);
		p2.setTen("Hoi");
		
		System.out.println(p1.getTen() + " " + p1.getAge());
		System.out.println(p2.getTen() + " " + p2.getAge());
	}	

}
