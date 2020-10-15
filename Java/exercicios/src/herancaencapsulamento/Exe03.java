package herancaencapsulamento;

public class Exe03 {

	public static void main(String[] args) {
		
		Pessoa2 pedro = new Pessoa2("Pedro", "Rua dos Batatais, n� 352", "99999-9999");
		Empregado carlos = new Empregado("Carlos", "Rua dos Animais, n� 1062", "97777-7777", 452, 1500, 7);
		
		System.out.println("\nDADOS DO PEDRO: \n");
		System.out.println("Nome: " + pedro.getNome());
		System.out.println("Endere�o: " + pedro.getEndereco());
		System.out.println("Telefone: " + pedro.getTelefone());
		
		System.out.println("\nDADOS DO EMPREGADO: \n");
		System.out.println("Nome: " + carlos.getNome());
		System.out.println("Endere�o: " + carlos.getEndereco());
		System.out.println("Telefone: " + carlos.getTelefone());
		System.out.println("C�digo do setor: " + carlos.getCodigoSetor());
		System.out.println("Sal�rio base: R$" + carlos.getSalarioBase());
		System.out.println("Porcentagem retida dos impostos: " + carlos.getImposto() + "%");

	}

}
