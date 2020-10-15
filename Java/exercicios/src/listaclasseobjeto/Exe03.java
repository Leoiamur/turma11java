package listaclasseobjeto;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Eletronico primeiro = new Eletronico();
		
		System.out.print("Digite o nome do produto eletrônico: ");
		primeiro.nome = leia.next();
		System.out.print("Digite o valor do produto eletrônico: ");
		primeiro.valor = leia.nextDouble();
		System.out.print("Digite a cor do produto eletrônico: ");
		primeiro.cor = leia.next();
		
		System.out.println(primeiro.getEl());
		
		leia.close();
	}

}
