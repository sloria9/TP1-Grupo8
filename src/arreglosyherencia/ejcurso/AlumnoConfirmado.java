package arreglosyherencia.ejcurso;

public class AlumnoConfirmado extends Inscripto{
	
	private static int cantAlumnos=1;
	private String nroAlumno;

	public AlumnoConfirmado(String nombre, int edad, String direccion, String tituloCurso) {
		super(nombre, edad, direccion, tituloCurso);
		setNroAlumno();
	}
	
	
	public String getNroAlumno() {
		return nroAlumno;
	}
	public void setNroAlumno() {
		this.nroAlumno = "ALU-"+cantAlumnos++;
	}
}
