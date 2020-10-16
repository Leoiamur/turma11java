package aulas;

public class PessoaFisica extends Pessoa3 {
	
	private long cpf;
	
	public PessoaFisica() {
		
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return "Pessoa Física: " + super.getNome() + " - CPF: " + this.getCpf();
	}

}
