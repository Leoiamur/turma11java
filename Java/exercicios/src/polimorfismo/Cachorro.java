package polimorfismo;

public class Cachorro extends Animal {
	
	private String correr;
	
	public Cachorro() {
		
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
	public String getNome() {
		return "Nome: " + super.getNome() + " - Idade: " + super.getIdade() + " anos - Som: " + super.getSom() + " - " + this.getCorrer();
	}

}
