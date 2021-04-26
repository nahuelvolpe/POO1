package proyectAmazon;

public class Test {

	public static void main(String[] args) {
		
		Producto producto1Nahuel = new Producto("Nike", "Zapatillas", 1500.0);
		
		producto1Nahuel.AgregarItem(producto1Nahuel);
		
		producto1Nahuel.mostrarArray();

	}

}
