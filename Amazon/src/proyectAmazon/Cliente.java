package proyectAmazon;

public class Cliente extends Carrito{
	private String nombre;
	private String apellido;
	private String direccionEnvio;
	private String direccionCobro;
	private String email;
	private int contCarritos;
	private boolean preferencial;
	
	public Cliente(String nom, String ape, String dEnv, String dCob, String email, int cCarritos, boolean pref){
		super(cCarritos);
		this.nombre=nom;
		this.apellido=ape;
		this.direccionEnvio=dEnv;
		this.direccionCobro=dCob;
		this.email=email;
		this.contCarritos=cCarritos;
		this.preferencial=pref;
	}

	public String getNombre() {
		return nombre;
	}
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccionEnvio() {
		return direccionEnvio;
	}

	public void setDireccionEnvio(String direccionEnvio) {
		this.direccionEnvio = direccionEnvio;
	}

	public String getDireccionCobro() {
		return direccionCobro;
	}

	public void setDireccionCobro(String direccionCobro) {
		this.direccionCobro = direccionCobro;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getContCarritos() {
		return contCarritos;
	}

	public void setContCarritos(int contCarritos) {
		this.contCarritos = contCarritos;
	}

	public boolean isPreferencial() {
		return preferencial;
	}

	public void setPreferencial(boolean preferencial) {
		this.preferencial = preferencial;
	}
	

	public double CalcularPrecio() {
		return 0;
	}
	
}
