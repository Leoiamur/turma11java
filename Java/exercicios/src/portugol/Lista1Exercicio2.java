package portugol;

import java.util.Scanner;

public class Lista1Exercicio2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int idade=0, idadeEmAnos=0, idadeEmMeses=0, idadeEmDias=0;
		
		System.out.print("Digite sua idade em dias: ");
		idade = scan.nextInt();
		
		idadeEmAnos = idade / 365;
		idadeEmMeses = (idade % 365) / 30;
		idadeEmDias = (idade % 365) % 30;
		
		System.out.printf("Você tem %d anos, %d meses e %d dias.", idadeEmAnos, idadeEmMeses, idadeEmDias);

		scan.close();
	}

}
