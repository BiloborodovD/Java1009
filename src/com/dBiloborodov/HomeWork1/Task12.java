package com.dBiloborodov.HomeWork1;
/*
 *������������ ������ ������ ���������� �� ����� ���������� (N) � �����, �� ������� ����� ������� (T). ��������� �������� (��/�), � ������� ����� �����.
 */
import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Distance, km: ");
		int dist = in.nextInt();
		System.out.print("Time, h: ");
		double time = in.nextDouble();
		double vel = dist/time;
		System.out.printf("Velocity, km/h: " + "% .2f" ,vel);
		in.close();
	}

}
