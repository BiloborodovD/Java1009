package com.dBiloborodov.HomeWork1;
/*
 *Ќапишите метод, который будет увеличивать заданный элемент массива на 10%.
 */
import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		// initialization of an Array
		System.out.print("Enter a number of elements of a new Array:");
		int m = in.nextInt();		
		double[] num = new double[m];
		
		// filling the Array
		for(int i = 0; i < num.length; i++) {
			System.out.print("Enter "+i+" element of the Array:");
			num[i] = in.nextDouble();
		}
		
		//calling of the method		
		incrEl(num);
		
		//printing the New Array
		for (int y = 0; y < num.length; y++) {
		System.out.print(num[y] + ", ");
		in.close();
		}
	}
	//method which increase selected element on 10% 
	public static void incrEl(double[] num) {
		Scanner in = new Scanner(System.in);
		System.out.print("What element of the Array would you like to increase on 10%? ");
		int x = in.nextInt();
		while (x>num.length) {
			System.out.println("Array has just "+ num.length + " elements.");
			System.out.println("Let's try again.\nWhat element of the Array would you like to increase on 10%? ");
			x = in.nextInt();
		}
		num[x] = num[x]*0.1+num[x];
		in.close();
	}
		
}

