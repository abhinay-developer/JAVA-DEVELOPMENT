package com.abhi.sif;

public class SimpleIf {

	public int num1 = 10;

	public int num2 = 20;

	public void display() {
		// Simple If
		System.out.println(num1 > num2);
		if (num1 > num2) {
			System.out.println("The Num1 is:" + num1);
		} // end of if

		if (num2 > num1) {
			System.out.println(num2 > num1);
			System.out.println("The Num2 is::" + num2);
		} // end of if
	}// end of method

}// end of class
