package aplicacoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteErro {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nomes[] = {"Karina", "Junior", "Yago"};
		int valor=0;
		
		try {
			System.out.print("Digite um valor inteiro de 0 a 2: ");
			valor = leia.nextInt();
		
			System.out.println("\nO valor digitado foi: " + valor);
			System.out.println("O nome pelo �ndice �: " + nomes[valor]);
		
			}catch(ArrayIndexOutOfBoundsException erro1){
				System.out.println("Voc� n�o digitou um n�mero entre 0 e 2, tente de novo!");
				//erro.printStackTrace();//para rodar o programa e mostrar o erro
			}catch(InputMismatchException erro2){
				System.out.println("Voc� n�o digitou um n�mero inteiro, tente de novo!");
			}finally {
				System.out.println("EXECUTE AQUI COM ERRO OU N�O!");
			}
		System.out.println("\nFIM DE PROGRAMA");

		leia.close();
	}

}
