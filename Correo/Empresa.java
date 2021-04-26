package ar.edu.uno.poo1.practica09.correo;

import java.util.ArrayList;

public class Empresa {
	
	private String cuit;
	private String razonSocial;
	private ArrayList<Envio> envios;
	
	public Empresa(String cuit, String razonSocial) {
		this.setCuit(cuit);
		this.setRazonSocial(razonSocial);
		this.setEnvios(new ArrayList<Envio>());
	}
	
	public String getCuit() {
		return this.cuit;
	}
	
	private void setCuit(String cuit) {
		this.cuit = cuit;
	}
	
	public String getRazonSocial() {
		return this.razonSocial;
	}
	
	private void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	
	private ArrayList<Envio> getEnvios() {
		return this.envios;
	}
	
	private void setEnvios(ArrayList<Envio> envios) {
		this.envios = envios;
	}
	
	public void agregarEnvio(Envio envio) {
		this.getEnvios().add(envio);
	}
	
	public Double liquidacionTotal() {
		Double acumuladorLiquidacion = 0.0;
		for (Envio envio : this.getEnvios())
			acumuladorLiquidacion += envio.calcularPrecio();
		return acumuladorLiquidacion;
	}
	
}