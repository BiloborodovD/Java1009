package com.dBiloborodov.HomeWork1;
/*
 *–азработайте программу, котора€ будет выводить таблицу умножени€ введенного пользователем числа с клавиатуры.
 */
import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = in.nextInt();
		for(int i = 0; i<=10;i++) {
			int x = num*i;
			System.out.println(num + " * " + i + " = " + x);
		}
		in.close();
	}

}
