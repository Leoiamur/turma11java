programa
{
	
	funcao inicio()
	{
		inteiro valor[5], x=0, maiorValor = 0

		para(x=0; x<5; x++){
			escreva("Digite a pontuação número " + (x+1) + ": ")
			leia(valor[x])
			se(valor[x] > maiorValor){
				maiorValor = valor[x]
			}
		}
		limpa()
		para(x=0; x<5; x++){
			escreva("A pontuação " + (x+1) + " é: " + valor[x] + "\n")
		}

		escreva("\nA maior pontuação é: " + maiorValor)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 385; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */