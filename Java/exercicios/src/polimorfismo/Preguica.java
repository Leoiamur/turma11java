package polimorfismo;

public class Preguica extends Animal {
	
	private String subirArvore;
	
	public Preguica() {
		
	}
	
	public String getSubirArvore() {
		return subirArvore;
	}

	public void setSubirArvore(String subirArvore) {
		this.subirArvore = subirArvore;
	}

	public String getNome() {
		return "Nome: " + super.getNome() + " - Idade: " + super.getIdade() + " anos - Som: " + super.getSom() + " - " + this.getSubirArvore();
	}

}
