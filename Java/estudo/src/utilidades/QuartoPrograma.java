package utilidades;

import java.util.Scanner;

public class QuartoPrograma {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String nome;
		int ano, idade=0;
		double salario;
		
		System.out.println("Digite seu nome: ");
		nome = scan.next();
		System.out.println("Digite seu ano de nascimento: ");
		ano = scan.nextInt();
		System.out.println("Digite seu sal�rio: ");
		salario = scan.nextDouble();
		
		idade = 2020 - ano;
		
		System.out.printf("Ol�, %s, voc� tem %d anos de idade e seu sal�rio � de R$ %.2f.", nome, idade, salario);

	scan.close();
	}

}
