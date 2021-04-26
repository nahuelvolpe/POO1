package biblioteca;

abstract class Volumen {
	protected String nombre;
	protected Integer numVol;
	
	
	public Volumen(String nombre, Integer numVol){
		this.nombre=nombre;
		this.numVol=numVol;
	}
	
	public void mostrar(){
		System.out.println("Nombre:" +nombre);
		System.out.println("Número de Volumen:" +numVol);
	}	
}


