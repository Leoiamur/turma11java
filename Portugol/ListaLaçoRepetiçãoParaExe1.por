programa
{
	
	funcao inicio()
	{
		inteiro numFilhos=0, hab, totalFilhos=0
		real salario=0, salarioTotal=0, salario100=0, maiorSalario=0, mediaFilhos=0

		para(hab=1; hab <=20; hab++){
			escreva("Digite o salário do habitante " + hab + ": ")
			leia(salario)
			salarioTotal = salario + salarioTotal

			escreva("Digite o número de filhos do habitante " + hab + ": ")
			leia(numFilhos)
			totalFilhos = totalFilhos + numFilhos

			se(salario <=100){
				salario100 = salario100 + 1
			}

			se(salario > maiorSalario){
				maiorSalario = salario
			}

		}

			hab = 20
			mediaFilhos = totalFilhos/hab
			limpa()

			escreva("Média de salário da população: R$" + salarioTotal/hab)
			escreva("\nMédia de filhos: " + mediaFilhos)
			escreva("\nMaior salário: R$" + maiorSalario)
			escreva("\nNúmero de pessoas que recebem até R$100,00: " + salario100)
			escreva("\nPercentual de pessoas com salário até R$100,00: " + salario100*100/hab + "%.")

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 176; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */