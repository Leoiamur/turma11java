package aplicacoes;

import java.util.Scanner;

import entidades.Pessoa;

public class LojinhaLeo {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);//isso é instanciar o objeto
		//variáveis - vou fazer um objeto
		Pessoa cliente1 = new Pessoa();
		Pessoa cliente2 = new Pessoa("Leonardo", 1992, 'M');
		
		System.out.print("Digite o nome da pessoa: ");
		cliente1.setNome(leia.next().toUpperCase());// cliente e leia são objetos
		System.out.print("Digite o ano de nascimento: ");
		cliente1.setAnoNascimento(leia.nextInt());
		System.out.print("Digite M-masculino, F-feminino ou O-outros: ");
		cliente1.setSexo(leia.next().toUpperCase().charAt(0));
		
		System.out.println("\nDADOS DO CLIENTE 1:\n");
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.calcIdade() + " anos");
		cliente1.mostraSexo();
		
		System.out.println("\nDADOS DO CLIENTE 2:\n");
		System.out.println(cliente2.getNome());
		System.out.println(cliente2.calcIdade() + " anos");
		cliente2.mostraSexo();

		leia.close();
	}

}
