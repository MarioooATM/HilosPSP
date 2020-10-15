package main;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
		File fichero = new File("C:\\MiCarpeta\\FichTexto44.txt");
		FileWriter fw = null;
		try {
			BufferedWriter bw=new BufferedWriter(new FileWriter(fichero,true));
			for (int x = numInicio; x < numFinal; x++) {
			bigInteger = new BigInteger(String.valueOf(x));
			primo = bigInteger.isProbablePrime(1);
				if (primo) {
					bw.write(x+"\n");
					bw.flush();
					System.out.println(x + " Es primo hilo: " + Thread.currentThread().getName());
				}
			}
		} catch (IOException b) {
			b.printStackTrace();
		}
	}


}
