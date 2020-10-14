package main;

import java.math.BigInteger;
import java.util.Scanner;

public class NumerosPrimos {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe cuantos hilos quieres utilizar ");
		int nHilos =sc.nextInt();
		int numInicial=1;
		int corte = 1000/nHilos;
		int numFinal = corte;
		for(int x = 1;x< nHilos;x++) {
			Hilo h = new Hilo(numInicial,numFinal);
			h.start();
			numInicial+=corte;
			numFinal+=corte;
		}
	}
}
