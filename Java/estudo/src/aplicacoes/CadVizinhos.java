package aplicacoes;

import java.util.Scanner;

import entidades.Sujeito;
import entidades.Vizinho;

public class CadVizinhos {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Sujeito vizinho1 = new Vizinho("Carlos", 'M', true); //objeto vizinho1 do tipo Sujeito
		Vizinho vizinho2 = new Vizinho("Maria", 'F', false);
		
		vizinho1.setNome("Zé");
		vizinho1.setAnoNascimento(2000);
		vizinho1.setSexo('M');
		
		vizinho2.setAnoNascimento(1950);
		
		System.out.print("Digite o nome: ");
		vizinho1.setNome(leia.next());
		System.out.print("Digite o ano de nascimento: ");
		vizinho1.setAnoNascimento(leia.nextInt());
		System.out.print("Digite o sexo: ");
		vizinho1.setSexo(leia.next().toUpperCase().charAt(0));
		
		System.out.println(vizinho1.getNome());
		System.out.println(vizinho1.getAnoNascimento());
		System.out.println(vizinho1.getSexo());
		
		if(vizinho1.getSexo() == 'M') {
			System.out.println("Bem-vindo, senhor!");
		}else if(vizinho1.getSexo() == 'F') {
			System.out.println("Bem-vinda, senhora!");
		}else {
			System.out.println("Sexo não informado.");
		}
		
		System.out.println(vizinho1.idade() + " anos");
		
		System.out.println("Idade vizinho 2: " + vizinho2.idade(2020) + " anos");
		
		leia.close();
	}

}