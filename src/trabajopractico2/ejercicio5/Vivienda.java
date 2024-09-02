package trabajopractico2.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Vivienda {

	private int idVivienda;
	private static int cantVivienda=1;
	private Direccion direccion;

	private List<Persona> personas;
	private List<Mueble> muebles;
	
	//Composicion Un inmueble tiene un domicilio. Si se pierde la referencia a un inmueble, la de su domicilio también.
	public Vivienda(String calle, int altura, int piso, String dpto) {
		this.setIdVivienda();
		this.setDireccion(calle, altura, piso, dpto);
		this.personas = new ArrayList<Persona>();
		this.muebles = new ArrayList<Mueble>();
	}
	
	private void setIdVivienda() {
		this.idVivienda = cantVivienda++;
	}

	public boolean validarVivienda(int piso, String dpto) {
		boolean encontrada = false;
		if(this.direccion.getPiso() == piso && this.direccion.getDpto().equalsIgnoreCase(dpto)) encontrada = true;
		return encontrada;
	}
	
	/**
	 * Para que se cumpla esta relación, el objeto compuesto se instancia dentro de la clase del objeto
	 * componente. Esto asegura que ambos tengan el mismo ciclo de vida.
	 * @param calle
	 * @param altura
	 * @param piso
	 * @param dpto
	 */
	public void setDireccion(String calle, int altura, int piso, String dpto) {
		this.direccion = new Direccion(calle, altura, piso, dpto);
	}
	
	public String agregarPersona(String nombre, String apellido, int edad) {
		Persona nuevaPersona = new Persona(nombre, apellido, edad);
		this.personas.add(nuevaPersona);
		return nuevaPersona.toString();
	}
	
	public void agregarPersonas(List<Persona> personas) {
		this.personas.addAll(personas);
	}
	
	public void agregarMuebles(List<Mueble> muebles) {
		this.muebles.addAll(muebles);
	}
	
	public String agregarMueble(String nombre, String material, String color) {
		Mueble nuevoMueble = new Mueble(nombre, material, color);
		this.muebles.add(nuevoMueble);
		return nuevoMueble.toString();
	}
	
	public List<Persona> getPersonas() {
		return personas;
	}

	public List<Mueble> getMuebles() {
		return muebles;
	}

	public String recuperarInfoVivienda() {
		return toString();
	}

	@Override
	public String toString() {
		return "Vivienda: " + idVivienda + ", Direccion: " + direccion + ", Personas: " + personas
				+ ", Muebles: " + muebles;
	}
	
	public void vaciarVivienda() {
		this.personas.clear();
		this.muebles.clear();
	}
	
}
