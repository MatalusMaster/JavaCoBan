package com.javacoban.bai25;

public class CauLenhBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			System.out.println("i = " + i);
			if (i == 2)
				break;
		}

		System.out.println("============================");

		int[] arr = { 1, 2, 3, 4, 5, 6 };
		for (int index = 0; index < arr.length; index++) {
			System.out.println("arr[" + index + "] = " + arr[index]);
			if (arr[index] == 4)
				break;
		}

		System.out.println("============================");

		int x = 2;
		switch (x) {
		case 2:
			System.out.println("x = " + x);
			break;
		}

		System.out.println("============================");

		for (int i = 0; i < 5; i++) {
			System.out.println("i = " + i);
			for (int j = 0; j < 5; j++) {
				System.out.println("j = " + j);
				if (j == 0)
					break;
			}
		}

	}

}
