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
			System.out.print("Digite um n�mero: ");
			 numero = scan.nextInt();
			 vetor[x]=numero;
			if(numero%2==0){
				System.out.printf("O n�mero %d � par.\n", numero);
				somaPar += numero;
			}else{
				System.out.printf("O n�mero %d � �mpar.\n", numero);
				somaImpar++;

			}
		}
		
		System.out.printf("Soma dos n�meros pares: %d\n", somaPar);
		System.out.printf("Soma dos n�meros �mpares: %d", somaImpar);
		
		scan.close();
	}
	
}
	
