package com.javacoban.bai18;

public class ToanTuDieuKien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tong = 0;
		int x = 10;
		tong = (x > 5) ? (tong + 1) : (tong - 1);
		String s = (tong > 1) ? "Tui la Sang" : "Tui la Hoi";
		
		System.out.println("tong la: " + tong);
		System.out.println("Chuoi s la : "  + s);
	}	

}
