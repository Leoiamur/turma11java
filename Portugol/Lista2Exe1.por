programa
{

	funcao inicio()
	{
		real P
		real E 
		real M

		escreva("Digite o valor do peso(kg): ")
		leia(P)

		E = P - 50
		M = E * 4.00

		se (P > 50){
			escreva("Excesso de " + E + " kg. Sua multa será de R$ " + M + ".")
		} senao{
			E = 0.0
			M = 0.0
			escreva("Variável E = " + E + "\nVariável M = " + M)
			escreva("\nNenhum excesso. Não há multa a ser aplicada.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 261; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */