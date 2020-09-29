programa
{

	funcao inicio()
	{
		inteiro C
		real N
		real E
		real salario
		real excedente

		escreva("Digite o código do operário: ")
		leia(C)
		escreva("Digite o número de horas trabalhadas pelo operário: ")
		leia(N)

		se (N > 50){
			E = N - 50
			salario = 50 * 10
			excedente = E * 20
			escreva("O Funcionário do código " + C + " tem o salário de R$" + salario + ". Com um excedente de R$" + excedente + ".")
		}
		senao{
			E = 0
			salario = N * 10.00
			escreva("O Funcionário do código " + C + " tem o salário de R$" + salario + ". Sem nenhum excedente.")
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 570; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */