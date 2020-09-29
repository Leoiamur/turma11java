programa
{
	
	funcao inicio()
	{
		inteiro valor1
		inteiro valor2
		inteiro valor3
		inteiro valor4
		inteiro quadrado1 = 0
		inteiro quadrado2 = 0
		inteiro quadrado3 = 0
		inteiro quadrado4 = 0
		
		escreva("Digite o valor 1: ")
		leia(valor1)
		escreva("Digite o valor 2: ")
		leia(valor2)
		escreva("Digite o valor 3: ")
		leia(valor3)
		escreva("Digite o valor 4: ")
		leia(valor4)

		quadrado1 = valor1 * valor1
		quadrado2 = valor2 * valor2
		quadrado3 = valor3 * valor3
		quadrado4 = valor4 * valor4

		se(quadrado3 >= 1000){
			escreva("O valor 3 é " + valor3 + " e seu quadrado é " + quadrado3)
		}senao{
			escreva("Valor 1 é " + valor1 + " e seu quadrado é " + quadrado1)
			escreva("\nValor 2 é " + valor2 + " e seu quadrado é " + quadrado2)
			escreva("\nValor 3 é " + valor3 + " e seu quadrado é " + quadrado3)
			escreva("\nValor 4 é " + valor4 + " e seu quadrado é " + quadrado4)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 897; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */