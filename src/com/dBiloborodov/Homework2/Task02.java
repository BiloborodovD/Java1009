package com.dBiloborodov.HomeWork2;

import java.util.Scanner;
import javax.xml.bind.DatatypeConverter;

/**
 * Program calculate the sine and cosine for any argument.
 * @author Dima
 *
 */
public class Task02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please, enter your argument: ");
		String argument = in.nextLine();
		double angle = DatatypeConverter.parseDouble(argument);
		double angleRad = Math.toRadians(angle); 
		System.out.println("Argument: " + argument);
		System.out.println("Sine arg = " + Math.sin(angleRad) + "\n" + "Cosine arg = " + Math.cos(angleRad) );
		in.close();
	}

}
