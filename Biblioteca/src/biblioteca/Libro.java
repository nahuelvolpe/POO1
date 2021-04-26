package biblioteca;

public class Libro extends Volumen {
	private static Integer numLibros=0;
	
	public Libro(String nombre, Integer numVol) {
		super(nombre, numVol);
		Libro.numLibros+=1;
	}
	
	public void mostrar(){
		super.mostrar();
		System.out.println("Número de Libros:" +numLibros);
	}

	public static Integer getNumLibros() {
		return numLibros;
	}

	public static void setNumLibros(Integer numLibros) {
		Libro.numLibros = numLibros;
	}
	
}
