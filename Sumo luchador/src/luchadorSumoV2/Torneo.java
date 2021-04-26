package luchadorSumoV2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class Torneo {
	private int cantLuchadores;
	private ArrayList<Luchadores> luchadores;
	private Scanner lectura;
	private ArrayList<Integer> listaResultado;
	private Formatter salida;

	public Torneo() {

		luchadores = new ArrayList<Luchadores>();
		listaResultado = new ArrayList<Integer>();
	}

	private void abrirArchivo() {
		try {
			lectura = new Scanner(new File("sumoIn.txt"));
		} catch (FileNotFoundException e) {
			System.err.println("No se puede abrir el archivo");
		}

	}

	public void leerArchivo() {
		abrirArchivo();
		try {
			Luchadores luchador;
			this.cantLuchadores = lectura.nextInt();
			while (lectura.hasNext()) {
				luchador = new Luchadores();
				luchador.setPeso(lectura.nextDouble());
				luchador.setAltura(lectura.nextDouble());

				this.luchadores.add(luchador);
			}
		} catch (Exception e) {
			System.err.println("Error lectura incorrecta");
		}
     finally{ if(lectura!=null)
    	 lectura.close();}
     		
	}

	public void generarResultado() {
		for (int j = 0; j < this.cantLuchadores; j++) {
			for (int i = 0; i < this.cantLuchadores; i++) {
					if(j==i)
						continue;
				this.luchadores.get(j).domina(this.luchadores.get(i));

			}
			this.listaResultado.add(this.luchadores.get(j).getCantDomina());

		}

	}
	private void crearArchivo() {
		try {
			salida = new Formatter(new File("sumoOut.txt"));
		} catch (FileNotFoundException e) {

			System.err.println("Eror al crear archivo");
		}
	}

	public void escribirArchivo() {
		crearArchivo();

		for (int i = 0; i < this.cantLuchadores; i++) {
			salida.format("%%dn", this.listaResultado.get(i));
		}

		
		if (salida != null)
			salida.close();
		

	}

}
