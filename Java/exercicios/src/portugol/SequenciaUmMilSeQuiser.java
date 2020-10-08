package portugol;

import java.util.Scanner;

public class SequenciaUmMilSeQuiser {

	public static void main(String[] args) {
		
			
			//PARA ENQUANTO FAÇA ENQUANTO
			
			int contador = 1;
			char opc = 'S' ;
			
			Scanner leia = new Scanner(System.in);
			
				do {
					System.out.println(contador);
					System.out.print("continua sim ou nao S ou N: ");
					opc = leia.next().toUpperCase().charAt(0);
					
					contador++;
					
					}while (opc == 'S');
			}
	
	}

