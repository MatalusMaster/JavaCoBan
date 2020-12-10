package com.javacoban.bai44;

public class SuperClass {
	public int tinhTongHaiSo(int a, int b) {
		return a + b;
	}

	// overload method là những phương thức có tên giống nhau, có đối số truyền vào
	// khác nhau
	public long tinhTongHaiSo(int a, long b) {
		return a + b;
	}

	public float tinhTongHaiSo(float a, float b) {
		return a + b;
	}

	public float tinhTongHaiSo(float a) {
		return a + 10;
	}

	public static void main(String[] args) {
		SuperClass superClass = new SuperClass();
		superClass.tinhTongHaiSo(10.1f, 10.2f);
		superClass.tinhTongHaiSo(5, 5);
		superClass.tinhTongHaiSo(5f);

	}
}
