programa
{
	
	funcao inicio()
	{
		inteiro numero
		
		escreva("Informe um número inteiro: ")
		leia(numero)

		se(numero == 0){
			escreva("O número 0 é neutro.")
		}senao se(numero < 0){
			escreva("Esse número é negativo, portanto não é nem par nem ímpar.")
		}senao se(numero>0 e numero%2==0){
			escreva("Esse número é positivo e também é um número par.")
		}senao{
			escreva("Esse número é positivo e também é um número ímpar.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 444; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */