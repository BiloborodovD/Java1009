package com.dBiloborodov.HomeWork2;
import java.awt.Point;
import java.awt.geom.Point2D;
import java.util.Scanner;
/**
 * Program for work with class Point
 * @author Dima
 *
 */

public class Task03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Coordinates of point 1");
		System.out.print("X: ");
		int x1 = in.nextInt();
		System.out.print("Y: ");
		int y1 = in.nextInt();
		System.out.println("Coordinates of point 2");
		System.out.print("X: ");
		int x2 = in.nextInt();
		System.out.print("Y: ");
		int y2 = in.nextInt();

		Point point1 = new Point(x1, y1);
		Point point2 = new Point(x2, y2);
				
		System.out.println("Distance between two points: " + Point2D.distance(x1,y1,x2,y2));
		
		System.out.println("Distance from point1 to point 2: " + point2.distance(point1));
		
		System.out.println("Distance from point1 to origin point: " + Point2D.distance(x1,y1,0,0));
		
		System.out.print("Enter the value of X shift: ");
		int dx = in.nextInt();
		point1.translate(dx, 0);
		
		System.out.println("Shift along X axis. New coordinates is " + point1.getX() + "," + point1.getY());
		int dy = dx;
		point1.translate(0, dy);
		
		System.out.println("Shift along Y axis. New coordinates is " + point1.getX() + "," + point1.getY());
		
		in.close();
	}	
}
