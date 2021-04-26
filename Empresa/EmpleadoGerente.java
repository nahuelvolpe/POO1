package ar.edu.uno.poo1.practica07.empleados;

public class EmpleadoGerente extends EmpleadoPlantaPermanente {
	
	private static final Double IMPORTE_POR_HORA = 40.0;
	private static final Double IMPORTE_POR_A�O_ANTIGUEDAD = 15.0;
	
	public EmpleadoGerente(Integer cantidadHorasTrabajadas, Boolean estaCasado, Integer cantidadHijos,
			Integer cantidadA�osTrabajados) {
		super(cantidadHorasTrabajadas, estaCasado, cantidadHijos, cantidadA�osTrabajados);
	}
	
	public Double getSalarioHorasTrabajadas() {
		return this.getCantidadHorasTrabajadas() * EmpleadoGerente.IMPORTE_POR_HORA;
	}
	
	public Double getSalarioAntiguedad() {
		return this.getCantidadA�osAntiguedad() * EmpleadoGerente.IMPORTE_POR_A�O_ANTIGUEDAD;
	}
	
}
