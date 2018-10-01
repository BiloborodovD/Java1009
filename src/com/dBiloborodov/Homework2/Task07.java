package com.dBiloborodov.HomeWork2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/**
 * Program for selection sort of integer array.
 * @author Dima
 *
 */
public class Task07 {

	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.print("Enter array size: ");
			int lenght = in.nextInt();
			int [] b = arrayCreation(lenght);
			System.out.println("Array before sorting: " + Arrays.toString(b));
			int [] c = sort(b);
			System.out.print("Array after sorting: " + Arrays.toString(c));
			in.close();
	}
	
	/**
 	* Selection sort method
 	* @param a	initial array
 	* @return	result array
 	*/
	public static int[] sort(int[] a) {
		for (int i = 0; i < a.length - 1; i++ ) {
			int minPos = minimumPosition(a,i);
			swap(a, minPos, i);
		}
		return a;
	}

	/**
	 * Method for creation of array with random integers (0-100 range) 
	 * @param lenght lenght of array
	 * @return	result array
	 */
	public static int[] arrayCreation(int lenght) { 
		Random generator = new Random();
		int n = 100;
		int[] a = new int[lenght];
		for (int i = 0; i < a.length; i++) {
			a[i] = generator.nextInt(n);
		}
		return a;
	}
	
	/**
	 * Swap of two members of array
	 * @param a	array
	 * @param i	first member
	 * @param j	second member
	 */
	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	/**
	 * 
	 * @param a
	 * @param from
	 * @return
	 */
	private static int minimumPosition(int[] a, int from) {
		int minPos = from;
		for (int i = from + 1; i < a.length; i++) {
			if (a[i] < a[minPos]) {minPos = i;}
		}
		return minPos;
	}

}
