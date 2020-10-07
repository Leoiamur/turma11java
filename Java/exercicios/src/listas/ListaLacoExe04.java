package listas;

import java.util.Scanner;

public class ListaLacoExe04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double valor;
		
		System.out.print("Digite um número: ");
		valor = scan.nextDouble();
		
		if(valor>=0){
			if(valor==0) {
				System.out.println("O número digitado foi o zero. Portanto não é nem par nem ímpar, o zero é neutro.");
			}else if(valor%2==0) {
				System.out.println("O número é par. E sua raiz quadrada é: " + Math.sqrt(valor));
			}else {
				System.out.println("O número é ímpar. E esse número elevado ao quadrado é: " + Math.pow(valor, 2));
			}
		}else {
			System.out.println("O número digitado é menor que zero. Portanto não é nem par nem ímpar.");
		}

	scan.close();
	}

}
