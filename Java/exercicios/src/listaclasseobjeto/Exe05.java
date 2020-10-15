package listaclasseobjeto;

import java.util.Scanner;

public class Exe05 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Patinete primeiro = new Patinete();
		
		System.out.print("Digite a marca do patinete: ");
		primeiro.marca = leia.next();
		System.out.print("Digite a cor do patinete: ");
		primeiro.cor = leia.next();
		System.out.print("Digite o peso máximo que o usuário do patinete pode ter (Kg): ");
		primeiro.pesoMax = leia.nextInt();
		
		System.out.println(primeiro.getPa());
		
		leia.close();

	}

}
