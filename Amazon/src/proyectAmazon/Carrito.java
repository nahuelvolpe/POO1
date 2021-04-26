package proyectAmazon;
import java.util.ArrayList;

public class Carrito{
	private int cantidadItems;
	//private ArrayList<Producto> productos;
	
	public Carrito (int items){
		this.cantidadItems = items;
		//this.productos=new ArrayList<Producto>();
	}
	
	public int getCantidadItems() {
		return cantidadItems;
	}

	public void setCantidadItems(int cantidadItems) {
		this.cantidadItems = cantidadItems;
	}

	/*public void AgregarItem (Producto p){
		 this.productos.add(p);
	}
	
	public void SacarItem (Producto p) {
		this.productos.remove(p);
	}
	
	//public ArrayList<Producto> getProductos() {
		return productos;
	}

	//public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	
	//public double CalcularPrecio(){
		double precioFinal=0;
		for (int i=0; i<productos.size(); i++){
			precioFinal=0;
		}
	return precioFinal;
	} */
	
	public void Comprar(){
		System.out.println("Carrito Comprado");
	}
}