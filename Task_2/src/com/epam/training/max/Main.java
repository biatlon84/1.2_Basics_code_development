package com.epam.training.max;

//Find Max( min (a,b) , min (c,d));
public class Main {
	public static void main(String[] args) {
		double a = 2;
		double b = -6.6;
		double c = 71.9;
		double d = 5900;
		// ----
		double m1 = a < b ? a : b;
		double m2 = c < d ? c : d;

		System.out.println("answer is\n>>" + (m1 < m2 ? m2 : m1));
	}
}
