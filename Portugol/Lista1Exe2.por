programa
{
	
	funcao inicio()
	{
		inteiro idade
		inteiro idadeEmAnos
		inteiro idadeEmMeses
		inteiro idadeEmDias
		
		escreva("Digite sua idade em dias: ")
		leia(idade)

		idadeEmAnos = idade / 365
		idadeEmMeses = (idade % 365) / 30
		idadeEmDias = (idade % 365) % 30

		escreva("Você tem " + idadeEmAnos + " anos, " + idadeEmMeses + " meses e " + idadeEmDias + " dias.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 381; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */