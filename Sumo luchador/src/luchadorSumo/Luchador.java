package luchadorSumo;

public class Luchador {
	private double peso;
	private double altura;

	public Luchador(double a, double b) {
		this.peso = a;
		this.altura = b;
	}

	public String toString() {
		return "Luchador [peso=" + peso + ", altura=" + altura + "]";
	}

	public boolean dominaA(Luchador luchador2) {
		if (this.altura > luchador2.altura && this.peso > luchador2.peso
				|| this.altura == luchador2.altura
				&& this.peso > luchador2.peso || this.altura > luchador2.altura
				&& this.peso == luchador2.peso) return true;
		
			return false;
	}
}
