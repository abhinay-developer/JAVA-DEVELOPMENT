package com.abhi.nif;

public class NestedIf {

	public int age = 18;
	public int weight = 100;

	public void display() {
         System.out.println(age>=18);
		if (age>=18) {//true

			System.out.println(weight>=55);
			if (weight>=55) {
				System.out.println("You are Eligible For Donating Blood");
			}//end of nested if 

		}//end of simple if

	}//end of display method

}//end of class
