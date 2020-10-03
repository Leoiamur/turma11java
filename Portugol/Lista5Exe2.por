programa
{
	
	funcao inicio()
	{
		real imc = 0.0, altura = 0.0, peso = 0.0

		escreva("Digite sua altura: ")
		leia(altura)
		escreva("Digite seu peso: ")
		leia(peso)
		limpa()

		imc = peso / (altura * altura)

		se(imc < 18.5){
			escreva("Seu IMC é: " + imc + " - Classificado como abaixo do peso.")
		}senao se(imc >= 18.5 e imc < 25.0){
			escreva("Seu IMC é: " + imc + " - Classificado como peso normal.")
		}senao se(imc >= 25.0 e imc < 30.0){
			escreva("Seu IMC é: " + imc + " - Classificado como acima do peso.")
		}senao{
			escreva("Seu IMC é: " + imc + " - Classificado como obeso.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 262; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */