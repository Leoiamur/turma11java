package listas;

import java.util.Scanner;

public class ListaRepeticaoExe06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int x=0, soma=0, contador=0, media=0;
		
		do {
			System.out.print("Digite um número: ");
			x = scan.nextInt();
			
			if(x%3==0 && x!=0) {
				contador++;
				soma = soma + x;
			}
		}while(x!=0);
		
		media = soma / contador;
		
		System.out.printf("A média dos números digitados múltiplos de 3 é: %d", media);
		
		scan.close();
	}

}
