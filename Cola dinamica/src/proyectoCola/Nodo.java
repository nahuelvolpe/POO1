package proyectoCola;

public class Nodo {
	private Object dato;
	private Nodo siguiente;
	
	public Nodo(Object data){
		this.dato=data;
		this.siguiente=null;
	}


	public Object getDato() {
		return dato;
	}

	public void setDato(Object dato) {
		this.dato = dato;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	
	
	
	

}
