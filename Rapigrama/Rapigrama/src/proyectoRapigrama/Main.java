package proyectoRapigrama;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {

	
	public static void main(String[] args) {
		
		File f = null;
		FileReader fr = null;
		BufferedReader br =null;
		String[] vectorSopa=null;
		String[] vectorPalabras=null;
		char[][] matrizSopa=null;
		
		try{
			f = new File("rapigrama.in");
			fr = new FileReader(f);
			br = new BufferedReader(fr);
		
			String linea;
			String[] datos;
			int norma;
			int cantPalabras;
			
			//CARGAR DIMENSION Y CANTPALABRAS
			linea=br.readLine();
			datos=linea.split(" ");
			norma=Integer.parseInt(datos[0]);
			cantPalabras=Integer.parseInt(datos[1]);
			vectorSopa = new String[norma];
			vectorPalabras = new String[cantPalabras];
			
			//CARGAR VECTORSOPA
			for(int i=0; i<norma; i++){
				vectorSopa[i]=br.readLine();
			}
			//CARGAR VECTORPALABRAS	
			for(int x=0; x<cantPalabras; x++){
				vectorPalabras[x]=br.readLine();
			}
			//CARGAR MATRIZ
			matrizSopa = new char [norma][norma];
			for(int i=0; i<norma; i++){
				for(int j=0; j<norma; j++){
					matrizSopa[i][j]=vectorSopa[i].charAt(j);
				}
			}
			//MOSTRAR MATRIZ
			for(int i=0; i<matrizSopa.length; i++){ 
		    	System.out.print("|"); 
				for(int j=0; j<matrizSopa[i].length; j++){ 
					System.out.print(matrizSopa[i][j]); 
					if (j!=matrizSopa[i].length-1){ 
						System.out.print("\t"); 
					} 
				} 
				System.out.println("|"); 
			} 
			
			//BUSQUEDA
			int x=0;
			int acierto=0;
			int encontrada = 0;
			int e=0;
			//for(int w=0; w<vectorPalabras.length; w++){
				/*for(int i=0; i<matrizSopa.length; i++){
					for(int j=0; j<matrizSopa[i].length; j++){
						if(vectorPalabras[0].charAt(x)==matrizSopa[i][e]){
							acierto++;
							x++;
							e++;
						}else if(acierto>=1){
							e=e+0;
							acierto=0;
							x=0;
						}else{
							acierto=0;
							x=0;
						}
						if(acierto==vectorPalabras[0].length()){
							System.out.println("Palabra encontrada j");
							encontrada=1;
							break;}
					}
					e=0;
					if(acierto==vectorPalabras[0].length()){
						encontrada=1;
						System.out.println("Palabra encontrada i");
						break;
				}
					
			}
			//}
			if(encontrada==1){
				System.out.println("Encontrada");
			}else{
				System.out.println("No la encontro");
			}
			
			
			/*String palabraBus = "";
			char letra = ' '; 
			int indicePal = 0; 

			for (int i = 0; i < matrizSopa.length; ++i) { 
			for (int j = 0; j < matrizSopa[0].length; ++j) { 
			while (indicePal < vectorPalabras[0].length()) { 
			letra = vectorPalabras[0].charAt(indicePal); 

			if (matrizSopa[i][j] == letra) { 
			palabraBus += letra; 
			++indicePal; 
			} else { 
			break; 
			} 
			} 
			} 
			} 

			if (palabraBus.equals(vectorSopa[0]))
			System.out.println("Piola");

			System.out.println("\nPalabra buscada: " + palabraBus); 
			
			*/
			for(int i=0; i<matrizSopa.length; i++){
				for(int j=0; j<matrizSopa[i].length; j++){
					if(vectorPalabras[0].charAt(x)==matrizSopa[i][j]){
						acierto++;
						x++;
						
					}else if(acierto>=1){
						acierto=0;
						x=0;
						j=j-2;
					}else{
						acierto=0;
						x=0;
					}
					if(acierto==vectorPalabras[0].length()){
						System.out.println("Palabra encontrada j");
						encontrada=1;
						break;}
				}
				e=0;
				if(acierto==vectorPalabras[0].length()){
					encontrada=1;
					System.out.println("Palabra encontrada i");
					break;
			}
				
		}
		//}
		if(encontrada==1){
			System.out.println("Encontrada");
		}else{
			System.out.println("No la encontro");
		}
			
		}catch(Exception e){
			e.getMessage();
		}
	

}
	
}
