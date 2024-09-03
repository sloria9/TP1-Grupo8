package arreglosyherencia.ejcurso;

public class AlumnoConfirmado extends Inscripto{
	

	private static int cantAlumnos=1;
	private int nroAlumno;

	public AlumnoConfirmado(String nombre, int edad, String direccion, String tituloCurso) {
		super(nombre, edad, direccion, tituloCurso);
		setNroAlumno();
	}
	
	
	public int getNroAlumno() {
		return nroAlumno;
	}

	public void setNroAlumno() {
		this.nroAlumno = cantAlumnos++;
	}
	
	
}
