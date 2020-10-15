package listaclasseobjeto;

public class Patinete {
	
	public String marca;
	public String cor;
	public int pesoMax;
	
		public String getPa() {
			
			String Pa = "\nDados do patinete: \n" + "\nMarca: " + marca +"\nCor: " + cor + "\nPeso Máximo do Usuário: " + pesoMax + "Kg";
			return Pa;
			
		}

}
