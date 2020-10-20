package aplicacoes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TesteArquivo {

	public static void main(String[] args) {
		
		Scanner leia = null;
		
		File arquivo = new File("C:\\temp\\lista.txt");
		
		try {
			leia = new Scanner(arquivo);
			while(leia.hasNextLine()) {
				System.out.println(leia.nextLine());
			}
		}catch(FileNotFoundException erro){
			System.out.println("Você não possui esse arquivo");
		}finally {
			if(leia != null) {
				leia.close();
			}
		}
		
		System.out.println("FIM DE PROGRAMA");

	}

}
