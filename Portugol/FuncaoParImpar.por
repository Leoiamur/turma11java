programa
{
	
	funcao inicio()
	{
		//calcular uma funcao que calcule par ou ímpar para um num inteiro
		//se par => msg par
		//se impar => msg impar
		//se 0 => msg zero
		inteiro valorInicio
		escreva("Escreva um valor: ")
		leia(valorInicio)
		parImpar(valorInicio)
	}
	funcao parImpar (inteiro valor) {
		se (valor>=0){
			se(valor==0){
				escreva("O valor é Zero")
			}senao se(valor%2 == 0){
				escreva("O valor é par")
			}senao{
				escreva("O valor é ímpar")
			}
		}senao{
			escreva("Valor menor que zero")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 528; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */