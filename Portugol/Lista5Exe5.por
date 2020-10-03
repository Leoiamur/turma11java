programa
{
	
	funcao inicio()
	{
		real vetor[5]
		inteiro codigo=0, x=0

		para (x=0; x<5; x++){
			escreva("Digite um número: ")
			leia(vetor[x])
		}

		escreva("Digite o código correspondente à sua vontade: \n")
		escreva("0 - Finaliza o programa.\n")
		escreva("1 - Os números aparecerão na ordem direta.\n")
		escreva("2 - Os números aparecerão na ordem inversa.\n")
		leia(codigo)

		se(codigo == 0){
			escreva("Você digitou o código '0', o programa foi finalizado.")
		}senao{
		se(codigo == 1){e}
			para(x=0; x<5; x+=1){
				escreva(vetor[x] + " / ")
			}senao se(codigo == 2){
				para(x=4; x>0; x-=0){
					escreva(vetor[x] + " / ")
				}
			}
		}senao{
			escreva("Código inválido.")
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 407; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */