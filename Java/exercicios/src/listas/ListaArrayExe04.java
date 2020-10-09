package listas;

import java.util.Scanner;

public class ListaArrayExe04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		final int LIM = 2;
		double A[][] = new double [LIM][LIM];
		double B[][] = new double [LIM][LIM];
		double C[][] = new double [LIM][LIM];
		int x = 0, y = 0;
		double constante;
		byte opc = 1;
		
		for(x = 0; x < LIM; x++) {
			for(y = 0; y < LIM; y++) {
				System.out.printf("Digite o valor de A[%d][%d]: ", x, y);
				A[x][y] = scan.nextDouble();
			}
		}
		System.out.println();
		
		for(x = 0; x < LIM; x++) {
			for(y = 0; y < LIM; y++) {
				System.out.printf("Digite o valor de B[%d][%d]: ", x, y);
				B[x][y] = scan.nextDouble();
			}
		}
		System.out.println();
		System.out.println("Escolha uma opção: ");
		System.out.println();
		System.out.print("Digite 1 - Para fazer a soma das matrizes.\nDigite 2 - Para fazer a subtração da primeira matriz com a segunda.\nDigite 3 - Para adicionar uma constante às duas matrizes.\nDigite 4 - Para imprimir as matrizes.\n");
		System.out.print("Opção: ");
		opc = scan.nextByte();
		while (opc != 1 && opc != 2 && opc != 3 && opc != 4) {
			System.out.println("\nOpção inválida!\n");
			System.out.print("Digite 1 - Para fazer a soma das matrizes.\nDigite 2 - Para fazer a subtração da primeira matriz com a segunda.\nDigite 3 - Para adicionar uma constante às duas matrizes.\nDigite 4 - Para imprimir as matrizes.\n");
			System.out.print("Opção: ");
			opc = scan.nextByte();
		}
		
		if(opc == 1) { 
			for(x = 0; x < LIM; x++) {
				for(y = 0; y < LIM; y++) {
					C[x][y] = A[x][y] + B[x][y];
				}
			}
			System.out.println();
			System.out.println("Matriz A: ");
			for(x = 0; x < LIM; x++) {
				for (y = 0; y < LIM; y++) {
					System.out.print("\t" + A[x][y] + "\t");
					}
				System.out.println();
				}
			System.out.println();
			System.out.println("Matriz B: ");
			for(x = 0; x < LIM; x++) {
				for (y = 0; y < LIM; y++) {
					System.out.print("\t" + B[x][y] + "\t");
					}
				System.out.println();
				}
			System.out.println();
			System.out.println("Matriz C (A + B): ");
			for(x = 0; x < LIM; x++) {
				for (y = 0; y < LIM; y++) {
					System.out.print("\t" + C[x][y] + "\t");
					}
				System.out.println();
				}
		}
		else if (opc == 2) {
			for(x = 0; x < LIM; x++) {
				for(y = 0; y < LIM; y++) {
					C[x][y] = B[x][y] - A[x][y];
				}
			}
			System.out.println();
			System.out.println("Matriz A:");
			for(x = 0; x < LIM; x++) {
				for (y = 0; y < LIM; y++) {
					System.out.printf("\t" + A[x][y] + "\t");
					}
				System.out.println();
				}
			System.out.println();
			System.out.println("Matriz B:");
			for(x = 0; x < LIM; x++) {
				for (y = 0; y < LIM; y++) {
					System.out.printf("\t" + B[x][y] + "\t");
					}
				System.out.println();
				}
			System.out.println();
			System.out.println("Matriz C (B - A):");
			for(x = 0; x < LIM; x++) {
				for (y = 0; y < LIM; y++) {
					System.out.printf("\t" + C[x][y] + "\t");
					}
				System.out.println();
				}
		}
		else if (opc == 3) { 
			System.out.print("Digite um valor: ");
			constante = scan.nextDouble();
			for(x = 0; x < LIM; x++) {
				for(y = 0; y < LIM; y++) {
					A[x][y] = A[x][y] + constante;
					B[x][y] = B[x][y] + constante;
				}
			}
			System.out.println();
			System.out.println("Matriz A:");
			for(x = 0; x < LIM; x++) {
				for (y = 0; y < LIM; y++) {
					System.out.printf("\t" + A[x][y] + "\t");
					}
				System.out.println();
				}
			System.out.println();
			System.out.println("Matriz B:");
			for(x = 0; x < LIM; x++) {
				for (y = 0; y < LIM; y++) {
					System.out.printf("\t" + B[x][y] + "\t");
					}
				System.out.println();
				}
		}
		else if (opc == 4) { 
			System.out.println();
			System.out.println("Matriz A:");
			for(x = 0; x < LIM; x++) {
				for (y = 0; y < LIM; y++) {
					System.out.printf("\t" + A[x][y] + "\t");
					}
				System.out.println();
				}
			System.out.println();
			System.out.println("Matriz B:");
			for(x = 0; x < LIM; x++) {
				for (y = 0; y < LIM; y++) {
					System.out.printf("\t" + B[x][y] + "\t");
					}
				System.out.println();
				}
		}
		
		scan.close();
	}

}
