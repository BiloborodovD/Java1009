package com.dBiloborodov.HomeWork2;
/**
 * Infinite cycles
 * @author Dima
 *
 */
public class Task04 {

	public static void main(String[] args) {
		int x = 1;
	// Infinite for cycle
		for (int y = 1; y > 0; y++) {
			x = x + 1;
			System.out.println(x);
		}
	//Infinite while cycle
		int z = 1;
		while(z > 0) {
			x = x + 2;
			System.out.println(x);
		} 
	//Infinite do while cycle
		int w = 1;
		do {
			x = x + 3;
			System.out.println(x);
		}while(w > 0);
		
	}

}
