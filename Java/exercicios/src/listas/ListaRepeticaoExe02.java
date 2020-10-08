package listas;

import java.util.Scanner;

public class ListaRepeticaoExe02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int x, numero, contadorPar=0, contadorImpar=0;
		
		for(x=0; x<10; x++) {
			System.out.print("Digite um número: ");
			numero = scan.nextInt();
			if(numero%2==0) {
				contadorPar++;
			}else {
				contadorImpar++;
			}
		}
		
		System.out.printf("Quantidade de número par: %d", contadorPar);
		System.out.printf("\nQuantidade de número par: %d", contadorImpar);
		
		scan.close();
	}

}
