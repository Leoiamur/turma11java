package listaclasseobjeto;

import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Funcionario primeiro = new Funcionario();
		
		System.out.print("Digite o nome do funcion�rio: ");
		primeiro.nome = leia.next();
		System.out.print("Digite a letra correspondente ao sexo do funcion�rio (M para masculino, F para feminino, O para outros): ");
		primeiro.sexo = leia.next().toUpperCase().charAt(0);
		System.out.println("Digite o n�mero do CPF do funcion�rio (Apenas os n�meros, sem pontos ou tra�os): ");
		primeiro.cpf = leia.next();
		System.out.print("Digite a idade do funcion�rio: ");
		primeiro.idade = leia.nextInt();
		System.out.print("Digite o cargo do funcion�rio: ");
		primeiro.cargo = leia.next();
		
		System.out.println(primeiro.getFu());
		
		leia.close();

	}

}
