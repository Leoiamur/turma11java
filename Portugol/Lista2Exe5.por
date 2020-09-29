programa
{
	
	funcao inicio()
	{
		real indice
		
		escreva("Informe o índice de poluição: ")
		leia(indice)

		se(indice<=0.25){
			escreva("Índice de poluição aceitável, nenhuma paralização é necessária.")
		}senao se(indice>0.25 e indice<0.4){
			escreva("As indústrias do 1º grupo terão suas atividades suspensas.")
		}senao se(indice>=0.4 e indice<0.5){
			escreva("As indústrias do 1º e do 2º grupo terão suas atividades suspensas.")
		}senao{
			escreva("As indústrias de todos os grupos terão suas atividades suspensas.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 353; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */