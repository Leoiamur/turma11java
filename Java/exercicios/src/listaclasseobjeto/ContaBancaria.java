package listaclasseobjeto;

public class ContaBancaria {
	
	public String banco;
	public int agencia;
	public int conta;
	public double valor;
	
		public String getCb() {
		
			String Cb ="\nDados da conta banc�ria: \n" + "\nBanco: " + banco +"\nAg�ncia: " + agencia + "\nConta: " + conta + "\nValor em conta: R$" + valor;
			return Cb;
		
		}

}
