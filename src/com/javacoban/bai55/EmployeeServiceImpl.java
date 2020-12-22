package com.javacoban.bai55;

public class EmployeeServiceImpl implements EmployeeService, AnimalService {

	@Override
	public void luong() {
		// TODO Auto-generated method stub
		System.out.println("O class EmployeeServiceImpl");
	}

	@Override
	public void them() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sua() {
		// TODO Auto-generated method stub
		System.out.println("O class EmployeeServiceImpl");
	}

	@Override
	public void xoa() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		EmployeeService emp = new EmployeeServiceImpl();

		AnimalService ani = new EmployeeServiceImpl();

		emp.luong();

		ani.sua();
	}

}
