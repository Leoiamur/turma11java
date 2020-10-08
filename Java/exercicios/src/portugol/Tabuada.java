package portugol;

import java.util.Scanner;

public class Tabuada {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero,tabuada,resultado;
		
		for (tabuada = 1; tabuada<=10; tabuada++) {
			System.out.println("Tabuada do " + tabuada);
			for (numero = 1; numero<=10; numero++) {
				resultado = numero*tabuada;
					System.out.printf("\n %d X %d = %d",tabuada,numero,resultado);
				}
			System.out.println("\n");
		}
		leia.close();
	}
}