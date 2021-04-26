package ar.edu.uno.poo1.practica08.reparacionpc;

public class PC {
	
	private Long codigoReparacion;
	private Long codigoCliente;
	private String descripcionAveria;
	private EstadoReparacion estadoReparacion;
	
	public PC(Long codigoReparacion, Long codigoCliente, String descripcionAveria) {
		this.setCodigoReparacion(codigoReparacion);
		this.setCodigoCliente(codigoCliente);
		this.setDescripcionAveria(descripcionAveria);
		this.setEstadoReparacion(EstadoReparacion.PENDIENTE_APROBACION_PRESUPUESTO);
	}
	
	public PC(Long codigoReparacion) {
		this(codigoReparacion, 0L, "");
	}
	
	public Long getCodigoReparacion() {
		return this.codigoReparacion;
	}
	
	public void setCodigoReparacion(Long codigoReparacion) {
		this.codigoReparacion = codigoReparacion;
	}
	
	public Long getCodigoCliente() {
		return this.codigoCliente;
	}
	
	public void setCodigoCliente(Long codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	
	public String getDescripcionAveria() {
		return this.descripcionAveria;
	}
	
	public void setDescripcionAveria(String descripcionAveria) {
		this.descripcionAveria = descripcionAveria;
	}
	
	public EstadoReparacion getEstadoReparacion() {
		return this.estadoReparacion;
	}
	
	public void setEstadoReparacion(EstadoReparacion estadoReparacion) {
		this.estadoReparacion = estadoReparacion;
	}
	
	public String toString() {
		return "Codigo de Reparación=" + this.getCodigoReparacion() + "--> Codigo de Cliente="
				+ this.getCodigoCliente() + "--> Descripción de la Averia=" + this.getDescripcionAveria()
				+ "--> Estado de Reparación=" + this.getEstadoReparacion().name() + "-->";
	}
	
	public boolean equals(Object object) {
		if (super.equals(object))
			return Boolean.TRUE;
		if (object == null)
			return Boolean.FALSE;
		if (!(object instanceof PC))
			return Boolean.FALSE;
		PC pc = (PC) object;
		return this.getCodigoReparacion().equals(pc.getCodigoReparacion());
		
	}
	
}