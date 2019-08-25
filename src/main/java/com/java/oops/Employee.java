package com.java.oops;

public class Employee {

	public String companyName;
	private int age = 20;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 65) {
			System.out.println("Age must be less than or equal to 65");
		} else if (age < 18) {
			System.out.println("Age must be greater than or equal to 18");
		} else {
			this.age = age;
			System.out.println("employee age updated:" + age);
		}
	}
}
