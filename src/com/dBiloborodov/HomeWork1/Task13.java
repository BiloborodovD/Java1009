package com.dBiloborodov.HomeWork1;
/*
 *�������� ���������, ������� ����� ������� ���������� �����, ����� � ������ � n-��� ���������� �����.
 */
import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Days: ");
		int days = in.nextInt();
		int hours = days*24;
		int min = hours*60;
		int sec = min*60;
		System.out.println("Hours: " + hours);
		System.out.println("Minutes: "+ min);
		System.out.println("Seconds: " + sec);
		in.close();
	}

}
