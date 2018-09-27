package com.dBiloborodov.HomeWork1;
/*
 Напишите программу которая определяет число четное или не четное
 */
import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = in.nextInt();
		if (num%2 == 0) {
			System.out.print("The number is even.");
		} else {
			System.out.print("The number is odd.");
		}
		in.close();		
	}

}
