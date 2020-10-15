package listaclasseobjeto;

import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Funcionario primeiro = new Funcionario();
		
		System.out.print("Digite o nome do funcionário: ");
		primeiro.nome = leia.next();
		System.out.print("Digite a letra correspondente ao sexo do funcionário (M para masculino, F para feminino, O para outros): ");
		primeiro.sexo = leia.next().toUpperCase().charAt(0);
		System.out.println("Digite o número do CPF do funcionário (Apenas os números, sem pontos ou traços): ");
		primeiro.cpf = leia.next();
		System.out.print("Digite a idade do funcionário: ");
		primeiro.idade = leia.nextInt();
		System.out.print("Digite o cargo do funcionário: ");
		primeiro.cargo = leia.next();
		
		System.out.println(primeiro.getFu());
		
		leia.close();

	}

}
