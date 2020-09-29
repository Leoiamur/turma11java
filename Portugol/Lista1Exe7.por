programa
{
	
	funcao inicio()
	{
		real numA, numB, numC, numD, numE, numF, x, y
		
		escreva("Digite o valor de 'A': ")
		leia(numA)
		escreva("Digite o valor de 'B': ")
		leia(numB)
		escreva("Digite o valor de 'C': ")
		leia(numC)
		escreva("Digite o valor de 'D': ")
		leia(numD)
		escreva("Digite o valor de 'E': ")
		leia(numE)
		escreva("Digite o valor de 'F': ")
		leia(numF)

		x = ((numC * numE) - (numB * numF)) / ((numA * numE) - (numB * numD))

		y = ((numA * numF) - (numC * numD)) / ((numA * numE) - (numB * numD))

		escreva("O valor de 'X' é: " + x)
		escreva("\nO valor de 'Y' é: " + y)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 582; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */