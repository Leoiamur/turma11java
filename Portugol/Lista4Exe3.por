programa
{
	
	funcao inicio()
	{
		inteiro N1[4][6], N2[4][6], M1[4][6], M2[4][6]

		para(inteiro l=0; l<4; l++){
			para(inteiro c=0; c<6; c++){
				escreva("Digite o valor da linha " + (l+1) + " coluna " + (c+1) + " do primeiro vetor: \n")
				leia(N1[l][c])
				escreva("Digite o valor da linha " + (l+1) + " coluna " + (c+1) + " do segundo vetor: \n")
				leia(N2[l][c])
				M1[l][c] = N1[l][c] + N2[l][c]
				M2[l][c] = N1[l][c] - N2[l][c]

				escreva("O valor de N1 na posição [" + (l+1) + "] [" + (c+1) + "] é de:" + N1 [l] [c] + "\n")
			
				escreva("O valor de N2 na posição [" + (l+1) + "] [" + (c+1) + "] é de:" + N2 [l] [c] + "\n")
			
				escreva("O valor de M1 na posição [" + (l+1) + "] [" + (c+1) + "] é de:" + M1 [l] [c] + "\n")
			
				escreva("O valor de M2 na posição [" + (l+1) + "] [" + (c+1) + "] é de:" + M2 [l] [c] + "\n")77
				
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 856; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */