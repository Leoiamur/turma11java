package polimorfismo;

public class Cavalo extends Animal {
	
	private String correr;
	
	public Cavalo() {
		
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
