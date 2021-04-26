package ar.edu.uno.poo1.practica09.correo;

public class Telegrama extends Carta {
	
	private static final Double PRECIO_CARACTER = 0.01;
	private String texto;
	
	public Telegrama(Integer distancia, String texto) {
		super(distancia);
		this.setTexto(texto);
	}
	
	public String getTexto() {
		return this.texto;
	}
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	private Integer contarCaracteres() {
		Integer cantidadCaracteres = 0;
		for (Integer i = 0; i < this.getTexto().length(); i++)
			if (this.getTexto().charAt(i) != ' ')
				cantidadCaracteres++;
		return cantidadCaracteres;
	}
	
	public Double calcularPrecio() {
		return super.calcularPrecio() + this.contarCaracteres() * Telegrama.PRECIO_CARACTER;
	}
	
}
