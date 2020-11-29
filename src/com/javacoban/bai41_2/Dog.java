package com.javacoban.bai41_2;

import com.javacoban.bai41.Animal;

public class Dog extends Animal {

	public void thongTinDog() {
		// ten = "Dog"; private khong the truy cap duoc khi khac class
		tuoi = 12;
		noiSinhSong = "Cu Chi";
		// diaChi = "TPHCM"; default khac package khong the ke thua

		// anUong(); do la ham private nen chi duoc dung trong class cha
		diLai(); // do la ham protected nen duoc dung trong subclass khac package
		// daoChoi(); do la ham default nen khac package khong dung duoc
	}

}
