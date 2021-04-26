package algoritmoGenetico;

import java.io.*;

public class Archivo {

	public void cargarEntrada() {
		FileReader fr = null;
		BufferedReader br = null;
		String linea = null;
		Poblacion poblacion = new Poblacion();
		
		try {
			fr = new FileReader("PoblacionInicial2.in");
			br = new BufferedReader(fr);
			
			int tamaño = Integer.parseInt(br.readLine());
			while ((linea = br.readLine()) != null) {
				Cromosoma cromo = new Cromosoma(linea);
				poblacion.agregarCromosoma(cromo);
			}
		} catch (Exception exception) {
			System.err.println(exception.getMessage());
		}
		try { 
			if (br != null)
				br.close();
			System.out.println("\n" + "Fin de la lectura del archivo de población inicial....." + "\n");
		} catch (Exception exception) {
			System.err.println(exception.getMessage());
		}
	}
	
	public void guardarSalida(int generaciones) {
    {
        FileWriter fw = null;
        PrintWriter pw = null;

        try {
            fw = new FileWriter("PoblacionInicialSalida.out");
            pw = new PrintWriter(fw);
            pw.println(generaciones);
            
		} catch (Exception exception) {
			System.err.println(exception.getMessage());
		}
		try { 
			if (fw != null)
				fw.close();
			System.out.println("\n" + "Archivo grabado" + "\n");
		} catch (Exception exception) {
			System.err.println(exception.getMessage());
		}
    }
}
}
