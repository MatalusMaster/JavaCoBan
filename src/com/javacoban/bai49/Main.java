package com.javacoban.bai49;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long x = 10;
		int i = (int) x;

		// Dung tinh da hinh tro ve 1 doi tuong
		Worker w = new Worker();
		Employee e = new Worker();
		Person p = new Worker();
		Object ob = new Object();

		w.luong();
		Worker k1 = (Worker) e; // ep kieu xuong de goi ham class con
		k1.luong();
		((Worker) p).luong();
		((Employee) ob).toString();
	}

}
