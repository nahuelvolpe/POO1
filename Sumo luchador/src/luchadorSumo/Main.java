package luchadorSumo;

public class Main {

	public static void main(String[] args) {
		Luchador l1 = new Luchador(99999, 99999);
		Luchador l2 = new Luchador(200, 1500);
		Luchador l3 = new Luchador(100, 1300);

		Torneo torneo = new Torneo(3);
		torneo.agregarLuchadores(l1);
		torneo.agregarLuchadores(l2);
		torneo.agregarLuchadores(l3);
		torneo.generarLuchadores();

		torneo.mostrarLuchadores();

		torneo.generarLuchadores();

		torneo.resultadores();
	}

}
