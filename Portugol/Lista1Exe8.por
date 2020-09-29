programa
{
	
	funcao inicio()
	{
		inteiro percDist
		inteiro percImpost
		real custoFab
		real valorDist
		real valorImpost
		real custoCons

		percDist = 28
		percImpost = 45

		escreva("Informe o valor do custo de fábrica: ")
		leia(custoFab)

		valorDist = custoFab + (custoFab * percDist / 100)
		valorImpost = custoFab + (custoFab * percImpost / 100)
		custoCons = custoFab + valorDist + valorImpost

		escreva("O custo desse carro ao consumidor será: " + custoCons)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 472; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */