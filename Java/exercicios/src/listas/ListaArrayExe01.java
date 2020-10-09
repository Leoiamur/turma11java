package listas;

public class ListaArrayExe01 {

	public static void main(String[] args) {
		
		int vetorA [] = { 1 , 0 , 5 , - 2 , - 5 , 7 };
		int soma = vetorA [ 0 ] + vetorA [ 1 ] + vetorA [ 5 ];
		
		System.out.printf("A soma dos valores pedidos do vetor é: %d\n", soma);
		
		vetorA[4] = 100;
		
		for(int x=0; x<vetorA.length; x++ ){
			System.out.printf("O valor do vetor na posição %d é de: %d\n", x, vetorA [x]);
		}

	}

}
