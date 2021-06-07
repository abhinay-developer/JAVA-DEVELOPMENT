package com.abhi.cj;

public class Addition {

	// cntr+s save
	// cntrl+c copy
	// cntl+v paste
	// cntrl+x cut
	// sysout System.out.prinltn()
	// cntrl+shift+f formatting the code

	// Constructor Creation

	public Addition() {
		// no-args Constructor

	}

	public Addition(int a, int b) {// overloaded method

		int c = a + b;

		System.out.println("The Addition is{2 param} ::" + c);

	}

	public Addition(int a, int b, double c) {

		double d = a + b + c;

		System.out.println("The Addition is{3 param} ::" + d);
	}

	public Addition(int a, int b, double c, int d) {

		double e = a + b + c + d;

		System.out.println("The Addition is{4 param} ::" + d);
	}

}