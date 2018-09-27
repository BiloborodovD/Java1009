package com.dBiloborodov.HomeWork1;
/*
 В переменной n хранится натуральное трёхзначное число. 
 Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
 */
import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = in.nextInt();
		int a = num/100;
		int b = (num-a*100)/10;
		int c = (num%100)%10;
		System.out.println("Sum: " +(a+b+c));
		in.close();
	}

}
