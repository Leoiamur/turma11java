programa
{
	
	funcao inicio()
	{
		inteiro numero = 0, soma = 0, totalDeNumeros = 0
		real = media = 0.0
		
		enquanto (numero>=0){
		escreva("Digite um número: ")
		leia(numero)
		totalDeNumeros = totalDeNumeros + 1
		soma = soma + numero
		media = soma/totalDeNumeros
		}

		escreva("Somatório: " + soma)
		escreva("\nMédia: " + media)
		escreva("\nTotal de números: " + totalDeNumeros)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 12; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */