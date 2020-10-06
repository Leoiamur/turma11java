package portugol;

import java.util.Scanner;

public class Lista1Exercicio1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int anos=0, meses=0, dias=0, totalDias=0;
		
		System.out.print("Digite os anos da sua idade: ");
		anos=scan.nextInt();
		System.out.print("Digite os meses da sua idade: ");
		meses=scan.nextInt();
		System.out.print("Digite os dias da sua idade: ");
		dias=scan.nextInt();
		
		totalDias = ((anos*365) + (meses*30) + dias);
		
		System.out.printf("Sua idade total em dias é: %d", totalDias);

	}

}
