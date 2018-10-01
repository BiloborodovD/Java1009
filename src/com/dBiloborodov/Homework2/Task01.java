package com.dBiloborodov.HomeWork2;
/**
 * The program calculate of sine and cosine of angle 30(in degree).
 * @author Dima
 *
 */
public class Task01 {

	public static void main(String[] args) {
		
		double angle = 30;
		double angleRad = Math.toRadians(angle); 
		System.out.println("Sine 30 = " + Math.sin(angleRad) + "\n" + "Cosine 30 = " + Math.cos(angleRad) );
	}

}
