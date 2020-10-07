package portugol;

import java.util.Scanner;

public class Lista1Exercicio4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numA=0, numB=0, numC=0;
		double numR=0, numS=0, res=0;	
		
		System.out.print("Digite o primeiro número: ");
		numA = scan.nextInt();
		System.out.print("Digite o segundo número: ");
		numB = scan.nextInt();
		System.out.print("Digite o terceiro número: ");
		numC = scan.nextInt();
		
		numR = Math.pow((numA + numB), 2); 
		numS = Math.pow((numB + numC), 2);

		res = (numR + numS) / 2;
		
		System.out.printf("O resultado da expressão é %.2f.", res);

		scan.close();
	}

}
