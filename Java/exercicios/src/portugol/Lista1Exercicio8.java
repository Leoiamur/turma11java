package portugol;

import java.util.Scanner;

public class Lista1Exercicio8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int percDist=0, percImpost=0;
		double custoFab=0, valorDist=0, valorImpost=0, custoCons=0;
		
		percDist = 28;
		percImpost = 45;
		
		System.out.print("Informe o valor do custo de fábrica: ");
		custoFab = scan.nextDouble();
		
		valorDist = custoFab + (custoFab * percDist / 100);
		valorImpost = custoFab + (custoFab * percImpost / 100);
		custoCons = custoFab + valorDist + valorImpost;
		
		System.out.printf("O custo desse carro ao consumidor será: RS%.2f.", custoCons);

	}

}
