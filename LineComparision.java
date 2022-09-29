package LineComparision;

import java.util.Scanner;

public class LineComparision {

	// variable declaration
	int X1, X2, Y1, Y2;
	double Length;

	public static void main(String[] args) {
		LineComparision call = new LineComparision();
		call.printWelcomeMessage();
		call.calculateLength();
	}

	// welcome message
	public void printWelcomeMessage() {
		System.out.println("Welcome to Line Comparison Computation Program");
		System.out.println("");
	}

	// As a fan of geometry, I want to model a line based on a point consisting of
	// (x, y)
	// Co-ordinates using the Cartesian system,So that I can calculate its length
	public void calculateLength() {
		System.out.println("A line based on a point consisting of (x, y) co-ordinates \r"
				+ "So please Enter four Co-ordinates X1,X2,Y1,Y2");
		Scanner inp = new Scanner(System.in);
		System.out.print("X1: ");
		X1 = inp.nextInt();
		System.out.print("Y1: ");
		Y1 = inp.nextInt();
		System.out.print("X2: ");
		X2 = inp.nextInt();
		System.out.print("Y2: ");
		Y2 = inp.nextInt();
		Length = Math.sqrt(((X2 - X1) * (X2 - X1)) + ((Y2 - Y1) * (Y2 - Y1)));
		System.out.println(
				"A Line at a Point (" + X1 + "," + Y1 + ") and (" + X2 + "," + Y2 + ") is Length :" + Length);
		inp.close();
	}
}
