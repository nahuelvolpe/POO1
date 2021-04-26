package biblioteca;

public class Revista extends Volumen {
	private static Integer numRevista=0;
	
	public Revista(String nombre, Integer numVol){
		super(nombre, numVol);
		Revista.numRevista+=1;
	}
	
	public static Integer getNumRevista() {
		return numRevista;
	}

	public static void setNumRevista(Integer numRevista) {
		Revista.numRevista = numRevista;
	}

	public void mostrar(){
		super.mostrar();
		System.out.println("Números de Revistas: "+ numRevista);
	}
}
