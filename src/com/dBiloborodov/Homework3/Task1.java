package com.dBiloborodov.HomeWork3;

import java.util.Random;
import java.util.Scanner;

/**
 * This program randomly generate 10 strings with a given number of characters, 
 * and then change characters in three different position of each string on three random characters. 
 * @author Dima
 *
 */

public class Task1 {

	static Random generator = new Random();
    static String alphabet = "ABCDEFGHIKLMNOPRSTVXYZabcdefghiklmnopqrstvxyz1234567890";
    static StringBuffer[] array = new StringBuffer[10];
    
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number of characters in strings: ");
		int lenght = in.nextInt();
		System.out.println("Strings before change: ");
		PrintArray(ArrayGenerator(lenght));
		System.out.println("Strings after change: ");
		PrintArray(RandomChange(array));
		in.close();	
	}
		
	/**
	 * Method randomly generate 10 strings with a given lenght. 	
	 * @param lenght	a number of characters
	 * @return	return StringBuffer[]
	 */
	public static StringBuffer[] ArrayGenerator(int lenght) {	
		
		for(int j = 0; j < 10; j++) {
		StringBuffer a = new StringBuffer();
			for(int i = 0; i < lenght; i++) {
				char m = alphabet.charAt(generator.nextInt(alphabet.length()));
				a.append(m);
			}
		array[j] = a;
		}
		return array;
	}
	
	/**
	 * Method print string array.
	 * @param array StringBuffer[]
	 */
	public static void PrintArray(StringBuffer[] array) {
		for(int j = 0; j < 10; j++) {
    	System.out.println("String " + (j+1) +": " + array[j].toString());
		}
	}
	
	/**
	 * Method change three random characters.
	 * @param array	
	 * @return StringBuffer[]
	 */
	public static StringBuffer[] RandomChange(StringBuffer[] array) {
		for(int i = 0; i < 10; i++) {
			StringBuffer a = new StringBuffer(array[i]);
				for(int w = 0; w < 3; w++) {
					char m = alphabet.charAt(generator.nextInt(alphabet.length()));
					int n = generator.nextInt(a.length());
					a.setCharAt(n, m);
				}
			array[i] = a; 
		}
		return array;
	}
	
}
