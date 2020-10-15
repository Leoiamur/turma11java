package herancaencapsulamento;

public class Exe05 {

	public static void main(String[] args) {
		
		Pessoa2 pedro = new Pessoa2("Pedro", "Rua dos Batatais, nº 352", "99999-9999");
		Operario tiago = new Operario("Tiago", "Rua dos Jacarés, nº 67", "95555-5555", 432, 158);
		
		System.out.println("\nDADOS DO PEDRO: \n");
		System.out.println("Nome: " + pedro.getNome());
		System.out.println("Endereço: " + pedro.getEndereco());
		System.out.println("Telefone: " + pedro.getTelefone());
		
		System.out.println("\nDADOS DO OPERARIO: \n");
		System.out.println("Nome: " + tiago.getNome());
		System.out.println("Endereço: " + tiago.getEndereco());
		System.out.println("Telefone: " + tiago.getTelefone());
		System.out.println("Valor de Produção: R$" + tiago.getValorProducao());
		System.out.println("Comissão: R$" + tiago.getComissao());

	}

}
