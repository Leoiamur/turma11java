package portugol;

import java.util.Scanner;

public class Lista1Exercicio5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double nota1=0, nota2=0, nota3=0, media=0;
		
		System.out.print("Escreva a primeira nota: ");
		nota1 = scan.nextDouble();
		System.out.print("Escreva a segunda nota: ");
		nota2 = scan.nextDouble();
		System.out.print("Escreva a terceira nota: ");
		nota3 = scan.nextDouble();
		
		media = ((nota1*2) + (nota2*3) + (nota3*5)) / 10;
		
		System.out.printf("A média é %.2f.", media);

	}

}
