package aplicacoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Empregado1;
import entidades.Terceiro;

public class CadFunc {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		List<Empregado1> lista = new ArrayList();
		
		System.out.print("Número de funcionários para cadastro: ");
		int n = leia.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Empregado " + i);
			System.out.print("O funcionário é terceiro? Digite 'S' para sim ou 'N' para não: ");
			char ch = leia.next().toUpperCase().charAt(0);
			System.out.print("Digite o nome: ");
			String nome = leia.next();
			System.out.print("Digite as horas de trabalho: ");
			int horas = leia.nextInt();
			System.out.print("Digite o valor por hora: ");
			double valorPorHoras = leia.nextDouble();
			
			if(ch == 'S') {
				System.out.print("Digite o valor adicional: ");
				double adicional = leia.nextDouble();
				Empregado1 emp = new Terceiro(nome, horas, valorPorHoras, adicional);
				lista.add(emp);
			}else {
				Empregado1 emp = new Empregado1(nome, horas, valorPorHoras);
				lista.add(emp);
			}
		}
		
		System.out.println();
		System.out.println("PAGAMENTOS");
		for(Empregado1 emp : lista) {
			System.out.println(emp.getNome());
			System.out.println(emp.pagamento());
		}
		
		leia.close();
	}

}
