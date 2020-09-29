programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real x1
		real x2
		real y1
		real y2
		real resX
		real resY
		real d
		
		escreva("Informe a posição 'X' do ponto 1: ")
		leia(x1)
		escreva("Informe a posição 'Y' do ponto 1: ")
		leia(y1)
		escreva("Informe a posição 'X' do ponto 2: ")
		leia(x2)
		escreva("Informe a posição 'Y' do ponto 2: ")
		leia(y2)

		resX = mat.potencia((x2 - x1), 2)
		resY = mat.potencia((y2 - y1), 2)

		d = mat.raiz((resX + resY), 2)

		escreva("O resultado do cáculo é: " + d)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 541; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */