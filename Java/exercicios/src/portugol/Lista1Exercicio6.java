package portugol;

import java.util.Scanner;

public class Lista1Exercicio6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double x1=0, x2=0, y1=0, y2=0, resX=0, resY=0, d=0;
		
		System.out.print("Informe a posição 'X' do ponto 1: ");
		x1 = scan.nextDouble();
		System.out.print("Informe a posição 'Y' do ponto 1: ");
		y1 = scan.nextDouble();
		System.out.print("Informe a posição 'X' do ponto 2: ");
		x2 = scan.nextDouble();
		System.out.print("Informe a posição 'Y' do ponto 2: ");
		y2 = scan.nextDouble();
		
		resX = Math.pow((x2-x1), 2);
		resY = Math.pow((y2-y1), 2);
		
		d = Math.sqrt(resX+resY);
		
		System.out.printf("O resultado do cáculo é: %.2f.", d);

		scan.close();
	}

}
