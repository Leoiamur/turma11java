package entidades;

public abstract class Sujeito {
	//atributos
	private String nome;
	private int anoNascimento;
	private char sexo;
	//construtores
	public Sujeito() {
		
	}
	public Sujeito(String nome) {
		this.nome = nome;
	}
	public Sujeito(String nome, char sexo) {
		this.nome = nome;
		this.sexo = sexo;
	}
	public Sujeito(String nome, int anoNascimento, char sexo) {
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.sexo = sexo;
	}
	//encapsulamento
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	//métodos
	public int idade() {
		int idade;
		idade = 2020 - this.anoNascimento;
		return idade;
	}
	//sobrecarga do método
		public int idade(int anoAtual) {
			int idade;
			idade = anoAtual - this.anoNascimento;
			return idade;
		}
	
}
