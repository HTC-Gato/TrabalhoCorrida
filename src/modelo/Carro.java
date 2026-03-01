package modelo;

import java.util.Scanner;

public class Carro {
	
	int aceleracaoC;
	int pesoC;

	public Carro LerCarro() {
		
	
		Scanner scan = new Scanner(System.in);
		
		Carro carro = new Carro();	
		
		System.out.println("Imforme a aceleração do Carro (km/h):");
		carro.aceleracaoC = scan.nextInt();
		
		System.out.println("informe o peso do Carro (kg):");
		carro.pesoC = scan.nextInt();
		

		
		
		
		return carro;
  }
}