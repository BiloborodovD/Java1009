package com.dBiloborodov.HomeWork1;
/*
 * В переменной n хранится натуральное двузначное число. 
 * Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
 */
import java.util.Scanner;

public class Task02 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = in.nextInt();
		System.out.println("Sum: " + (n/10 + n%10));
		in.close();
	}

}