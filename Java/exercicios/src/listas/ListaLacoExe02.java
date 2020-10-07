package listas;

import java.util.Scanner;

public class ListaLacoExe02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numA=0, numB=0, numC=0;
		
		System.out.println("Digite 3 números para serem colocados em ordem crescente: ");
		System.out.print("Digite o primeiro número: ");
		numA = scan.nextInt();
		System.out.print("Digite o segundo número: ");
		numB = scan.nextInt();
		System.out.print("Digite o terceiro número: ");
		numC = scan.nextInt();
		
		if(numA < numB && numA < numC && numB < numC) {
			System.out.printf("Os números digitados em ordem crescente ficam assim: %d - %d - %d", numA, numB, numC);
		}else if(numA < numB && numA < numC && numC < numB) {
			System.out.printf("Os números digitados em ordem crescente ficam assim: %d - %d - %d", numA, numC, numB);
		}else if(numB < numA && numB < numC && numA < numC) {
			System.out.printf("Os números digitados em ordem crescente ficam assim: %d - %d - %d", numB, numA, numC);
		}else if(numB < numA && numB < numC && numC < numA) {
			System.out.printf("Os números digitados em ordem crescente ficam assim: %d - %d - %d", numB, numC, numA);
		}else if(numC < numA && numC < numB && numA < numB) {
			System.out.printf("Os números digitados em ordem crescente ficam assim: %d - %d - %d", numC, numA, numB);
		}else if(numC < numA && numC < numB && numB < numA) {
			System.out.printf("Os números digitados em ordem crescente ficam assim: %d - %d - %d", numC, numB, numA);
		}else {
			System.out.println("Você digitou números iguais, fim do programa.");
		}
		
		scan.close();
	}

}
