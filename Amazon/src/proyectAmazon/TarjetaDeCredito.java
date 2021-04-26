package proyectAmazon;

public class TarjetaDeCredito {
	private String nombre;
	private int numero;
	private String banco;
	private String tipo;
	private int pin;
	
	public TarjetaDeCredito(String nom, int num, String bank, String tip, int pass){
		this.nombre=nom;
		this.numero=num;
		this.banco=bank;
		this.tipo=tip;
		this.pin=pass;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
	public void VerificarTarjeta(){
		System.out.println("Tarjeta Verificada");
	}
}
