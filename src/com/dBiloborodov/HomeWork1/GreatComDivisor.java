package com.dBiloborodov.HomeWork1;

//Calculation of Greatest Common Divisor for two integers

import java.util.Scanner;
import java.lang.Math;

public class GreatComDivisor {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number one: ");
		int a = in.nextInt();
		System.out.print("Enter number two: ");
		int b = in.nextInt();
		greatComDiv(a, b);
		in.close();
	}

// method for calculation of greatest common divisor according with Euclidean algorithm
	
	public static void greatComDiv(int a, int b) {
		a = Math.abs(a);
		b = Math.abs(b);
		if (b == 0) {
			System.out.println("Greatest common divisor:" + a);
		}else {
			for (int x = a%b;x != 0;x = a%b){
				a = b;
				b = x;
			} 
		System.out.println("Greatest common divisor: " + b);
		
		}
	}
}

