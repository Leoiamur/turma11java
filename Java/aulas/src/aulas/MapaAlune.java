package aulas;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MapaAlune {

	public static void main(String[] args) {
		
		Map<String, Alune> mapa = new TreeMap<String, Alune>();
		
		Alune a = new Alune("João da Silva", "Java", 6.8);
		Alune b = new Alune("Maria Souza", "Linux", 7.8);
		Alune c = new Alune("Renata Almeida", "SO", 8.8);
		Alune d = new Alune("José Nascimento", "Internet", 5.5);
		
		mapa.put("João da Silva", a);
		mapa.put("Maria Souza", b);
		mapa.put("Renata Almeida", c);
		mapa.put("José Nascimento", d);
		
		System.out.println(mapa);
		System.out.println(mapa.get("Renata Almeida"));
		
		Collection<Alune> alunes = mapa.values();
		for(Alune e : alunes) {
			System.out.println(e);
		}

	}

}
