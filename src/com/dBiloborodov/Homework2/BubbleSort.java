package com.dBiloborodov.HomeWork2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BubbleSort {

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
	 	* Bubble sort method
	 	* @param a	initial array
	 	* @return	result array
	 	*/
		public static int[] sort(int[] a) {
						
			for (int i = a.length - 1; i >= 1; i-- ) {
				for(int j = 0; j < i; j++) {
					if(a[j] > a[j + 1]) {swap(a, j, j + 1);}
				}
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
}
