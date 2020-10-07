package listas;

import java.util.Scanner;

public class ListaLacoExe03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int idade=0;
		
		System.out.print("Digite sua idade: ");
		idade = scan.nextInt();
		
		if(idade >= 10 && idade < 15) {
			System.out.println("Sua idade se encaixa na categoria Infantil.");
		}else if(idade>=15 && idade<18) {
			System.out.println("Sua idade se encaixa na categoria Juvenil.");
		}else if(idade>=18 && idade<26) {
			System.out.println("Sua idade se encaixa na categoria Adulto.");
		}else {
			System.out.println("Sua idade não se encaixa em nenhuma categoria.");
		}
		
		scan.close();
	}

}
