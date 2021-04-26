package luchadorSumoV2;

public class Main {

	public static void main(String[] args) {
		Torneo torneo = new Torneo();
        ListaMil lista=new ListaMil();
        lista.crearMil();
		torneo.leerArchivo();
		torneo.generarResultado();
		torneo.escribirArchivo();

	}

}
