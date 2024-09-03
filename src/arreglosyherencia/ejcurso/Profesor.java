package arreglosyherencia.ejcurso;

public abstract class Profesor extends Persona{
	
	private double tarifaHora;
	
	public abstract double informarCostoCursos();

	public Profesor(String nombre, int edad, String direccion, double tarifaHora) {
		super(direccion, edad, direccion);
		this.tarifaHora = tarifaHora;
	}
	
	public double getTarifaHora() {
		return tarifaHora;
	}

	public void setTarifaHora(double tarifaHora) {
		this.tarifaHora = tarifaHora;
	}

	@Override
	public String toString() {
		String mensaje = "Profesor: ";
		mensaje.concat(super.toString()).concat(" Tarifa Hora: " + tarifaHora);
		return mensaje;
	}
	
	
}
