programa
{
	
	funcao inicio()
	{
		inteiro idade
		
		escreva("Informe a idade do nadador: ")
		leia(idade)

		se(idade>=18){
			escreva("A categoria desse nadador é Adulto.")
		}senao se(idade>=14 e idade<=17){
			escreva("A categoria desse nadador é Juvenil B.")
		}senao se(idade>=12 e idade<=13){
			escreva("A categoria desse nadador é Juvenil A.")
		}senao se(idade>=8 e idade<=11){
			escreva("A categoria desse nadador é Infantil B.")
		}senao se(idade>=5 e idade<=7){
			escreva("A categoria desse nadador é Infantil A.")
		}senao{
			escreva("O nadador é jovem demais para estar em uma categoria.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 612; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */