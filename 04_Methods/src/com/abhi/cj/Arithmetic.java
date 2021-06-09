package com.abhi.cj;

public class Arithmetic {

	// Method With return type with parameters

	public int add1(int num1, int num2) {

		int result = num1 + num2;
		System.out.println("\nMethod With return type with parameters");
		System.out.print("\nThe Addition is::" + result);
		return result;
	}

	// Method with return type without arguments/parameters

	public int add2() {
		int num1 = 10, num2 = 20, result;
		result = num1 + num2;
		System.out.println("\nMethod with return type without arguments/parameters");
		System.out.println("\nThe Addition is::" + result);
		return result;
	}

	// Method without return type with parameters

	public void add3(int num1, int num2) {
		int result = num1 + num2;
		System.out.println("\n Method without return type with parameters");
		System.out.println("\nThe Addition is::" + result);

	}

	// Method without return type without parameter
	public void add4() {
		int num1 = 10, num2 = 20, result;
		result = num1 + num2;
		System.out.println("\nMethod without return type without parameter");
		System.out.println("\nThe Addition is::" + result);

	}
}
