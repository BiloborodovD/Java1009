package com.dBiloborodov.HomeWork1;
/*
 * �������� ���������, ������� ����� ������� ������ ���� ���, � ����� ������� ��� �� �������.(*)
 */
import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = in.nextLine();
		System.out.println("Your name is "+ name+ ".");
		in.close();
	}

}
