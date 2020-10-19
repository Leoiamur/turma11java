package aplicacoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Aluno;
import entidades.AlunoEspecial;

public class CadAlunos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner leia = new Scanner(System.in);
		
		//int qtd=0;
		
		//Aluno aluno1 = new Aluno("Pedro", 2002, 'M', 1,);//referência
		
		List<Aluno> lista = new ArrayList<>();
		
		System.out.print("Digite o número de alunos a serem cadastrados: ");
		int qtd = leia.nextInt();
		
		for(int x=1; x<=qtd; x++) {
			System.out.print("Digite o nome: ");
			String nome = leia.next();
			System.out.print("Digite o ano de nascimento: ");
			int anoNascimento = leia.nextInt();
			System.out.print("Digite o sexo: ");
			char sexo = leia.next().toUpperCase().charAt(0);
			System.out.print("Digite o número da matrícula: ");
			int matricula = leia.nextInt();
			System.out.print("Digite a nota final: ");
			double notaFinal = leia.nextDouble();
			System.out.print("Alune especial?");
			char opc = leia.next().toUpperCase().charAt(0);
			
			if(opc == 'S') {
				System.out.print("Digite o valor do acréscimo (Entre 1 e 5): ");
				int acrescimo = leia.nextInt();
				lista.add(new AlunoEspecial(nome, anoNascimento, sexo, matricula, notaFinal, acrescimo));
			}else if(opc == 'N'){
				lista.add(new Aluno(nome, anoNascimento, sexo, matricula, notaFinal));
			}

		}
		
		System.out.println("LISTA DE ALUNOS");
		for(Aluno dado : lista) {
			System.out.println(dado.getNome() + " " + dado.mencao() + " NOTA AJUSTADA: " + dado.ajusteNota());
		}
		
		leia.close();
	}

}
