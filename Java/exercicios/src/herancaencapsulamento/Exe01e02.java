package herancaencapsulamento;

public class Exe01e02 {

	public static void main(String[] args) {
		
		Pessoa2 pedro = new Pessoa2("Pedro", "Rua dos Batatais, n� 352", "99999-9999");
		Fornecedor paulo = new Fornecedor("Paulo", "Rua dos Bananais, n� 455", "98888-8888", 500, 350);
		
		System.out.println("\nDADOS DO PEDRO: \n");
		System.out.println("Nome: " + pedro.getNome());
		System.out.println("Endere�o: " + pedro.getEndereco());
		System.out.println("Telefone: " + pedro.getTelefone());
		
		System.out.println("\nDADOS DO FORNECEDOR: \n");
		System.out.println("Nome: " + paulo.getNome());
		System.out.println("Endere�o: " + paulo.getEndereco());
		System.out.println("Telefone: " + paulo.getTelefone());
		System.out.println("Valor de cr�dito: R$" + paulo.getValorCredito());
		System.out.println("Valor da d�vida: R$" + paulo.getValorDivida());
		System.out.println("Saldo ap�s pagamento da d�vida: R$" + paulo.obterSaldo());

	}

}
