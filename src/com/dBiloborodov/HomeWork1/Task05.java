package com.dBiloborodov.HomeWork1;
/*
 * ���� ������� �� ���� �������� ����� 17%, �������� ���������, ������� ��������� ��� ��� �� ����.
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
