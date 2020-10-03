programa
{
	
	funcao inicio()
	{
		const inteiro LIMITE = 3
		inteiro vetor[3], matriz[3][3]

		para(inteiro x=0; x<LIMITE; x++){
			escreva ("Digite o valor do ", x + 1, "º elemento do vetor: ")
			leia (vetor [x])
		}

		para(inteiro x=0; x<LIMITE; x++){
			para(inteiro z=0; z<LIMITE; z++){
				escreva ("Digite o valor da linha ", x+1, " e coluna ", z+1, ": ")
				leia (matriz [x] [z])
			}
		}

		para(inteiro x=0; x<LIMITE; x++){
			para(inteiro z=0; z<LIMITE; z++){
				escreva("A multiplicação do valor do vetor pela coluna da matriz nessa posição é: " + vetor[x] * matriz[x][z] +"\n")		
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 593; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */