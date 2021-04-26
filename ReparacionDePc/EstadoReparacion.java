package ar.edu.uno.poo1.practica08.reparacionpc;

public enum EstadoReparacion {
	
	PENDIENTE_APROBACION_PRESUPUESTO(0), APROBACION_PRESUPUESTO(1), REPARADO(2);
	
	private Integer representacion;
	
	private EstadoReparacion(Integer representacion) {
		this.setReparacion(representacion);
	}
	
	private void setReparacion(Integer representacion) {
		this.representacion = representacion;
	}
	
	public Integer getRepresentacion() {
		return this.representacion;
	}
	
}