package listas;

import java.util.Scanner;

public class ListaLacoExe04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double valor;
		
		System.out.print("Digite um n�mero: ");
		valor = scan.nextDouble();
		
		if(valor>=0){
			if(valor==0) {
				System.out.println("O n�mero digitado foi o zero. Portanto n�o � nem par nem �mpar, o zero � neutro.");
			}else if(valor%2==0) {
				System.out.println("O n�mero � par. E sua raiz quadrada �: " + Math.sqrt(valor));
			}else {
				System.out.println("O n�mero � �mpar. E esse n�mero elevado ao quadrado �: " + Math.pow(valor, 2));
			}
		}else {
			System.out.println("O n�mero digitado � menor que zero. Portanto n�o � nem par nem �mpar.");
		}

	scan.close();
	}

}
