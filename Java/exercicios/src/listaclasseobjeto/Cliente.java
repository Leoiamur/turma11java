package listaclasseobjeto;

public class Cliente {
	
	public String nome;
	public char sexo;
	public String cpf;
		
		public String getCl() {
			
			String Cl ="\nDados do cliente: \n" + "\nNome: " + nome +"\nSexo: " + sexo + "\nCPF: " + cpf;
			return Cl;
			
		}

}
