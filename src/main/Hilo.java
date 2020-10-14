package main;

import java.math.BigInteger;

public class Hilo extends Thread{
	private int numInicio;
	private int numFinal;
	
	public Hilo(int numInicio,int numFinal) {
		this.numInicio= numInicio;
		this.numFinal= numFinal;
	}
	
	public void run() {
		calcular();	
	}
	public void calcular() {
		BigInteger bigInteger;
		boolean primo;
		for(x = numInicio;x<numFinal;x++) {
			bigInteger = new BigInteger(String.valueOf(x));
			primo = bigInteger.isProbablePrime(1);
			if(primo) {
				System.out.println(x+" Es primo hilo: "+Thread.currentThread().getName());
				 
			}
		}
			
			
	}
}
