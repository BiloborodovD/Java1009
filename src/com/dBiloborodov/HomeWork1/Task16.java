package com.dBiloborodov.HomeWork1;

// ���� �������� ����������� � �������� �������. ������� �����������  � �������� ����������.

import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter temperature in Celsius:");
		int tempCels = in.nextInt();
		double tempFahr = tempCels*1.8 + 32;
		System.out.print("Temperature in Fahrenheit: " + tempFahr);
		in.close();
	}

}
