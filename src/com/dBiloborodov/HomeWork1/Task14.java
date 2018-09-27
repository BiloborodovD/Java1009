package com.dBiloborodov.HomeWork1;
/*
 Напишите метод переводящий гривны в доллары по заданному курсу. В качестве аргументов передайте кол-во гривен и курс.
*/
import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Hryvnia: ");
		double uah = in.nextDouble();
		System.out.print("Exchange rate: ");
		double rate = in.nextDouble();
		double us = uah*rate;
		System.out.println("Dollars: " + us + " $");
		in.close();
	}

}
