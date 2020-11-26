package com.javacoban.bai33;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book();
		book1.setTen("Sach hoc lam giau");
		book1.setMoTa("De lam giau");
		book1.setPrice(112);
		
		Book book2 = new Book(4.5);
		System.out.println(book2.getPrice());
		System.out.println(book2.getTen());
		
		Book book3 = new Book("Sach hay","Sach hay lam luon");
		System.out.println(book3.getTen());
		
		Book book4 = new Book("Sach 4", "Sach so 4", 45.5);
		System.out.println(book4.getTen());
	}

}
