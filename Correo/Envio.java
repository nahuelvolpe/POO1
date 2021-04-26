package ar.edu.uno.poo1.practica09.correo;

public class Envio implements Calculable {
	
	private static final Double PRECIO_MENOR_100KM = 1.0;
	private static final Double PRECIO_MENOR_500KM = 1.5;
	private static final Double PRECIO_MAYOR_500KM = 2.0;
	
	private Integer distancia;
	
	public Envio(Integer distancia) {
		this.setDistancia(distancia);
	}
	
	public Integer getDistancia() {
		return this.distancia;
	}
	
	public void setDistancia(Integer distancia) {
		this.distancia = distancia;
	}
	
	public Double calcularPrecio() {
		if (this.getDistancia() < 100)
			return Envio.PRECIO_MENOR_100KM;
		if (this.getDistancia() < 500)
			return Envio.PRECIO_MENOR_500KM;
		return Envio.PRECIO_MAYOR_500KM;
	}
	
}