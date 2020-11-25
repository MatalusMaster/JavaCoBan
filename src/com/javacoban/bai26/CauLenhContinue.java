package com.javacoban.bai26;

public class CauLenhContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 5; i++) {
			if(i <2) continue;
			System.out.println("i = " + i);
		}
		
		System.out.println("=======================");
		
		for(int i = 0; i < 5; i ++) {
			System.out.println("i = " + i);
			for(int j = 0; j < 5; j++) {
				if(j > 0) continue;
				System.out.println("j = " + j);
			}
		}
	}

}
