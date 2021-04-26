package luchadorSumo;

public class Luchadores {
private double peso;
private double altura;
public Luchadores(double peso, double altura) {
	this.peso = peso;
	this.altura = altura;
	
}
public double getPeso() {
	return peso;
}
public void setPeso(double peso) {
	this.peso = peso;
}
public double getAltura() {
	return altura;
}
public void setAltura(double altura) {
	this.altura = altura;
}

public String toString() {
	return "Luchadores [peso=" + peso + ", altura=" + altura + "]";
}

public int domina(Luchadores luchador){
	int domina = 0;
	
	return domina;
	
}
}
