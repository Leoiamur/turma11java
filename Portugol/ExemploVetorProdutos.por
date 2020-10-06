programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		cadeia produtos[] = {"Camisa", "Calça", "Vestido"}
		real precos[3], precoFinal=0
		inteiro x=0, codigo[3], vcod=0, vop=0

		escreva("CÓDIGO\tPRODUTO\t\t\tPREÇO\n")
		para(x=0; x<3; x++){
			precos[x] = Util.sorteia(10, 50)
			codigo[x] = (x+1)
			escreva(codigo[x] +"\t" + produtos[x] + "\t\t\tR$" + precos[x] + "\n")
		}
		escreva("Digite o código do produto que deseja comprar: \n")
		leia(vcod)
		escreva("Digite 1 para pagamento à vista com 10% de desconto: \n")
		escreva("Digite 2 para pagamento em uma vez no cartão: \n")
		escreva("Digite 3 para pagamento em 3 vezes com juros de 10%: \n")
		leia(vop)

		se(vop==1){
			precoFinal = precos[vcod-1] - (precos[vcod-1] * 0.1)
			escreva("Valor final do produto: R$" + precoFinal)
		}senao se(vop==2){
			escreva("Valor final do produto: R$" + precoFinal)
		}senao se(vop==3){
			precoFinal = precos[vcod-1] + (precos[vcod-1] * 0.1)
			escreva("Valor final do produto: R$" + precoFinal + " em 3 vezes de R$" + precoFinal/3)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 34; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */