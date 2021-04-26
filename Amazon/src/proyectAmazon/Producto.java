package proyectAmazon;
import java.util.ArrayList;


public class Producto {
	
	private String nombre;
	private String tipo;
	private double precio;
	//private ArrayList<Producto> productos;
	
	ArrayList<Producto> productos = new ArrayList<Producto>();

	
	public Producto (String nom, String tip, double pre){
		this.nombre=nom;
		this.tipo=tip;
		this.precio=pre;
		//this.productos=new ArrayList<Producto>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public void AgregarItem (Producto p){
		 this.productos.add(p);
	}
	/*public ArrayList<Producto> getProductos() {
		return productos;
	}*/
	
	public void mostrarArray(){
		for (int i=0; i<productos.size(); i++){
			System.out.println(productos.get(i));
		}
	}
	
	

}//fin
