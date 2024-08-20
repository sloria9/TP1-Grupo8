package trabajopractico1.ejercicio2;

public class Atleta {
	
	private String nombre;
	private double segundos;

	public Atleta(String nombre, double segundos) {
		this.nombre = nombre;
		this.segundos = segundos;
	}

	public double getSegundos() {
		return segundos;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
