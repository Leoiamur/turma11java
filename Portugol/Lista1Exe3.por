programa
{
	
	funcao inicio()
	{
		inteiro tempoDuracao
		inteiro segundos
		inteiro minutos
		inteiro horas

		escreva("Escreva o tempo de duração do envento na fábrica em segundos: ")
		leia(tempoDuracao)

		horas = tempoDuracao / 3600
		minutos = (tempoDuracao % 3600) / 60
		segundos = (tempoDuracao % 3600) % 60

		escreva("O evento durou " + horas + " hora(s), " + minutos + " minuto(s) e " + segundos + " segundo(s).")
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 422; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */