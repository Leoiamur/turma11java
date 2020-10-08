package listas;

import java.util.Scanner;

public class ListaRepeticaoExe05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int x=0, contador=0;
		
		do{
			System.out.print("Digite um número: ");
			x = scan.nextInt();
			contador = contador + x;
		}while(x!=0);
		
		System.out.printf("Soma dos números digitados: %d", contador);
		
		scan.close();
	}

}
