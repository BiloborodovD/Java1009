package com.dBiloborodov.HomeWork1;
/*
 *� ���������� n �������� ������������ ����� � ��������� ������� ������. 
 *�������� ���������, ����������� ����� n �� ���������� ������ � ��������� ��������� �� �����.
 */
import java.lang.Math;
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
