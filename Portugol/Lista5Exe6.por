programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		const inteiro LIMITE = 3
		inteiro vetor[LIMITE], matriz[LIMITE][LIMITE], x = 0, y = 0, linha = 0, coluna = 0
		inteiro resultado[LIMITE], resultadoMatriz[LIMITE][LIMITE]

		escreva("Preenchendo o vetor... \n")
		para(x=0; x<LIMITE; x++){
			vetor[x] = Util.sorteia(1, 10)
			escreva(vetor[x])
			escreva("\n")
		}

		escreva("Preenchendo a matriz... \n")
		para(linha=0; linha<LIMITE; linha++){
			para(coluna=0; coluna<LIMITE; coluna++){
				matriz[linha][coluna] = Util.sorteia(1, 10)
				escreva("Linha: " + linha + " / Coluna: " + coluna + " - Valor = " + matriz[linha][coluna] + "\n")
			}
		}

		para(coluna=0; coluna<LIMITE; coluna++){
			para(linha=0; linha<LIMITE; linha++){
				resultado[coluna] = resultado[coluna] + (vetor[coluna] * matriz[linha][coluna])//versão somando os números multiplicados
				resultadoMatriz[linha][coluna] = vetor[coluna] * matriz[linha][coluna]//versão colocando os números multiplicados em uma nova matriz
			}
		}

		escreva("\n")
		escreva("Mostrando o resultado somatório: \n")
		para(x=0; x<LIMITE; x++){
			escreva(resultado[x])
			escreva(" ")
		}

		escreva("\n")
		escreva("Mostrando a nova matriz: \n")
		para(linha=0; linha<LIMITE; linha++){
			para(coluna=0; coluna<LIMITE; coluna++){
				escreva(resultadoMatriz[linha][coluna]) 
				escreva(" / ")
			}
			escreva("\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1356; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */