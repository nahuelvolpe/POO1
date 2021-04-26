package proyectAmazon;

public class ClientePreferencial extends Cliente{
	
	public ClientePreferencial(String nom, String ape, String dEnv, String dCob, String email, int cCarritos, boolean pref){
		super(nom,ape,dEnv,dCob,email,cCarritos,pref);
	}
	
	public void VerificarPreferencia(){
		if (super.isPreferencial()==true){
			this.AplicarDescuento();
		}
	}

	public double AplicarDescuento(){
		double descontado;
		descontado=(super.CalcularPrecio()*0.35);
		return descontado;
	}
}
