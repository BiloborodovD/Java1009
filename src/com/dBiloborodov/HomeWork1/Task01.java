package com.dBiloborodov.HomeWork1;
/*
 * � ���������� q � w �������� ��� ����������� �����. 
 * �������� ���������, ��������� �� ����� ��������� ������� q �� w � ��������. 
 * ������ ������ ��������� (��� ������, ����� � q �������� 21, � � w �������� 8): 21 / 8 = 2 � 5 � �������.
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
