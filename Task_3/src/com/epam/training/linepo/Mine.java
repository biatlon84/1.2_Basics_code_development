package com.epam.training.linepo;

public class Mine {
	public static void main(String[] args) {
		double Y2;
		boolean w;
		double x1 = 97;
		double y1 = -10;
		// --
		double x2 = 30;
		double y2 = -29.231;
		// --
		double x3 = -11;
		double y3 = -41;
		System.out.println("Points located on one straight line?");
		System.out.print(">> ");

		Y2 = ((x2 - x1) / (x3 - x1)) * (y3 - y1) + y1;
		w = Math.abs(Y2 - y2) < 0.00001;
		System.out.println(" " + w);
	}
}
