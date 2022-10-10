package LineComparision;

import java.util.Scanner;

public class LineComparision {

	public static void main(String[] args) {
		LineComparision call = new LineComparision();
		call.printWelcomeMessage();
		call.calculateLength();
	}

	// welcome message
	public void printWelcomeMessage() {
		System.out.println("Welcome to Line Comparison Computation Program");
		System.out.println();
	}

	// As a fan of geometry, I want to model a line based on a point consisting of
	// (x, y)
	// Co-ordinates using the Cartesian system,So that I can calculate its length

	public void calculateLength() {
		// variable declaration
		int X1, X2, Y1, Y2, X3, X4, Y3, Y4;
		double Length1, Length2;
		System.out.println("A line based on a points consisting of (x, y) Start point and (x,y) end point");
		System.out.println();
		System.out.println();
		Scanner inp = new Scanner(System.in);
		// line 1
		System.out.println("Points of Line1");
		System.out.print("X1: ");
		X1 = inp.nextInt();
		System.out.print("Y1: ");
		Y1 = inp.nextInt();
		System.out.print("X2: ");
		X2 = inp.nextInt();
		System.out.print("Y2: ");
		Y2 = inp.nextInt();
		Length1 = Math.sqrt(((X2 - X1) * (X2 - X1)) + ((Y2 - Y1) * (Y2 - Y1)));
		System.out.println("Length of Line1 = " + Length1);
		System.out.println();

		// line 2
		System.out.println();
		System.out.println("Points of Line2");
		System.out.print("X3 ");
		X3 = inp.nextInt();
		System.out.print("Y3: ");
		Y3 = inp.nextInt();
		System.out.print("X4: ");
		X4 = inp.nextInt();
		System.out.print("Y4: ");
		Y4 = inp.nextInt();
		Length2 = Math.sqrt(((X4 - X3) * (X4 - X3)) + ((Y4 - Y3) * (Y4 - Y3)));
		System.out.println("Length of Line2 = " + Length2);
		System.out.println();

		// check two lines are equal or not
		if (Length1 == Length2) {
			System.out.println("Length of Line1 is equal to Length of Line2.");
		} else {
			System.out.println("Length of Line1 is not equals to Length of Line2.");
		}

		inp.close();

	}
}
