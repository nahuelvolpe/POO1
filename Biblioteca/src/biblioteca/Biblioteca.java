package biblioteca;
import java.util.ArrayList;



public class Biblioteca {
	private Integer maxLibros;
	private Integer maxRevistas;
	private ArrayList<Volumen> array;
	
	public Biblioteca(Integer maxL, Integer maxR){
		this.maxLibros=maxL;
		this.maxRevistas=maxR;
		this.array=new ArrayList<Volumen>();
	}
	
	public void mostrarBiblioteca(){
		for(int i=0; i<array.size();i++){
			array.get(i).mostrar();
		}
	}
	
	
	public boolean incluir(Volumen v){
		if(v instanceof Libro && Libro.getNumLibros() <= maxLibros){
				this.array.add(v);
				return true;
			}
		else if(v instanceof Revista && Revista.getNumRevista() <= maxRevistas){
				this.array.add(v);
				return true;
			}
		else return false;
	
	}
}
