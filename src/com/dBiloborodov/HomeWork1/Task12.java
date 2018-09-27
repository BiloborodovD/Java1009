package com.dBiloborodov.HomeWork1;
/*
Пользователь вводит задает расстояние до места назначения (N) и время, за которое нужно доехать (T).
Вычислить скорость (км/ч), с которой нужно ехать.
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
