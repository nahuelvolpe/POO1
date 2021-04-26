package algoritmoGenetico;

import java.util.Random;

public class Cromosoma {	
		private String genesHexa;
		private String genesBin;
		private Integer fitness;
		
		//CONSTRUCTORES
		public Cromosoma(String genesHexa) {
			this.setGenesHexa(genesHexa);
			this.setGenesBin(this.pasarABinario());
			this.setFitness(this.calcularFitness());
		}
		public Cromosoma(String genesHexa, Integer fitness) {
			this.setGenesHexa(genesHexa);
			this.setGenesBin(this.pasarABinario());
			this.setFitness(fitness);
		}
		
		//GETTERS Y SETTERS
		public String getGenesHexa() {
			return genesHexa;
		}
		public void setGenesHexa(String genesHexa) {
			this.genesHexa = genesHexa;
		}
		public String getGenesBin() {
			return genesBin;
		}
		public void setGenesBin(String genesBin) {
			this.genesBin = genesBin;
		}
		public Integer getFitness() {
			return fitness;
		}
		public void setFitness(Integer fitness) {
			this.fitness = fitness;
		}
		
		//CONVERSIONES
		private String pasarABinario() {
			String convertido = "";
			convertido = Long.toBinaryString(Long.parseLong(this.getGenesHexa(), 16));
			while (convertido.length() < 40){
				convertido = "0" + convertido;
			}
			return convertido;
		}
		private String pasarAHexadecimal() {
			return Long.toHexString(Long.parseLong(this.getGenesBin(), 2)).toUpperCase();
		}
		
		//FITNESS
		private Integer calcularFitness() {
			return (this.getCantidadHexadecimalCoincidentes() + 1) * (int) (this.getCantidadBinariosCoincidentes() * this.getCantidadBinariosCoincidentes());
		}
		private Integer getCantidadHexadecimalCoincidentes() {
			Integer h = 0;
			for (Integer i = 0; i<this.getGenesHexa().length(); i++)
				if (this.getGenesHexa().charAt(i) == Clave.getClave().getCromosoma().getGenesHexa().charAt(i))
					h++;
			return h;
		}
		private Integer getCantidadBinariosCoincidentes() {
			Integer b = 0;
			for (Integer i = 0; i<this.getGenesBin().length(); i++)
				if (this.getGenesBin().charAt(i) == Clave.getClave().getCromosoma().getGenesBin().charAt(i))
					b++;
			return b;
		}
		
		//MUTACION
		public Cromosoma mutarCromosoma(){
			Random rand = new Random();
			char [] genes = this.getGenesBin().toCharArray();
			
			for (Integer i=1; i<=4; i++) {
				Integer aleatorio = (int) (rand.nextInt(this.getGenesBin().length()));
				genes[aleatorio] = (genes[aleatorio] == '1')?'0':'1';
			}
			this.setGenesBin(new String(genes));
			Cromosoma C = new Cromosoma(Long.toHexString(Long.parseLong(this.getGenesBin(), 2)).toUpperCase());
			return C;
		}
		
		//TOSTRING
		@Override
		public String toString() {
			return genesHexa + "\t" + genesBin + "\t" + fitness;
		}
			
}


