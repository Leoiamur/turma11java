programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		const inteiro LIMITE = 10
		inteiro valoresDado[LIMITE], maiorValor = 0, maior = 0, contadorMaior = 1
		real contador = 0
		
		escreva("Sorteando valores...")
		pula()
		para (inteiro x = 0 ; x < LIMITE; x++) {
			valoresDado[x] = Util.sorteia(1, 6)
			contador = contador + valoresDado[x]
			se(valoresDado[x] > maior){
				maior = valoresDado[x]
			}senao se(valoresDado[x] == maior){
					contadorMaior++
				}
		}
		para (inteiro x = 0; x < LIMITE; x++){
			escreva("O valor ",(x+1), " foi ",valoresDado[x])
			pula()
			
		}

		escreva("A média aritmética dos lançamentos foi: " + (contador/10))
		escreva("\nA maior pontuação ocorreu " + contadorMaior + " vezes.")
		
		
	}
	funcao pula(){
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 160; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */