programa
{
	
	funcao inicio()
	{
		inteiro numA
		inteiro numB
		inteiro numC
		real numR
		real numS
		real res
		
		escreva("Digite o primeiro número: ")
		leia(numA)
		escreva("Digite o segundo número: ")
		leia(numB)
		escreva("Digite o terceiro número: ")
		leia(numC)

		numR = (numA + numB) * (numA + numB)
		numS = (numB + numC) * (numB + numC)

		res = (numR + numS) / 2

		escreva("O resultado da expressão é: " + res)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 433; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */