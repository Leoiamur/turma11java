package entidades;

public class Terceiro extends Empregado1 {
	
	private double adicional;
	
	public Terceiro() {
		super();
	}

	public Terceiro(String nome, int horas, double valorPorHora, double adicional) {
		super(nome, horas, valorPorHora);
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	@Override
	public double pagamento() {
		return super.pagamento() + (adicional * 1.1);
	}

}
