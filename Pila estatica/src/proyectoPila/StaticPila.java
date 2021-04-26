package proyectoPila;

public class StaticPila {
	
	private int[] pila;
	private int tope;
	
	public StaticPila(){
		this.tope=-1;
		this.pila=new int[10];
	}
	
	public boolean isEmpty(){
		if (tope == -1){
			return true;
		}
		else return false;
	}
	
	public void apilar(int dato){
		
		try{
			if (tope<pila.length){
				tope++;
				this.pila[tope]=dato;
				System.out.println("APILADO "+this.pila[tope]);
				}
		}catch(ArrayIndexOutOfBoundsException e){
			resize();
		}
	}
	
	public int desapilar(){
		int sacado=0;
			if (tope > -1){
				sacado=pila[tope];
				tope-=1;
			}
			else System.out.println("La pila esta vacia");

		return sacado;
	}

	public void resize(){
		int pila2[] = new int[(pila.length)*2];
		
		for (int i=0; i<pila.length; i++){
			pila2[i]=pila[i];
		}
		pila=pila2;
	}

}
