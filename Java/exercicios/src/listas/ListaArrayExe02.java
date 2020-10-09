package listas;

import java.util.Scanner;

public class ListaArrayExe02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int vetor[] = new int[6];
		int somaPar=0;
		int somaImpar = 0;
		int numero =0;
		
		for(int x=0; x<vetor.length; x++){
			System.out.print("Digite um número: ");
			 numero = scan.nextInt();
			 vetor[x]=numero;
			if(numero%2==0){
				System.out.printf("O número %d é par.\n", numero);
				somaPar += numero;
			}else{
				System.out.printf("O número %d é ímpar.\n", numero);
				somaImpar++;

			}
		}
		
		System.out.printf("Soma dos números pares: %d\n", somaPar);
		System.out.printf("Soma dos números ímpares: %d", somaImpar);
		
		scan.close();
	}
	
}
	
