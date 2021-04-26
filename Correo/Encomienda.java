package ar.edu.uno.poo1.practica09.correo;

public class Encomienda extends Envio {
	
	private static final Double PRECIO_PESO = 0.01;
	private Double peso;
	
	public Encomienda(Integer distancia, Double peso) {
		super(distancia);
		this.setPeso(peso);
	}
	
	public Double getPeso() {
		return this.peso;
	}
	
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	public Double calcularPrecio() {
		return super.calcularPrecio() + this.getPeso() * Encomienda.PRECIO_PESO;
	}
	
}