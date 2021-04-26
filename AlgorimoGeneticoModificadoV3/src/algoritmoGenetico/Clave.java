package algoritmoGenetico;

public class Clave {
	
	private static Clave clave; 
	private Cromosoma cromosoma;
	
	//CONSTRUCTOR
	private Clave(String claveEnHexa) {
		this.setCromosoma(new Cromosoma(claveEnHexa, 0));
	}
	
	//GETTERS Y SETTERS
	public static Clave getClave() {
		return clave;
	}
	public static void setClave(String claveHexa) {
		Clave.clave = new Clave(claveHexa);
	}
	public Cromosoma getCromosoma() {
		return cromosoma;
	}
	public void setCromosoma(Cromosoma cromosoma) {
		this.cromosoma = cromosoma;
	}
	
}
