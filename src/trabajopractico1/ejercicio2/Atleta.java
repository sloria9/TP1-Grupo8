package trabajopractico1.ejercicio2;

public class Atleta {
	
	
	private int nroAtleta;
	private String nombre;
	private double segundos;
	private static int conteoAtleta=1;


	public Atleta(String nombre, double segundos) {
		this.setNroAtleta();
		this.nombre = nombre;
		this.segundos = segundos;
	}

	public double getSegundos() {
		return segundos;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setNroAtleta() {
		this.nroAtleta =  conteoAtleta++;
	}

	@Override
	public String toString() {
		return " Nro de atleta: " + nroAtleta + ", nombre: " + nombre + ", segundos: " + segundos ;
	}
	
	
}
