package com.javacoban.bai13;

import com.javacoban.baiso12.HinhChuNhat;
import com.javacoban.baiso12.HinhVuong;

public class MainPackageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float chieuRong = 12f;
		float chieuDai = 14f;
		float canhHinhVuong = 15f;
		
		System.out.println("Chu vi hinh chu nhat = " + HinhChuNhat.chuVi(chieuDai, chieuRong));
		System.out.println("Chu vi hinh vuong = " + HinhVuong.chuVi(canhHinhVuong));
	}

}
