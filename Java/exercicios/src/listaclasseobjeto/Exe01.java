package listaclasseobjeto;

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Cliente primeiro = new Cliente();
		
		System.out.print("Digite o nome do cliente: ");
		primeiro.nome = leia.next();
		System.out.print("Digite a letra correspondente ao sexo do cliente (M para masculino, F para feminino, O para outros): ");
		primeiro.sexo = leia.next().toUpperCase().charAt(0);
		System.out.println("Digite o n�mero do CPF do cliente (Apenas os n�meros, sem pontos ou tra�os): ");
		primeiro.cpf = leia.next();
		
		System.out.println(primeiro.getCl());
		
		leia.close();
	}

}
