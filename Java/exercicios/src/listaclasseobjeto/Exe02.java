package listaclasseobjeto;

import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Aviao primeiro = new Aviao();
		
		System.out.print("Digite o peso m�ximo do avi�o (Kg): ");
		primeiro.pesoMax = leia.nextDouble();
		System.out.print("Digite a velocidade m�xima do avi�o (Km/h): ");
		primeiro.velocidadeMax = leia.nextInt();
		System.out.print("Digite a altuta m�xima de v�o do avi�o (M): ");
		primeiro.alturaMaxVoo = leia.nextDouble();
		System.out.print("Digite o comprimento do avi�o (M): ");
		primeiro.comprimento = leia.nextDouble();
		
		System.out.println(primeiro.getAv());
		
		leia.close();
	}

}
