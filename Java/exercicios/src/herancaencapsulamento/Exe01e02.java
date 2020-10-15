package herancaencapsulamento;

public class Exe01e02 {

	public static void main(String[] args) {
		
		Pessoa2 pedro = new Pessoa2("Pedro", "Rua dos Batatais, nº 352", "99999-9999");
		Fornecedor paulo = new Fornecedor("Paulo", "Rua dos Bananais, nº 455", "98888-8888", 500, 350);
		
		System.out.println("\nDADOS DO PEDRO: \n");
		System.out.println("Nome: " + pedro.getNome());
		System.out.println("Endereço: " + pedro.getEndereco());
		System.out.println("Telefone: " + pedro.getTelefone());
		
		System.out.println("\nDADOS DO FORNECEDOR: \n");
		System.out.println("Nome: " + paulo.getNome());
		System.out.println("Endereço: " + paulo.getEndereco());
		System.out.println("Telefone: " + paulo.getTelefone());
		System.out.println("Valor de crédito: R$" + paulo.getValorCredito());
		System.out.println("Valor da dívida: R$" + paulo.getValorDivida());
		System.out.println("Saldo após pagamento da dívida: R$" + paulo.obterSaldo());

	}

}
