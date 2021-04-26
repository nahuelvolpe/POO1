package ar.edu.uno.poo1.practica07.empleados;

public class EmpleadoPlantaPermanente extends Empleado {
	
	private static final Double IMPORTE_POR_HORA = 30.0;
	private static final Double IMPORTE_POR_A�O_ANTIGUEDAD = 10.0;
	
	private Integer cantidadA�osAntiguedad;
	
	public EmpleadoPlantaPermanente(Integer cantidadHorasTrabajadas, Boolean estaCasado,
			Integer cantidadHijos, Integer cantidadA�osAntiguedad) {
		super(cantidadHorasTrabajadas, estaCasado, cantidadHijos);
		this.setCantidadA�osAntiguedad(cantidadA�osAntiguedad);
	}
	
	public Integer getCantidadA�osAntiguedad() {
		return this.cantidadA�osAntiguedad;
	}
	
	public void setCantidadA�osAntiguedad(Integer cantidadA�osAntiguedad) {
		this.cantidadA�osAntiguedad = cantidadA�osAntiguedad;
	}
	
	public Double getSalarioHorasTrabajadas() {
		return this.getCantidadHorasTrabajadas() * EmpleadoPlantaPermanente.IMPORTE_POR_HORA;
	}
	
	public Double getSalarioAntiguedad() {
		return this.getCantidadA�osAntiguedad() * EmpleadoPlantaPermanente.IMPORTE_POR_A�O_ANTIGUEDAD;
	}
	
	public String toString() {
		return super.toString().concat("\t\t").concat(String.valueOf(this.getCantidadA�osAntiguedad()));
	}
	
}
