package com.dBiloborodov.HomeWork1;
/*
 * В переменных q и w хранятся два натуральных числа. 
 * Создайте программу, выводящую на экран результат деления q на w с остатком. 
 * Пример вывода программы (для случая, когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке.
 */

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int q = in.nextInt();
		System.out.print("Enter second number: ");
		int w = in.nextInt();
		System.out.println("The result of calculation: " + q + "/" + w + " = " + q/w + " and reminder " + q%w);
		in.close();
	}

}
