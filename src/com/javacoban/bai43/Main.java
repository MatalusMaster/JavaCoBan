package com.javacoban.bai43;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		
		emp.setTen("Sang");
		emp.setDiaChi(null);
		
		DiaChi diaChi = new DiaChi();
		
		diaChi.setTenDuong("Nguyen Trai");
		emp.setDiaChi(diaChi);
		
		System.out.println(emp.getTen());
		System.out.println(emp.getDiaChi().getTenDuong());
	}

}
