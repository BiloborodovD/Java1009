package com.dBiloborodov.HomeWork1;
/*
Даны катеты прямоугольного треугольника. Найдите площадь, периметр и гипотенузу треугольника.
*/
import java.util.Scanner;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Task15 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Cathetus A: ");
		int catA = in.nextInt();
		System.out.print("Cathetus B: ");
		int catB = in.nextInt();
		double hyp = sqrt(pow(catA,2) + pow(catB,2));
		System.out.println("Hypotenuse: " + hyp);
		calcArea(catA,catB);
		calcPerim(catA,catB,hyp);
		in.close();
	}
		
	private static void calcArea(int catA, int catB) {
		double area = catA*catB/2;
		System.out.println("Area: " + area);
	}
	
	private static void calcPerim(int catA, int catB, double hyp) {
		System.out.println("Perimenter: " + (catA+catB+hyp));
	}
}
