package trabajopractico2.ejercicio5;

public class Persona {

	private String nombre;
	private String apellido;
	private int edad;
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Apellido: " + apellido + ", Edad: " + edad;
	}

	public Persona(String nombre, String apellido, int edad) {
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setEdad(edad);
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
