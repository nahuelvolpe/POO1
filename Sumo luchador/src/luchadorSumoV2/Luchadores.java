package luchadorSumoV2;

import java.io.Serializable;

public class Luchadores implements Serializable {
	private double peso;
	private double altura;
	private int cantDomina = 0;

	public Luchadores(double peso) {
		super();
		this.peso = peso;
	}

	public Luchadores(double peso, double altura) {
		super();
		this.peso = peso;
		this.altura = altura;
	}

	public Luchadores() {
		// TODO Auto-generated constructor stub
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int domina(Luchadores luchadorRival) {
		if (this.altura > luchadorRival.getAltura()
				&& this.peso > luchadorRival.getPeso()
				|| this.altura == luchadorRival.getAltura()
				&& this.peso > luchadorRival.getPeso()
				|| this.altura > luchadorRival.getAltura()
				&& this.peso == luchadorRival.getPeso())
			this.cantDomina++;
		return this.cantDomina;
	}

	public int getCantDomina() {
		return cantDomina;
	}

	@Override
	public String toString() {
		return "Luchadores [peso=" + peso + ", altura=" + altura
				+ ", cantDomina=" + cantDomina + "]";
	}

}
