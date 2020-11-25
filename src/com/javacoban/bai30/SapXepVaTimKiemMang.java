package com.javacoban.bai30;

import java.util.Scanner;

public class SapXepVaTimKiemMang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhap phan tu vao mang : ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		System.out.println("Mang vua nhap vo la: ");
		for(int i : arr) {
			System.out.print(i);
			System.out.print(" ");
		}
		
		System.out.println("\n ==========================");
		
		//Sap xep nguoc
		int temp;
		for(int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[j] > arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("Mang vua sap xep duoc la: ");
		for(int i : arr) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n=============================");
		
		//Sap xep xuoi
		for(int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("Mang vua sap xep duoc la: ");
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}

}
