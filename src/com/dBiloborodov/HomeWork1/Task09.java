package com.dBiloborodov.HomeWork1;
/*
 Сделайте программу, которая будет проверять является ли число типа double целым.
*/
import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number (double): ");
		double num = in.nextDouble();
		if (num%1 == 0) {
			System.out.print("The number is integer.");
		} else {
			System.out.print("The number is non-integer.");
		}
		in.close();
	}

}
