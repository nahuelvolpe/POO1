package ar.edu.uno.poo1.practica08.reparacionpc;

public class PCSinGarantia extends PC {
	
	private Double precioReparacion;
	
	public PCSinGarantia(Long codigoReparacion, Long codigoCliente, String descripcionAveria,
			Double precioReparacion) {
		super(codigoReparacion, codigoCliente, descripcionAveria);
		this.setPrecioReparacion(precioReparacion);
	}
	
	public Double getPrecioReparacion() {
		return this.precioReparacion;
	}
	
	public void setPrecioReparacion(Double precioReparacion) {
		this.precioReparacion = precioReparacion;
	}
	
	public String toString() {
		return super.toString() + "Precio de la Reparación=" + this.getPrecioReparacion();
	}
	
}
