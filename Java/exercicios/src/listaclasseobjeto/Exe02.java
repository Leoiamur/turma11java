package listaclasseobjeto;

import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Aviao primeiro = new Aviao();
		
		System.out.print("Digite o peso máximo do avião (Kg): ");
		primeiro.pesoMax = leia.nextDouble();
		System.out.print("Digite a velocidade máxima do avião (Km/h): ");
		primeiro.velocidadeMax = leia.nextInt();
		System.out.print("Digite a altuta máxima de vôo do avião (M): ");
		primeiro.alturaMaxVoo = leia.nextDouble();
		System.out.print("Digite o comprimento do avião (M): ");
		primeiro.comprimento = leia.nextDouble();
		
		System.out.println(primeiro.getAv());
		
		leia.close();
	}

}
