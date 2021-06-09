package com.abhi.cj;

import java.util.Scanner;

public class ArithmeticApp {

	public static void main(String[] args) {
		// Taking Input From the Console
		// Scanner is a Predefined Class
		// Creating Object for Scanner Class
		Scanner sc = new Scanner(System.in);//Pre defined Class Object creation
		Arithmetic arithmetic = new Arithmetic();

		System.out.println("Enter number num1");
		//sc.nextInt() Predefined method of Scanner Class
		int x = sc.nextInt();// To Go Cursor To NextLine
		System.out.println("The Enterd Num1 Value::" + x);
		System.out.println("Enter number num2");
		int y = sc.nextInt();
		System.out.println("The Enterd Num2 Value::" + y);

		arithmetic.add(x, y);

	}//end of main

}//end of class
