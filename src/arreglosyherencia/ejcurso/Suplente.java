package arreglosyherencia.ejcurso;

public class Suplente extends Profesor{

	private Curso curso;
	private int cantSuplencias;

	
	public Suplente(String nombre, int edad, String direccion, double tarifaHora, int cantSuplencias) {
		super(nombre, edad, direccion, tarifaHora);
		this.cantSuplencias = cantSuplencias;
	}

	public int getCantSuplencias() {
		return cantSuplencias;
	}

	public void setCantSuplencias(int cantSuplencias) {
		this.cantSuplencias = cantSuplencias;
	}


	@Override
	public double informarCostoCursos() {
        return super.getTarifaHora() * curso.getDuracion();
	}
}
