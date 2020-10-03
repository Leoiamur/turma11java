programa
{
	
	funcao inicio()
	{
		inteiro n=0, g1=0, g2=0, g3=0, g4=0

		enquanto(n>=0){
			escreva("Digite um número inteiro (O programa só vai parar quando você digitar um número negativo): ")
			leia(n)
			limpa()

			se(n>=0 e n<26){
				g1 = g1 + 1
			}senao se(n>=26 e n<51){
				g2 = g2 + 1
			}senao se(n>=51 e n<76){
				g3 = g3 + 1
			}senao se(n>=76 e n<=100){
				g4 = g4 + 1
			}
		}

		escreva("O programa foi finalizado, pois um número negativo foi digitado.\n")
		escreva(g1 + " números digitados estavam dentro do intervalo do Grupo 1 (0-25)\n")
		escreva(g2 + " números digitados estavam dentro do intervalo do Grupo 2 (26-50)\n")
		escreva(g3 + " números digitados estavam dentro do intervalo do Grupo 3 (51-75)\n")
		escreva(g4 + " números digitados estavam dentro do intervalo do Grupo 4 (76-100)\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 217; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */