package listaclasseobjeto;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Eletronico primeiro = new Eletronico();
		
		System.out.print("Digite o nome do produto eletr�nico: ");
		primeiro.nome = leia.next();
		System.out.print("Digite o valor do produto eletr�nico: ");
		primeiro.valor = leia.nextDouble();
		System.out.print("Digite a cor do produto eletr�nico: ");
		primeiro.cor = leia.next();
		
		System.out.println(primeiro.getEl());
		
		leia.close();
	}

}
