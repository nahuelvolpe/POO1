package luchadorSumo;

import java.util.ArrayList;

public class Torneo {
	private Luchador[] luchadores;
	private int cantLuchadores;
	private int[] dominados;
	private int ultimoInscripto;

	public Torneo(int cant) {
		this.luchadores = new Luchador[cant];
		this.cantLuchadores = cant;
		this.dominados = new int[cant];
		this.ultimoInscripto = 0;
	}

	public void agregarLuchadores(Luchador l) {
		if (this.cantLuchadores != this.ultimoInscripto) {
			this.luchadores[this.ultimoInscripto] = l;
			this.ultimoInscripto++;
		} else
			System.out.println("Vector completo");

	}
	
	public void generarLuchadores() {
		
		
		for (int i = 0; i < this.cantLuchadores; i++) {
			int cantDomina = 0;
			for (int j = 0; j < this.cantLuchadores; j++) {
				if(i==j)
				continue;
				if (this.luchadores[i].dominaA(this.luchadores[j]))
					cantDomina++;

			}
          this.dominados[i]=cantDomina;
		}
	}
	
	public void resultadores () {
		
		for (int i = 0; i < dominados.length; i++) {
			System.out.println(this.dominados[i]);
		}
		
	}
	
	public void mostrarLuchadores () {
		for (int i = 0; i < luchadores.length; i++) {
			System.out.println(luchadores[i]);
		}
		
	}
}
