package listas;

import java.util.Scanner;

public class ListaArrayExe03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		int quantidade = 0;
		
		for(int linha=0; linha<3; linha++){
			for(int coluna =0; coluna< 3; coluna++){
				matriz[linha][coluna] = (int) (Math.random()*100);
				System.out.println(matriz[linha][coluna]);
				if(matriz[linha][coluna] > 10){
					System.out.printf("%d é maior que dez.\n", matriz[linha][coluna]);
					System.out.println("----------------------------------");
					quantidade++;
				}else {
					System.out.printf("%d não é maior que dez.\n", matriz[linha][coluna]);
					System.out.println("----------------------------------");
					quantidade++;
				}
			} 
		}
		
		System.out.printf("Foram inseridos %d números maiores que 10", quantidade);
		
		scan.close();
	}

}
