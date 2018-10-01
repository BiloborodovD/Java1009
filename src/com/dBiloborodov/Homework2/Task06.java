package com.dBiloborodov.HomeWork2;

import java.util.Scanner;

/**
 * Program use lengths of cathetutes and print angles.
 * @author Dima
 *
 */
public class Task06 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the length of catetus A: ");
		double catA = in.nextDouble(); 
		System.out.print("Enter the length of catetus A: ");
		double catB = in.nextDouble();
		double tan1 = catA/catB;
		double tan2 = catB/catA;
		double rad1 = Math.atan(tan1);
		double rad2 = Math.atan(tan2);
		System.out.println("Angle a: " + Math.toDegrees(rad1));
		System.out.println("Angle b: " + Math.toDegrees(rad2));
		in.close();
	}

}
