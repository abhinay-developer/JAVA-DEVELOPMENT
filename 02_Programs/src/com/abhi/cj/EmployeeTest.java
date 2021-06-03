package com.abhi.cj;

public class EmployeeTest {

	// cntrl+shift+f
	public static void main(String[] args) {

		displayEmployeeDetails();
	}

	public static void displayEmployeeDetails() {
		Employee employee = new Employee();
		employee.employeeId = 1001100L;
		employee.name = "virat";
		employee.age = 34;
		employee.email="virat@gmail.com";
		employee.gender = "male";
		employee.address = "Delhi";
		

		System.out.println("\nId:" + employee.employeeId + "\nName::" + employee.name + "\nAge:" + employee.age
				+"\nEmail::" + employee.email + "\nAge:"		+ "\nGender:" + employee.gender + "\nAddress::" + employee.address);

		Employee employee1 = new Employee();

		employee1.employeeId = 1001101L;
		employee1.name = "Sachin";
		employee1.age = 40;
		employee1.gender = "male";
		employee1.address = "Mumbai";
		System.out.println("\nId:" + employee1.employeeId + "\nName::" + employee1.name + "\nAge:" + employee1.age
				+ "\nGender:" + employee1.gender + "\nAddress::" + employee1.address);
	}

}
