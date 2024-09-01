package trabajopractico2.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Vivienda {

	private int idVivienda;
	private static int cantVivienda=1;
	private Direccion direccion;
	private List<Persona> personas;
	private List<Mueble> muebles;
	
	public Vivienda(Direccion direc) {
		this.setIdVivienda();
		this.setDireccion(direc);
		this.personas = new ArrayList<Persona>();
		this.muebles = new ArrayList<Mueble>();
	}
	
	public void setIdVivienda() {
		this.idVivienda = cantVivienda++;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	public static Direccion crearVivienda(String direccion, int altura, int piso, String dpto) {
		Direccion nuevaVivienda = new Direccion(direccion, altura, piso, dpto);
		return nuevaVivienda;
	}
	
	public String agregarPersona(String nombre, String apellido, int edad) {
		Persona nuevaPersona = new Persona(nombre, apellido, edad);
		this.personas.add(nuevaPersona);
		return nuevaPersona.toString();
	}
	
	public String agregarMueble(String nombre, String material, String color) {
		Mueble nuevoMueble = new Mueble(nombre, material, color);
		this.muebles.add(nuevoMueble);
		return nuevoMueble.toString();
	}
	
	
	public String recuperarInfoVivienda() {
		return toString();
	}

	@Override
	public String toString() {
		return "Vivienda: " + idVivienda + ", Direccion: " + direccion + ", Personas: " + personas
				+ ", Muebles: " + muebles;
	}
	
	
}
