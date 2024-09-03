package arreglosyherencia.ejcurso;

import java.util.ArrayList;
import java.util.List;

public class Centro {

	private List<Curso> cursos;
	private List<Profesor> profesores;
	private List<Inscripto> inscriptos;
	
	public Centro() {
		this.cursos = new ArrayList<Curso>();
		this.profesores = new ArrayList<Profesor>();
		this.inscriptos = new ArrayList<Inscripto>();
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	public List<Profesor> getProfesores() {
		return profesores;
	}

	public void setProfesores(List<Profesor> profesores) {
		this.profesores = profesores;
	}
	
	public boolean asignarAlumno(Inscripto alumnoInscripto) {
		boolean alumnoAsignado = false;
		
		Curso cursoAsignar = existeCurso(alumnoInscripto.getTituloCurso());
		
		if(cursoAsignar != null) {
			cursoAsignar.agregarAlumno(convertTo(alumnoInscripto));
			this.inscriptos.remove(alumnoInscripto);
		}
		return alumnoAsignado;
	}

	private AlumnoConfirmado convertTo(Inscripto alumnoInscripto) {
		AlumnoConfirmado alumnoConfirmado = new AlumnoConfirmado(
				alumnoInscripto.getNombre(),
				alumnoInscripto.getEdad(),
				alumnoInscripto.getDireccion(), 
				alumnoInscripto.getTituloCurso());
		return alumnoConfirmado;
	}

	//valido si el curso al que se quiere inscribir existe
	private Curso existeCurso(String tituloCurso) {
		Curso encontro = null;
		int indx = 0;
		
		while(indx<this.cursos.size() && encontro == null) {
			if(this.cursos.get(indx).getTituloCurso().equalsIgnoreCase(tituloCurso)) {
				encontro = this.cursos.get(indx);
			}
		}
		indx++;
		return encontro;
	}
	
}
