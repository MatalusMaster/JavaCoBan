package com.javacoban.bai37;

public class HinhVuong {

	public void chuVi() {
		System.out.println("Chu vi");
	}

	public static void xinChao(HinhVuong hinhVuong) {
		String s = "Xin Chao"; // s trong stack, String trong heap
		System.out.println(s);
		hinhVuong.chuVi(); // chuVi() stack
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10; // trong stack
		System.out.println(x);
		HinhVuong hinhVuong = new HinhVuong();// hinhVuong trong stack, HinhVuong trong heap
		xinChao(hinhVuong); // xinChao() trong stack
	}

}
