package listaclasseobjeto;

public class Aviao {
	
	public double pesoMax;
	public int velocidadeMax;
	public double alturaMaxVoo;
	public double comprimento;
		
		public String getAv() {
			
			String Av ="\nDados do avião: \n" + "\nPeso Máximo: " + pesoMax +"Kg\nVelocidade Máxima: " + velocidadeMax + "Km/h\nAltura Máxima de Vôo: " + alturaMaxVoo + "M\nComprimento: " + comprimento + "M";
			return Av;

		}
		
}
