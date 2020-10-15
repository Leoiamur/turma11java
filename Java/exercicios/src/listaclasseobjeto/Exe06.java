package listaclasseobjeto;

import java.util.Scanner;

public class Exe06 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ContaBancaria primeiro = new ContaBancaria();
		
		System.out.print("Digite o nome do banco: ");
		primeiro.banco = leia.next();
		System.out.print("Digite o número da agência: ");
		primeiro.agencia = leia.nextInt();
		System.out.print("Digite o número da conta (Sem o dígito): ");
		primeiro.conta = leia.nextInt();
		System.out.print("Digite o valor em conta: ");
		primeiro.valor = leia.nextDouble();
		
		System.out.println(primeiro.getCb());
		
		leia.close();

	}

}
