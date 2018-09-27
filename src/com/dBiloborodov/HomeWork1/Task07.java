package com.dBiloborodov.HomeWork1;
/*
 Напишите программу которая определяет какое из чисел больше
 */
import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number A: ");
		int num1 = in.nextInt();
		System.out.print("Enter a number B: ");
		int num2 = in.nextInt();
		if (num1>num2) {
			System.out.print("Number A is bigger.");
		} else {
			if (num1<num2) {
				System.out.print("Number B is bigger.");
			} else {
				System.out.print("Numbers are equal.");
			}
		}
		in.close();
	}

}
