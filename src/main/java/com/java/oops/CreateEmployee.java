package com.java.oops;

public class CreateEmployee {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.setAge(25);
		
		System.out.println(emp1.getAge());

		Tester t1 = new Tester();
		System.out.println(t1.getAge());
		t1.companyName = "HSBC";
		
	}

}
