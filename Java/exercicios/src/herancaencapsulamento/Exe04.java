package herancaencapsulamento;

public class Exe04 {

	public static void main(String[] args) {
		
		Pessoa2 pedro = new Pessoa2("Pedro", "Rua dos Batatais, n� 352", "99999-9999");
		Administrador juca = new Administrador("Juca", "Rua dos Jabutis, n� 410", "96666-6666", 550);
		
		System.out.println("\nDADOS DO PEDRO: \n");
		System.out.println("Nome: " + pedro.getNome());
		System.out.println("Endere�o: " + pedro.getEndereco());
		System.out.println("Telefone: " + pedro.getTelefone());
		
		System.out.println("\nDADOS DO ADMINISTRADOR: \n");
		System.out.println("Nome: " + juca.getNome());
		System.out.println("Endere�o: " + juca.getEndereco());
		System.out.println("Telefone: " + juca.getTelefone());
		System.out.println("Ajuda de custo: R$" + juca.getAjudaDeCusto());

	}

}
