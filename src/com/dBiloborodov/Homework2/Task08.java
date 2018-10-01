package com.dBiloborodov.HomeWork2;

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String string = in.nextLine();
		System.out.println("\n1. Is it palindrome?\n2. Delete a symbol from string.\n3. Convertion of string into array of bytes.\n");
		System.out.print("Choose a task (enter the number of task): ");
		int x  = in.nextInt();
		switch (x) {
		case 1:
			StringBuffer obj = new StringBuffer(string);
			obj = obj.reverse();
				if (string.contentEquals(obj)) {
					System.out.print("The string is palindrome.");
				} else {
					System.out.print("The string is not palindrome.");
				}
			break;
		case 2:
			System.out.print("Enter a symbol: ");
			String sym  = in.next();
			string = string.replaceAll(sym, "");
			System.out.print("New string: " + string);
			break;
		case 3:
			byte[] bych = string.getBytes();
			for (int k = 0; k < bych.length; k++) {
				System.out.println("Character " + "[" + k +"] = " + bych[k]);
			}
			String newString = new String(bych);
			System.out.println("String: " + newString);
				
		default:
			break;
		} 
		in.close();
	}

}
