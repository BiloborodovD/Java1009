package com.dBiloborodov.HomeWork2;

import java.util.Scanner;

/**
 * Changed program SymbolTest
 * @author Dima
 *
 */
public class Task05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number of characters:");
		int num = in.nextInt();
		for ( int i = 0; i < num; i++ ) {
            char c = (char)(Math.random()*26 + 'a');
            System.out.print(c + ": ");
            switch ( c ) {
            case 'a': case 'e': case 'i':
            case 'o': case 'u':
                System.out.println("гласная");
                break;
            case 'y': case 'w':
                System.out.println("иногда гласная");
                break;
            default:
                System.out.println("согласная");
            }
        in.close();
		}
		

    }
}


