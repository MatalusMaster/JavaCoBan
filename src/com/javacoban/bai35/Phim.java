package com.javacoban.bai35;

public class Phim {
	public String tenPhim; // bien instance
	public static String giaPhim; // bien static

	public Phim() {
		int x = 0; // Bien local
	}

	// ham instance
	public void xemPhim() {
		String xem = "Xin Chao";
		System.out.println(xem);
	}

	// ham static
	public static void giaPhim() {
		System.out.println("");
	}
}
