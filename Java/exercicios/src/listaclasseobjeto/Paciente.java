package listaclasseobjeto;

public class Paciente {
	
	public String nome;
	public char sexo;
	public int idade;
	public String doenca;
		
		public String getPc() {
			
			String Pc ="\nDados do paciente: \n" + "\nNome: " + nome +"\nSexo: " + sexo + "\nIdade: " + idade + " anos\nDoença: " + doenca;
			return Pc;
			
		}

}
