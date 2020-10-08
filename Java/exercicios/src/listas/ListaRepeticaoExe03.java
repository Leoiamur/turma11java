package listas;

import java.util.Scanner;

public class ListaRepeticaoExe03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int idade, contador21=0, contador50=0;
		
		System.out.print("Digite sua idade: ");
		idade = scan.nextInt();
		
		while(idade != -99) {
			if(idade<21) {
				contador21++;
			}else if(idade>50) {
				contador50++;
			}
			
			System.out.print("Digite sua idade: ");
			idade = scan.nextInt();
		}
		
		System.out.printf("Total de pessoas com menos de 21 anos: %d", contador21);
		System.out.printf("\nTotal de pessoas com mais de 50 anos: %d", contador50);
		
		scan.close();
	}

}
