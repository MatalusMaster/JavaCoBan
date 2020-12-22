package com.javacoban.bai50;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		
		if(p instanceof Worker) {
			System.out.println("La Worker");
		} else {
			System.out.println("Khong phai Worker");
		}
		
		Person p2 = new Worker();
		if(p2 instanceof Worker) {
			System.out.println("p2 la con cua Worker");
		}
		
		if(p2 instanceof Employee) {
			System.out.println("p2 la con cua Employee");
		}
		
		if(p2 instanceof Person) {
			System.out.println("p2 la con cua Person");
		}
		
		Employee emp = new Worker();
		if(emp instanceof Person) {
			System.out.println("emp la con cua Person");
		} else {
			System.out.println("emp khong phai la con cua Person");
		}
	}

}
