package com.dBiloborodov.HomeWork1;
/*
 * � ���������� n �������� ����������� ���������� �����. 
 * �������� ���������, ����������� � ��������� �� ����� ����� ���� ����� n.
 */
import java.util.Scanner;

public class Task02 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = in.nextInt();
		System.out.println("Sum: " + (n/10 + n%10));
		in.close();
	}

}