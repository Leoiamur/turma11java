package projetos;

import java.util.Scanner;

public class ObterMedia {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		char opc = ' ';
		Alunex alune1 = new Alunex();
		
		do {
		System.out.println("CALCULO DE MÉDIA DE ALUNE\n");
		System.out.print("Digite o nome: ");
		alune1.setNome(leia.next().toUpperCase());
		System.out.print("Digite o número de matrícula: ");
		alune1.setMatricula(leia.nextInt());
		System.out.print("Digite a primeira nota: ");
		alune1.setNota1(leia.nextDouble());
		System.out.print("Digite a segunda nota: ");
		alune1.setNota2(leia.nextDouble());
		System.out.print("Digite a terceira nota: ");
		alune1.setNota3(leia.nextDouble());
		System.out.print("Digite a quarta nota: ");
		alune1.setNota4(leia.nextDouble());
		
		System.out.println("\nDADOS\n");
		System.out.println("Alune: " + alune1.getNome());
		System.out.println("Matrícula: " + alune1.getMatricula());
		System.out.println("Média: " + alune1.media());
		if(alune1.media()<5) {
			System.out.println("REPROVADE");
		}else {
			System.out.println("APROVADE");
		}
		
		System.out.print("\nNova média? (Digite 'S' para sim ou 'N' para finalizar o programa): ");
		opc = leia.next().toUpperCase().charAt(0);
		for(int x=0; x<100; x++) {
			System.out.println("\n");
		}
		}while(opc == 'S');
		
		leia.close();
	}

}
