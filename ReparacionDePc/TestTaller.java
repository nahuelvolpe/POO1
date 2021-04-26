package ar.edu.uno.poo1.practica08.reparacionpc;

public class TestTaller {
	
	public static void main(String[] args) {
		Taller taller = new Taller(5);
		PC pc1 = new PCConGarantia(1L, 1L, "A1", "20141025");
		PC pc2 = new PCSinGarantia(2L, 2L, "A2", 565.0);
		PC pc3 = new PCConGarantia(3L, 3L, "A3", "20141001");
		taller.agregarPC(pc1);
		taller.agregarPC(pc2);
		taller.agregarPC(pc3);
		System.out.println(taller);
		taller.repararPC(2L);
		System.out.println(taller);
		taller.entregarPC(pc2);
		System.out.println(taller);
	}
	
}
