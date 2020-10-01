programa
{
	
	funcao inicio()
	{
		real tempCelsius = 0, tempFahr = 0
		caracter opc = ' '
		inteiro contador = 0

		faca{
			limpa()
			escreva("Digite a temperatura em graus Celsius: ")
			leia(tempCelsius)

			tempFahr = (((9 * tempCelsius) + 160) / 5)

			escreva("Essa temperatura em graus Fahrenheit é: " + + tempFahr + "F")

			escreva("\nDeseja continuar? Digite 'S' para Sim ou 'N' para Não: ")
			leia(opc)

			enquanto(opc != 'S' e opc != 's' e opc != 'N' e opc != 'n'){
				escreva("Você não digitou 'S' ou 'N', tente de novo: ")
				leia(opc)
				contador++
				se(contador > 3){
					escreva("NÃO SEJA IDIOTA! Digite apenas a letra 'S' para continuar ou a letra 'N' para finalizar o programa: ")
				}
			}

		}enquanto((opc == 'S') ou (opc == 's'))
			limpa()
			escreva("Fim do programa.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 808; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */