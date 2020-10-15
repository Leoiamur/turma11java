package entidades;

public class Pessoa {
	
	private String nome;
	private int anoNascimento;
	private char sexo;
	
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

	public Pessoa() {//CONSTRUTOR PADRÃO - VAZIO
		
	}
	
	public Pessoa(String nome, int anoNascimento, char sexo) {
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.sexo = sexo;
		
		}
	
	public int calcIdade() {
		return 2020 - this.anoNascimento;
	}
	
	public void mostraSexo() {
		if(this.sexo == 'F') {
			System.out.println("Feminino");
		}else if(this.sexo == 'M') {
			System.out.println("Masculino");
		}else if(this.sexo == 'O') {
			System.out.println("Outros");
		}else {
			System.out.println("Você não digitou uma opção de sexo válida.");
		}
	}
}
