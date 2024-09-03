package arreglosyherencia.ejcurso;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	private String idCurso;
	private String tituloCurso;
	private int duracion;
	private String horario;
	private Profesor profesor;
	private int vacantes;
	private List<AlumnoConfirmado> alumnos;
	
	public Curso(String idCurso, String tituloCurso, int duracion, String horario, Profesor profesor, int vacantes) {
		super();
		this.idCurso = idCurso;
		this.tituloCurso = tituloCurso;
		this.duracion = duracion;
		this.horario = horario;
		this.profesor = profesor;
		this.vacantes = vacantes;
		this.alumnos = new ArrayList<AlumnoConfirmado>();
	}


	public String getIdCurso() {
		return idCurso;
	}


	public void setIdCurso(String idCurso) {
		this.idCurso = idCurso;
	}


	public String getTituloCurso() {
		return tituloCurso;
	}


	public void setTituloCurso(String tituloCurso) {
		this.tituloCurso = tituloCurso;
	}


	public int getDuracion() {
		return duracion;
	}


	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}


	public String getHorario() {
		return horario;
	}


	public void setHorario(String horario) {
		this.horario = horario;
	}


	public Profesor getProfesor() {
		return profesor;
	}


	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}


	public int getVacantes() {
		return vacantes;
	}


	public void setVacantes(int vacantes) {
		this.vacantes = vacantes;
	}


	@Override
	public String toString() {
		return "Curso idCurso: " + idCurso + ", titulo curso: " + tituloCurso + ", duracion: " + duracion + ", horario: "
				+ horario + ", profesor: " + profesor + ", vacantes: " + vacantes;
	}


	public List<AlumnoConfirmado> getAlumnos() {
		return alumnos;
	}
	
	public void agregarAlumno(AlumnoConfirmado alumno) {
		if(this.vacantes >= 1) {
			this.alumnos.add(alumno);
			this.vacantes -= 1; //resto una vacante
		} else System.out.println(" No hay vacantes disponibles para el curso: " + this.getTituloCurso() );

	}
	
	
}
