package com.javacoban.bai44;

import sun.text.SupplementaryCharacterData;

public class SubClass extends SuperClass {
	// Annotation Override co the khong can vi no chi de danh dau day la method
	// override cua class cha thoi
	// Override method la no ghi de lai ham cua thang cha
	@Override
	public float tinhTongHaiSo(float a) {
		// TODO Auto-generated method stub
		return a + 20;
	}

	@Override
	public int tinhTongHaiSo(int a, int b) {
		return a + b + 20;
	}

	public static void main(String[] args) {
		SubClass subClass = new SubClass();
		System.out.println(subClass.tinhTongHaiSo(5));

		SuperClass superClass = new SuperClass();
		System.out.println(superClass.tinhTongHaiSo(5));
	}
}
