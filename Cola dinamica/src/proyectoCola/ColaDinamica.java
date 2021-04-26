package proyectoCola;

public class ColaDinamica {
	private Nodo pri;
	private Nodo ulti;
	
	
	public ColaDinamica(){
		this.pri=null;
		this.ulti=null;
	}
	
	public void encolar(Object o){
		Nodo nuevo = new Nodo(o);
		if(isEmpty()==true){
			ulti=nuevo;
			pri=nuevo;
		}
		else {
			ulti.setSiguiente(nuevo);
			ulti=nuevo;
		}
		System.out.println("El ultimo es "+ulti.getDato()+" El primero es "+pri.getDato());
	}
	
	public Object desencolar(){
		Object desenc=null;
		if(isEmpty()==false){
			desenc=pri;
		}
		else System.out.println("La cola esta vacia");
		return desenc;
	}
	
	public boolean isEmpty(){
		if (pri==null && ulti==null){
			return true;
		}else return false;
	}
	

}
