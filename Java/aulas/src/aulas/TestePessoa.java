package aulas;

public class TestePessoa {

	public static void main(String[] args) {
		
		Pessoa1 leonardo = new Pessoa1("Leonardo", 555);
		Funcionario pedro = new Funcionario("Pedro", 222, "TI");
		Pessoa1 maria = new Funcionario("Maria", 333, "Desenvolvedora");
		Pessoa1 carlos = new Coordenador("Carlos", 444, "Ciência da Computação");
		
		System.out.println(leonardo.getMatricula());
		System.out.println(pedro.getDepartamento());
		System.out.println(maria.getMatricula());
		System.out.println(carlos.getNome());

	}

}
