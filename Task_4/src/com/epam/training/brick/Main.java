package com.epam.training.brick;

// There is a rectangular hole (a_b)
// Found out brick is placed in the hole, or not. 
public class Main {
	public static void main(String[] args) {
		boolean w = false;
		float a = 10;
		float b = 3;
		// -------
		float x = 14;
		float y = 2;
		float z = 9;
		// -------
		float G = x < y ? x : y;
		float C = x < z ? x : z;
		float mid = C <= G ? G : C;
		float min = C < G ? C : G;

		if (a > b) {// swap
			b = a - b;
			a = a - b;
			b = a + b;
		}

		if (a > min && b > mid) {
			w = true;
		} else {
			w = false;
		}
		System.out.println("Is the brick placed?");
		System.out.print(">> " + w);
	}
}
