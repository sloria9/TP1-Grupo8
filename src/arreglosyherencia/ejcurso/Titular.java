package arreglosyherencia.ejcurso;

public class Titular extends Profesor{

	private Curso curso;
	private int antiguedad;


	public Titular(String nombre, int edad, String direccion, double tarifaHora, int antiguedad) {
		super(nombre, edad, direccion, tarifaHora);
		this.antiguedad = antiguedad;
	}

	public int getAntiguedad() {
		return antiguedad;
	}


	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}


	@Override
	public double informarCostoCursos() {
		double costoBase = super.getTarifaHora() * curso.getDuracion();
		double adicional = Math.min(0.10 * antiguedad, 0.50);
		double bonus = costoBase * adicional;
		return costoBase + bonus;
	}


}
