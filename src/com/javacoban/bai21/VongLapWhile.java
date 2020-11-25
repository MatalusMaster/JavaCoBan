package com.javacoban.bai21;

public class VongLapWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		while (i < 5) {
			i++;
			System.out.println("i = " + i);
		}

		System.out.println("================");

		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int index = 0;
		while (index < arr.length) {
			System.out.println("arr[" + index + "] = " + arr[index]);
			index++;
		}
	}

}
