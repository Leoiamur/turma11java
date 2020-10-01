programa
{
	
	funcao inicio()
	{
		cadeia alunos[4]
		real notas[4], maiorNota = 0

		para(inteiro x = 0; x<4; x++){
			escreva("Digite o nome do(a) aluno(a) " + (x+1) + ": ")
			leia(alunos[x])
			escreva("Digite a nota do(a) aluno(a) " + (x+1) + ": ")
			leia(notas[x])
			se(notas[x] > maiorNota){
				maiorNota = notas[x]

			}
		}

		para(inteiro x=0; x<4; x++){
			se(notas[x]==maiorNota){
				escreva("Aluno(a) " + alunos[x] + "* / Nota: " + notas[x] + "*\n")
			}senao
			escreva("Aluno(a) " + alunos[x] + " / Nota: " + notas[x] + "\n")
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 554; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */