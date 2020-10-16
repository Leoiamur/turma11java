package polimorfismo;

public class Exe01e02 {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Bilu");
		cachorro.setIdade(7);
		cachorro.setSom("Latido");
		cachorro.setCorrer("Corre");
		
		Cavalo cavalo = new Cavalo();
		cavalo.setNome("Puxão");
		cavalo.setIdade(10);
		cavalo.setSom("Relincho");
		cavalo.setCorrer("Corre");
		
		Preguica preguica = new Preguica();
		preguica.setNome("Slakoth");
		preguica.setIdade(2);
		preguica.setSom("Bocejo");
		preguica.setSubirArvore("Sobe árvore");
		
		Animal[] animais = new Animal[3];
		animais[0] = cachorro;
		animais[1] = cavalo;
		animais[2] = preguica;
		
		for(Animal anima: animais) {
			System.out.println(anima.getNome());
		}

	}

}
