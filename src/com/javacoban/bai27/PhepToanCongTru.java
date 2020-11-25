package com.javacoban.bai27;

public class PhepToanCongTru {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		i++;
		print(i);

		i--;
		print(i--);
		i++;
		print(i);
		i++;
		int tong = i + 6;
		print(tong);

		i = 5;
		int tru = --i + 6 + i--;
		print(tru);
	}

	public static void print(int i) {
		System.out.println(i);
	}

}
