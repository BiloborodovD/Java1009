package com.dBiloborodov.HomeWork1;
/*
 * Сила тяжести на Луне примерно равна 17%, напишите программу, которая вычисляет ваш вес на Луне.
 */
import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Weight on the Earth, kg: ");
		int earthW = in.nextInt();
		double moonW = 0.17*earthW;
		System.out.print("Weight on the Moon, kg: " + moonW);
		in.close();
	}

}
