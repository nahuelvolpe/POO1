package ar.edu.uno.poo1.practica07.empleados;

public class EmpleadoPlantaTemporaria extends Empleado {
	
	private static final Double IMPORTE_POR_HORA = 20.0;
	
	public EmpleadoPlantaTemporaria(Integer cantidadHorasTrabajadas, Boolean estaCasado, Integer cantidadHijos) {
		super(cantidadHorasTrabajadas, estaCasado, cantidadHijos);
	}
	
	public Double getSalarioHorasTrabajadas() {
		return this.getCantidadHorasTrabajadas() * EmpleadoPlantaTemporaria.IMPORTE_POR_HORA;
	}
	
	public Double getSalarioAntiguedad() {
		return 0.0;
	}
	
}