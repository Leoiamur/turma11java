package listas;

import java.util.Scanner;

public class ListaLacoExe01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numA=0, numB=0, numC=0;
		
		System.out.print("Digite o primeiro número inteiro: ");
		numA = scan.nextInt();
		System.out.print("Digite o segundo número inteiro: ");
		numB = scan.nextInt();
		System.out.print("Digite o terceiro número inteiro: ");
		numC = scan.nextInt();
		
		if(numA >= numB && numA >= numC) {
			System.out.printf("O maior número digitado foi: %d", numA);
		}else if(numB >= numA && numB >= numC) {
			System.out.printf("O maior número digitado foi: %d", numB);
		}else if(numC >= numA && numC >= numB) {
			System.out.printf("O maior número digitado foi: %d", numC);
		}
		
		scan.close();
	}

}
