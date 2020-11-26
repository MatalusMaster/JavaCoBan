package com.javacoban.bai31;

public class Nguoi {
	String ten;
	int tuoi;
	String diaChi;
	
	public void diLai(String ten) {
		System.out.println(ten + " di qua di lai");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nguoi anhA = new Nguoi();
		Nguoi anhB = new Nguoi();
		
		anhA.diLai("anhA");
		anhB.diLai("anhB");
	}

}
