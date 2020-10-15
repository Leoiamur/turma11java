package listaclasseobjeto;

public class Eletronico {
	
	public String nome;
	public double valor;
	public String cor;
	
		public String getEl() {
		
		String El ="\nDados do produto eletrônico: \n" + "\nNome: " + nome +"\nValor: R$" + valor + "\nCor: " + cor;
		return El;
		
		}

}
