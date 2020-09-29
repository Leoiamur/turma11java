programa
{
	
	funcao inicio()
	{
		//Receber o usuário um nome e mandar uma mensagem de "Bom dia!"
		//Colocar sr ou sra conforme a opção
		cadeia nome
		caracter opcao

		escreva("Digite o seu nome: ")
		leia(nome)

		escreva("Digite M para masculino ou F para feminino: ")
		leia(opcao)

		se (opcao == 'F'){
			escreva("Bom dia, Sra. " + nome + "!")
		}senao se (opcao == 'f'){
			escreva("Bom dia, Sra. " + nome + "!")
		}senao se (opcao == 'M'){
			escreva("Bom dia, Sr. " + nome + "!")
		}senao se (opcao == 'm'){
			escreva("Bom dia, Sr. " + nome + "!")
		}senao{
			escreva("Bom dia, Srx. " + nome + "!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 616; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */