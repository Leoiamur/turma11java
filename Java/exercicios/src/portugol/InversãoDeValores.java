package portugol;

import java.util.Scanner;

public class Invers�oDeValores {
	
	public static void main(String[] args)	{
		
		Scanner leia = new Scanner(System.in);
		
		int a=0,b=0;
		System.out.print("LEIA A: ");
		a = leia.nextInt();
		System.out.print("LEIA B: ");
		b = leia.nextInt();
		System.out.printf("VALORES ANTES DA INVERS�O A: %d B: %d",a,b);
		a = a + b; //2+3 = 5
		b = a - b; //5-3 = 2
		a = a - b; //5-2 = 3
		System.out.println();
		System.out.printf("VALORES AP�S A INVERS�O A: %d B: %d",a,b);
		leia.close();
	}
}

