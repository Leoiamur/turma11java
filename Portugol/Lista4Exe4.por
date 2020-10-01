programa
{
	
	funcao inicio()
	{
		const inteiro LIMITELINHA = 3, LIMITECOLUNA = 3
		inteiro valores[3][3], l = 0, c = 0, totalDiagonal = 0, totalMatriz = 0

		para(l=0; l<LIMITELINHA; l++){
			para(c=0; c<LIMITECOLUNA; c++){
				escreva("Digite o valor da linha " + l + " e coluna " + c, ": ")
				leia(valores[l][c])
				totalMatriz = totalMatriz + valores[l][c]
				se(l==c){
					totalDiagonal = totalDiagonal + valores[l][c]
				}
			}
		}

		escreva("A soma dos valores da matriz é: " + totalMatriz + ".")
		escreva("\nA soma da diagonal principal é: " + totalDiagonal + ".")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 292; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */