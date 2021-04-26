package algoritmoGenetico;

public class Test {

	public static void main(String[] args) {
		try{	
			Clave.setClave("1AC7D9B273");
			
			Archivo archivo = new Archivo();
			Poblacion poblacion = new Poblacion();
			
			archivo.cargarEntrada();
			System.out.printf("%s\t%s\t\t\t\t\t\t%s\n", "HEXADECIMAL", "BINARIO", "FITNESS");
			for(int i= 0; i<10; i++){
				System.out.println(poblacion.getIndividuos().get(i).toString());}
			while( poblacion.fitnessMaximoPoblacion() != true){
				poblacion.seleccion(); 
				poblacion.cruce();
				poblacion.mutar();
			}
			archivo.guardarSalida(poblacion.getGeneracion());
		} catch (Exception exception) {
			System.err.println(exception.getMessage());
			}
	}
}
