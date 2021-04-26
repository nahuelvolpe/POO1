package ar.edu.uno.poo1.practica09.correo;

public class TestCorreo {
	
	public static void main(String[] args) {
		Empresa empresa = new Empresa("20-24862699-3", "Correo Argentino");
		empresa.agregarEnvio(new Encomienda(120, 3.5));
		empresa.agregarEnvio(new Carta(650));
		empresa.agregarEnvio(new Carta(5));
		empresa.agregarEnvio(new Telegrama(405, "Te deseo hoy y siempre felicidad completa."));
		System.out.println(empresa.liquidacionTotal());
	}
	
}
