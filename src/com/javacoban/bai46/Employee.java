package com.javacoban.bai46;

public class Employee extends Person {
	private int soNamKinhNghiem;

	public Employee() {
		
	}
	
	public Employee(String ten, int soNamKinhNghiem) {
		super(ten);
		this.soNamKinhNghiem = soNamKinhNghiem;
	}

	public int getSoNamKinhNghiem() {
		return soNamKinhNghiem;
	}

	public void setSoNamKinhNghiem(int soNamKinhNghiem) {
		this.soNamKinhNghiem = soNamKinhNghiem;
	}
	
	@Override
	public double luong() {
		if(this.soNamKinhNghiem < 1) return super.luong()*1.5;
		else if(this.soNamKinhNghiem >=1 && this.soNamKinhNghiem < 3) return super.luong()*2;
		else return super.luong()*3;
	}
}
