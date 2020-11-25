package com.javacoban.bai22;

public class VongLapDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		do {
			System.out.println("x = " + x);
			x++;
		} while (x < 5);

		System.out.println("====================");

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int index = 0;
		do {
			System.out.println("arr[" + index + "] = " + arr[index]);
			index++;
		} while (index < 5);
	}

}
