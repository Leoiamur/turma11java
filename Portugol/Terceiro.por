programa
{
	
	funcao inicio()
	{
		cadeia nomeUsuario
		inteiro anoNascimento
		real salarioUsuario
		inteiro idadeUsuario

		idadeUsuario = 0
		
		escreva("Digite o nome do usuário: ")
		leia(nomeUsuario)
		escreva("Digite o ano de nascimento do usuário: ")
		leia(anoNascimento)
		escreva("Digite o salário do usuário: ")
		leia(salarioUsuario)
		escreva("Oi, meu nome é " + nomeUsuario + ".")
		escreva("\nNasci em " + anoNascimento + ".")
		escreva("\nMeu salário é de R$" + salarioUsuario + ".")
		idadeUsuario = 2020 - anoNascimento
		escreva("\nEu tenho " + idadeUsuario + " anos.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 560; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */