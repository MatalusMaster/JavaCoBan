package com.javacoban.bai34;

public class HinhChuNhat {

	public static int count = 0;

	public static float chuVi(float chieuDai, float chieuRong) {
		return 2 * (chieuDai + chieuRong);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(HinhChuNhat.count);

		count = count + 1;
		System.out.println(HinhChuNhat.count);

		HinhChuNhat hinh1 = new HinhChuNhat();
		HinhChuNhat hinh2 = new HinhChuNhat();

		hinh1.count = 2;
		System.out.println(HinhChuNhat.count);

		hinh2.count = 10;
		System.out.println(HinhChuNhat.count);

		System.out.println(HinhChuNhat.chuVi(12, 13));
		System.out.println(hinh1.chuVi(11, 12));
		System.out.println(hinh2.chuVi(15, 16));

	}

}
