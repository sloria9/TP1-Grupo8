package trabajopractico2.ejercicio5;

public class ViviendaTest {

	public static void main(String[] args) {

/**
 *
 * Vivienda 1: Direccion: Montañeses 1234 4°”C”
 *  Personas: Nombre: Arturo Roman, Edad: 53 Nombre: Mónica Gaztambide, Edad: 35
 *   Muebles: Mesa de Madera color Marrón. Mesada de Mármol color Rojo Perchero de Metal color Negro Sillón de Cuero color Azul 
 * 
 */
		Edificio nuevoEdificio = new Edificio("Acevedo building");
		
		nuevoEdificio.agregarVivienda("Eduardo Acevedo", 525, 3, "B");
		
		nuevoEdificio.agregarVivienda("Eduardo Acevedo", 525, 7, "A");
		
		nuevoEdificio.agregarPersona(3, "B", "Sofia", "Loria", 24);
		
		nuevoEdificio.agregarPersona(3, "B", "Ignacio", "Speicys", 27);		
		
		nuevoEdificio.agregarMueble(3, "B", "Rack", "Madera", "Marron");
		nuevoEdificio.agregarMueble(3, "B", "Mesa ratona", "Vidrio", "N/A");
		
		nuevoEdificio.mostrarTodo();
		
		nuevoEdificio.realizarMudanza(3, "B", 7, "A");
		nuevoEdificio.mostrarTodo();

	}

}
