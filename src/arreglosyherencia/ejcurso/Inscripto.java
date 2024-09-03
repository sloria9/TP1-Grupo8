package arreglosyherencia.ejcurso;

public class Inscripto extends Persona {
	
	private String tituloCurso;
	
	public Inscripto(String nombre, int edad, String direccion, String tituloCurso) {
		super(nombre, edad, direccion);
		this.tituloCurso = tituloCurso;
	}
	

	@Override
	public String toString() {
		super.toString();
		return "Inscripto a curso: " + tituloCurso;
	}

	public String getTituloCurso() {
		return tituloCurso;
	}

	public void setTituloCurso(String tituloCurso) {
		this.tituloCurso = tituloCurso;
	}
	
}
