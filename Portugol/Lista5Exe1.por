programa
{
	
	funcao inicio()
	{
		const inteiro LIMITE = 4
		cadeia produtos[] = {"Camisa", "Calça", "Camiseta", "Vestido"}
		real precos[] = {100.0, 300.5, 90.75, 250.0}, calculo = 0.0
		inteiro x=0
		inteiro = codigo = 0
		inteiro = pgto = 0

		para(x=0; x<LIMITE; x++){
			escreva("Código do produto: " + (x+1) + " - " + produtos[x] + " - R$" + precos[x] + "\n")
		}

		escreva("Digite o código do produto que você dseja comprar: ")
		leia(codigo)
		codigo = codigo--
		limpa()
		escreva("Escolha agora a forma de pagamento:\n")
		escreva("Digite 1 para pagamento à vista em dinheiro ou cheque com 20% de desconto.\n")
		escreva("Digite 2 para pagamento à vista no cartão de crédito com 15% de desconto.\n")
		escreva("Digite 3 para pagamento em duas vezes com o preço normal sem juros.\n")
		escreva("Digite 4 para pagamento em três vezes com o preço normal mais 10% de juros.\n")
		leia(pgto)
		limpa()

		se(pgto == 1){
			calculo = precos[codigo] - (((precos[codigo]) * 20) / 100)
			escreva("O valor desse produto à vista no dinheiro ou cheque é RS" + calculo)
		}senao se(pgto == 2){
			calculo = precos[codigo] - (((precos[codigo]) * 15) / 100)
			escreva("O valor desse produto à vista no cartão de crédito é RS" + calculo)
		}senao se(pgto == 3){
			escreva("O valor desse produto no pagamento em duas vezes é RS" + precos[codigo])
		}senao se(pgto == 4){
			calculo = precos[codigo] + (((precos[codigo]) * 10) / 100)
			escreva("O valor desse produto no pagamento é três vezes é RS" + calculo)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 832; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */