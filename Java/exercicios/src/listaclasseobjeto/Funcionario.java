package listaclasseobjeto;

public class Funcionario {
	
	public String nome;
	public char sexo;
	public String cpf;
	public int idade;
	public String cargo;
		
		public String getFu() {
			
			String Fu ="\nDados do funcion�rio: \n" + "\nNome: " + nome +"\nSexo: " + sexo + "\nCPF: " + cpf + "\nIdade: " + idade + " anos\nCargo: " + cargo;
			return Fu;
			
		}

}
