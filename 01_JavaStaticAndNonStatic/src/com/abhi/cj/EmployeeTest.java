package com.abhi.cj;

public class EmployeeTest {

	public static void main(String[] args) {
		/* We Need Not To Create Object for Static Feilds */
		Employee.name = "Raja";
		Employee.email = "raja@gmail.com";
		Employee.password = "Raja@9900";
		Employee.mobileNumber = 8885556565L;
		/* Display the Values */
		System.out.println("The Name ::" + Employee.name);
		System.out.println("The Email::" + Employee.email);
		System.out.println("The Password ::" + Employee.password);
		System.out.println("The Mobile Number::" + Employee.mobileNumber);

		/* Object creation for Non Static Variables */
		Employee employee = new Employee();

		employee.address = "12-14-856";
		employee.city = "Hyderbad";
		System.out.println("Employee::" + employee.address);
		System.out.println("City::" + employee.city);

	}
}
