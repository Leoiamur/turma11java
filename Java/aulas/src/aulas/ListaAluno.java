package aulas;

import java.util.HashSet;
import java.util.Set;

public class ListaAluno {

	public static void main(String[] args) {
		
		Set<Alune> conjunto = new HashSet<Alune>();
		
		Alune a = new Alune("João da Silva", "Java", 6.8);
		Alune b = new Alune("Maria Souza", "Linux", 7.8);
		Alune c = new Alune("Renata Almeida", "SO", 8.8);
		Alune d = new Alune("José Nascimento", "Internet", 5.5);
		
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		conjunto.add(d);
		
		System.out.println(conjunto);

	}

}
