package projetos;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ProjetoEstoque {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		List<String> produto = new ArrayList();
		
		System.out.println("VAMOS CRIAR SEU ESTOQUE!\n");
		
		try {
			System.out.print("Digite a quantidade de itens que serão colocados em estoque: ");
			int qtd = leia.nextInt();
		
			for(int x = 0; x < qtd; x++) {
			System.out.print("\nDigite o produto para colocar no estoque: ");
			produto.add(leia.next().toUpperCase());
			}
		
			char opcRemove = 'S';
			do {
				System.out.println("\n═════ ESTOQUE ═════\n");
				for(String prod : produto) {
					System.out.println(prod);
				}
					
				System.out.print("\nDeseja remover algum produto do estoque? Digite 'S' para sim ou 'N' para não: ");
				opcRemove = leia.next().toUpperCase().charAt(0);
		
				if(opcRemove == 'S') {
					System.out.print("\nDigite o nome do produto que você deseja remover: ");
					produto.remove(leia.next().toUpperCase());
				}else {
						System.out.println("\n═════ ESTOQUE FINAL ═════\n");
						for(String prod : produto) {
							System.out.println(prod);
						}
				}
				for(int x=0; x<50; x++) {
					System.out.println("\n");
				}
			}while(opcRemove == 'S');
			
			System.out.println("\n═════ ESTOQUE FINAL ═════\n");
			for(String prod : produto) {
				System.out.println(prod);
			}
			
		}catch(InputMismatchException erro1) {
			System.out.println("\nVocê não digitou uma quantidade válida!");
			System.out.println("\nFIM DE PROGRAMA");
		}
		
			leia.close();
	}

}
