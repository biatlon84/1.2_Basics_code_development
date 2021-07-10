package com.epam.training.tria;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double a;
		double b;
		double c;

		System.out.println("type A \n>>");
		a = sc.nextDouble();
		System.out.println("type B \n>>");
		b = sc.nextDouble();

		c = 180 - (a + b);
		if ((c > 0) && (c < 180)) {
			if ((90 == a) || (c == 90) || (b == 90)) {
				System.out.println("The triangle is rectangular");
			} else {
				if (!((a == b) || (a == c) || (c == b)))
					System.out.print("The triangle exist");
			}
			if ((a == b) || (a == c) || (c == b)) {
				if ((90 == a) || (c == 90) || (b == 90)) {
					System.out.println(" and equilateral");
				} else {
					System.out.println("The triangle is equilateral");
				}
			}
		}
		if (c <= 0) {
			System.out.println("The triangle is't exist");
		}
	}

}
