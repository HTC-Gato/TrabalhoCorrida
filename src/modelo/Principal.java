package modelo;
import java.util.Scanner;
public class Principal {
	

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

  System.out.println(" ---- PREPARANDO PARRA A CORRIDA ---- ");
  

	Carro vetor [] = new Carro[4];
	
  for (int i  = 0; i < vetor.length; i++) {
		Carro Carro = new Carro(); 	
		vetor[i] = Carro.LerCarro();
    }
  }
}
