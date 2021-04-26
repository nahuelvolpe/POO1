package algoritmoGenetico;

import java.util.ArrayList;
import java.util.Random;

public class Poblacion {
	private static ArrayList<Cromosoma> individuos;
	private ArrayList<Cromosoma> individuos2;
	private int generacion;
	
	//CONSTRCUTOR
	public Poblacion() {
		this.setIndividuos(new ArrayList<Cromosoma>());
		this.setIndividuos2(new ArrayList<Cromosoma>());
		this.setGeneracion(0);
	}
	
	//GETTERS Y SETTERS
	public ArrayList<Cromosoma> getIndividuos() {
		return individuos;
	}
	public void setIndividuos(ArrayList<Cromosoma> individuos) {
		Poblacion.individuos = individuos;
	}
	public ArrayList<Cromosoma> getIndividuos2() {
		return individuos2;
	}
	public void setIndividuos2(ArrayList<Cromosoma> individuos2) {
		this.individuos2 = individuos2;
	}
	public int getGeneracion() {
		return generacion;
	}
	public void setGeneracion(int generacion) {
		this.generacion = generacion;
	}
	
	//AGREGAR CROMOSOMA
	public void agregarCromosoma(Cromosoma cromosoma) {
		this.getIndividuos().add(cromosoma);
	}
	
	//ALGORITMO GENETICO
	public void seleccion(){ 
		Random rand = new Random();
		for(int i=0; i<individuos.size() ;i++){
		Cromosoma aleatorio1 = new Cromosoma(((individuos.get((int) (rand.nextInt(this.getIndividuos().size()))).getGenesHexa())));
		Cromosoma aleatorio2 = new Cromosoma((individuos.get((int) (rand.nextInt(this.getIndividuos().size()))).getGenesHexa()));
			if(aleatorio1.getFitness()<aleatorio2.getFitness()){
				individuos2.add(aleatorio2);
			}
			else {
			individuos2.add(aleatorio1);
			}
		}
		individuos.clear();
		individuos.addAll(individuos2);
		individuos2.clear();
		System.out.println();
		System.out.printf("%s\t%s\t\t\t\t\t\t%s\n", "HEXADECIMAL", "BINARIO", "FITNESS");
		for(int i= 0; i<10; i++)
			System.out.println(this.getIndividuos().get(i).toString());
	}
	public void cruce(){
		
		Random rand = new Random();
		Integer limite = 0;
		limite = individuos.size()/2;

		for(int i=0; i<limite ;i++){
			Cromosoma aleatorio1 = new Cromosoma((individuos.get((int) (rand.nextInt(this.getIndividuos().size()))).getGenesHexa()));
			Cromosoma aleatorio2 = new Cromosoma((individuos.get((int) (rand.nextInt(this.getIndividuos().size()))).getGenesHexa()));
			
			Integer puntoDeCruce = (int) ((rand.nextInt(aleatorio1.getGenesBin().length()))); 
			char [] A1 = aleatorio1.getGenesBin().toCharArray();
			char [] A2 = aleatorio2.getGenesBin().toCharArray();
			char [] B1 = aleatorio1.getGenesBin().toCharArray();
			char [] B2 = aleatorio2.getGenesBin().toCharArray();
			
			for(int j=0; j < aleatorio1.getGenesBin().length(); j++){
				if(j<puntoDeCruce){
					B1[j]=A1[j];
					B2[j]=A2[j];
				}else{
					B1[j]=A2[j];
					B2[j]=A1[j];
				}
			}
			Cromosoma cromosomaB1 = new Cromosoma(Long.toHexString(Long.parseLong(new String(B1),2)).toUpperCase());
			Cromosoma cromosomaB2 = new Cromosoma(Long.toHexString(Long.parseLong(new String(B2),2)).toUpperCase());
			individuos2.add(cromosomaB1);
			individuos2.add(cromosomaB2);
		}
		individuos.clear();
		individuos.addAll(individuos2);
		individuos2.clear();
		System.out.println();
		System.out.printf("%s\t%s\t\t\t\t\t\t%s\n", "HEXADECIMAL", "BINARIO", "FITNESS");
		for(int i= 0; i<10; i++)
			System.out.println(this.getIndividuos().get(i).toString());
	}
	public void mutar() {
		Random rand = new Random();
		Cromosoma cromosoma =new Cromosoma((individuos.remove((int) (rand.nextInt(this.getIndividuos().size()))).getGenesHexa()));
		individuos.add(cromosoma.mutarCromosoma());
		System.out.println();
		System.out.printf("%s\t%s\t\t\t\t\t\t%s\n", "HEXADECIMAL", "BINARIO", "FITNESS");
		for(int i= 0; i<10; i++)
			System.out.println(this.getIndividuos().get(i).toString());
		}
	
	//BUSCAR CLAVE
	public boolean fitnessMaximoPoblacion(){
		Boolean fitnessMaximo = false;

		String cromosomaClave = "";
		String cromosomaPoblacion = "";
		
		for (Cromosoma comp : Poblacion.individuos) {
			cromosomaPoblacion = comp.getGenesHexa();
			cromosomaClave = Clave.getClave().getCromosoma().getGenesHexa();
			if (cromosomaPoblacion.equals(cromosomaClave)){
				fitnessMaximo = true;
				break;
			}
	   	}
		this.setGeneracion(this.getGeneracion()+1);
		if (fitnessMaximo){
			System.out.println("Generación: " + this.getGeneracion() + "\n");
			return true;
		}
		else{
			return false;
		}
	}
	
}
