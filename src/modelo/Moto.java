package modelo;

import java.util.Scanner;

public class Moto{
	
	int aceleracaoM;
	int pesoM;
	
	
	public Moto LerMoto() {
		
Scanner scan = new Scanner(System.in);
		
		Moto moto = new Moto();	
		
	System.out.println("Imforme a aceleração da Moto (km/h):");
	moto.aceleracaoM = scan.nextInt();
	
	System.out.println("informe o peso da Moto (kg):");
	moto.pesoM = scan.nextInt();
	
	return moto;
  }
}