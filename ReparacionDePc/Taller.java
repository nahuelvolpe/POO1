package ar.edu.uno.poo1.practica08.reparacionpc;

import java.util.ArrayList;

public class Taller {
	
	private ArrayList<PC> pcs;
	
	public Taller(Integer cantidadMaximaPCs) {
		this.setPcs(new ArrayList<PC>(cantidadMaximaPCs));
	}
	
	public ArrayList<PC> getPcs() {
		return this.pcs;
	}
	
	public void setPcs(ArrayList<PC> pcs) {
		this.pcs = pcs;
	}
	
	public void agregarPC(PC pc) {
		this.getPcs().add(pc);
	}
	
	private PC buscarPC(PC pc) {
		Integer posicion = this.getPcs().indexOf(pc);
		return (posicion == -1) ? null : this.getPcs().get(posicion);
	}
	
	public Boolean aceptarPresupuesto(PC pc) {
		PC pcBuscada = this.buscarPC(pc);
		if (pcBuscada == null)
			return Boolean.FALSE;
		pcBuscada.setEstadoReparacion(EstadoReparacion.APROBACION_PRESUPUESTO);
		return Boolean.TRUE;
	}
	
	public Boolean repararPC(Long codigoReparacion) {
		PC pcBuscada = this.buscarPC(new PC(codigoReparacion));
		if (pcBuscada == null)
			return Boolean.FALSE;
		pcBuscada.setEstadoReparacion(EstadoReparacion.REPARADO);
		return Boolean.TRUE;
	}
	
	public Boolean entregarPC(PC pc) {
		return this.getPcs().remove(pc);
	}
	
	public String toString() {
		String representacion = "PCs en Taller \n";
		for (PC pc : this.getPcs())
			representacion += pc.toString() + "\n";
		return representacion;
	}
	
}
