package luchadorSumoV2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Random;

public class ListaMil {

	public void crearMil() {
		Luchadores luchador = new Luchadores();
		Formatter salida;
		Random aleatorio = new Random();
		
		try {
		salida=new Formatter(new File("sumoIn.txt"));
		   salida.format("%d%n",1000);
		   for (int i = 0; i < 10001; i++) {
			   if(i==0){
					luchador.setAltura(299999);
					luchador.setPeso(499999);
					salida.format("%.2f %.2f%n",luchador.getPeso(),luchador.getAltura());
					continue;
			   
			   }
			   
			   
			   if(i==5){
					luchador.setAltura(0);
					luchador.setPeso(0);
					salida.format("%.2f %.2f%n",luchador.getPeso(),luchador.getAltura());
					continue;
			   
			   }
			   if(i==10){
			luchador.setAltura(300000);
			luchador.setPeso(500000);
			salida.format("%.2f %.2f%n",luchador.getPeso(),luchador.getAltura());
			continue;
			}
			luchador.setAltura((aleatorio.nextDouble()*1700)+300); 
			luchador.setPeso((aleatorio.nextDouble()*200)+100);
			
			salida.format("%.2f %.2f%n",luchador.getPeso(),luchador.getAltura());
		}
		   if(salida!=null)
				salida.close();

		} catch (FileNotFoundException e) {
			System.err.println("Error al crear");
		}
	}
	}
