package herancaencapsulamento;

public class Exe06 {

	public static void main(String[] args) {
		
		Pessoa2 pedro = new Pessoa2("Pedro", "Rua dos Batatais, n� 352", "99999-9999");
		Vendedor rafael = new Vendedor("Rafael", "Rua dos Trabalhadores, n� 2152", "94444-4444", 10671, 532);
		
		System.out.println("\nDADOS DO PEDRO: \n");
		System.out.println("Nome: " + pedro.getNome());
		System.out.println("Endere�o: " + pedro.getEndereco());
		System.out.println("Telefone: " + pedro.getTelefone());
		
		System.out.println("\nDADOS DO VENDEDOR: \n");
		System.out.println("Nome: " + rafael.getNome());
		System.out.println("Endere�o: " + rafael.getEndereco());
		System.out.println("Telefone: " + rafael.getTelefone());
		System.out.println("Valor de Vendas: R$" + rafael.getValorVendas());
		System.out.println("Comiss�o: R$" + rafael.getComissao());


	}

}
