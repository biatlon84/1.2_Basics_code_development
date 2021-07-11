package com.epam.training.fun;

//Find value of function f(x) (task 5)
public class Main {
	public static void main(String[] args) {
		double f;
		double x = 5;
		// ---
		if (x <= 3) {
			f = Math.pow(x, 2) - 3 * x + 9;
		} else {
			f = 1 / (Math.pow(x, 3) + 6);
		}
		System.out.println("The answer");
		System.out.println(">> " + f);
	}

}
