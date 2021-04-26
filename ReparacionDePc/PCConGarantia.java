package ar.edu.uno.poo1.practica08.reparacionpc;

public class PCConGarantia extends PC {
	
	private String fechaCompra;
	
	public PCConGarantia(Long codigoReparacion, Long codigoCliente, String descripcionAveria,
			String fechaCompra) {
		super(codigoReparacion, codigoCliente, descripcionAveria);
		this.setFechaCompra(fechaCompra);
	}
	
	public String getFechaCompra() {
		return this.fechaCompra;
	}
	
	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	
	public String toString() {
		return super.toString() + "Fecha de Compra=" + this.getFechaCompra();
	}
	
}
