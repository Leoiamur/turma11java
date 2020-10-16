package aulas;

public class TestePolimorfismo {

	public static void main(String[] args) {
		
		PessoaFisica fisica = new PessoaFisica();
		fisica.setNome("Juliana");
		fisica.setCpf(123456789012L);
		
		PessoaJuridica juridica = new PessoaJuridica();
		juridica.setNome("Juliano");
		juridica.setCnpj(1112332443454634L);
		
		Pessoa3[] pessoas = new Pessoa3[2];
		pessoas[0] = fisica;
		pessoas[1] = juridica;
		
		for(Pessoa3 pessoa: pessoas) {
			System.out.println(pessoa.getNome());
		}

	}

}
