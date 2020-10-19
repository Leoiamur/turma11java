package polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		List<String> produtos = new ArrayList();
		
		System.out.println("Vamos criar um estoque de loja!\n");
		System.out.print("Digite a quantidade de itens que serão colocados em estoque: ");
		int qtd = leia.nextInt();
		
		for(int x = 0; x < qtd; x++) {
			System.out.print("\nDigite o produto para colocar no estoque: ");
			produtos.add(leia.next().toUpperCase());
		}
		
		char opcRemove = 'S';
		do {
		System.out.print("\nDeseja remover algum produto do estoque? Digite 'S' para sim ou 'N' para não: ");
		opcRemove = leia.next().toUpperCase().charAt(0);
		
			if(opcRemove == 'S') {
				System.out.print("\nDigite o nome do produto que você deseja remover: ");
				produtos.remove(leia.next().toUpperCase());
			}else {
					System.out.println("\nESTOQUE\n");
					for(String prod : produtos) {
						System.out.println(prod);
					}
			}
		}while(opcRemove == 'S');
		
		leia.close();
	}

}
