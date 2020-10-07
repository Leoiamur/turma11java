package portugol;

import java.util.Scanner;

public class Lista1Exercicio7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double numA=0, numB=0, numC=0, numD=0, numE=0, numF=0, x=0, y=0;
		
		System.out.print("Digite o valor de 'A': ");
		numA=scan.nextDouble();
		System.out.print("Digite o valor de 'B': ");
		numB=scan.nextDouble();
		System.out.print("Digite o valor de 'C': ");
		numC=scan.nextDouble();
		System.out.print("Digite o valor de 'D': ");
		numD=scan.nextDouble();
		System.out.print("Digite o valor de 'E': ");
		numE=scan.nextDouble();
		System.out.print("Digite o valor de 'F': ");
		numF=scan.nextDouble();
		
		x = ((numC * numE) - (numB * numF)) / ((numA * numE) - (numB * numD));

		y = ((numA * numF) - (numC * numD)) / ((numA * numE) - (numB * numD));
		
		System.out.printf("O valor de 'X' é: %.2f", x);
		System.out.println();
		System.out.printf("O valor de 'Y' é: %.2f", y);

		scan.close();
	}

}
