package listaclasseobjeto;

import java.util.Scanner;

public class Exe07 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Paciente primeiro = new Paciente();
		
		System.out.print("Digite o nome do paciente: ");
		primeiro.nome = leia.next();
		System.out.print("Digite a letra correspondente ao sexo do paciente (M para masculino, F para feminino, O para outros): ");
		primeiro.sexo = leia.next().toUpperCase().charAt(0);
		System.out.print("Digite a idade do paciente: ");
		primeiro.idade = leia.nextInt();
		System.out.print("Digite a doença do paciente: ");
		primeiro.doenca = leia.next();
		
		System.out.println(primeiro.getPc());
		
		leia.close();

	}

}
