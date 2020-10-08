package listas;

import java.util.Scanner;

public class ListaRepeticaoExe04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		final int LIMITE = 150;
		int idade, contCalma=0, contMulherNerv=0, contHomemAgre=0, contOutrosCalmos=0, contNerv40=0, contCalmo18=0, contador=1; 
		byte sexo, humor;
		
		while(contador<=LIMITE) {
			System.out.print("Digite sua idade: ");
			idade = scan.nextInt();
			System.out.print("Digite seu sexo (1 - Feminino, 2 - Masculino, 3 - Outros): ");
			sexo = scan.nextByte();
			System.out.print("Escolha a opção em que você melhor se encaixa (1 - Pessoa Calma, 2 - Pessoa Nervosa, 3 - Pessoa Agressiva): ");
			humor = scan.nextByte();
			
			if(humor==1) {
				contCalma = contCalma+1;
			}if(sexo==1 && humor==2) {
				contMulherNerv = contMulherNerv+1;
			}if(sexo==2 && humor==3) {
				contHomemAgre = contHomemAgre+1;
			}if(sexo==3 && humor==1) {
				contOutrosCalmos = contOutrosCalmos+1;
			}if(idade>40 && humor==2) {
				contNerv40 = contNerv40+1;
			}if(idade<18 && humor==1) {
				contCalmo18 = contCalmo18+1;
			}
			
			contador++;
		}
		
		System.out.printf("Total de pessoas calmas: %d", contCalma);
		System.out.printf("\nTotal de mulheres nervosas: %d", contMulherNerv);
		System.out.printf("\nTotal de homens agressivas: %d", contHomemAgre);
		System.out.printf("\nTotal de outros calmos: %d", contOutrosCalmos);
		System.out.printf("\nTotal de pessoas nervosas com mais de 40 anos: %d", contNerv40);
		System.out.printf("\nTotal de pessoas calmas com menos de 18 anos: %d", contCalmo18);
		
		scan.close();
	}

}
