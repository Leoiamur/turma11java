package listaclasseobjeto;

public class Aviao {
	
	public double pesoMax;
	public int velocidadeMax;
	public double alturaMaxVoo;
	public double comprimento;
		
		public String getAv() {
			
			String Av ="\nDados do avi�o: \n" + "\nPeso M�ximo: " + pesoMax +"Kg\nVelocidade M�xima: " + velocidadeMax + "Km/h\nAltura M�xima de V�o: " + alturaMaxVoo + "M\nComprimento: " + comprimento + "M";
			return Av;

		}
		
}
