package entidades;

public class Vizinho extends Sujeito {
	
	private boolean mesmoPredio;

	public Vizinho(String nome, char sexo, boolean mesmoPredio) {
		super(nome, sexo);
		this.mesmoPredio = mesmoPredio;
	}

	public boolean isMesmoPredio() {
		return mesmoPredio;
	}

	public void setMesmoPredio(boolean mesmoPredio) {
		this.mesmoPredio = mesmoPredio;
	}

}
