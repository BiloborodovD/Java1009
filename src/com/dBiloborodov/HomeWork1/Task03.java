package com.dBiloborodov.HomeWork1;
/*
 В переменной n хранится вещественное число с ненулевой дробной частью. 
Создайте программу, округляющую число n до ближайшего целого и выводящую результат на экран.
 */
import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		float n = in.nextFloat();
		System.out.print("Rounding: " + Math.round(n));
		in.close();
	}

}
