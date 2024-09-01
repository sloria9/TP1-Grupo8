package trabajopractico2.ejercicio4;

public class ViviendaTest {

	public static void main(String[] args) {

/**
 *
 * Vivienda 1: Direccion: Montañeses 1234 4°”C”
 *  Personas: Nombre: Arturo Roman, Edad: 53 Nombre: Mónica Gaztambide, Edad: 35
 *   Muebles: Mesa de Madera color Marrón. Mesada de Mármol color Rojo Perchero de Metal color Negro Sillón de Cuero color Azul 
 * 
 */
		
		
		Direccion nuevaDirec = Vivienda.crearVivienda("Eduardo Acevedo", 525, 3, "B");
		
		Vivienda nuevaVivienda = new Vivienda(nuevaDirec);
		
		nuevaVivienda.agregarPersona("Sofia", "Loria", 24);
		nuevaVivienda.agregarPersona("Ignacio", "Speicys", 27);
		
		nuevaVivienda.agregarMueble("Rack", "Madera", "Marron");
		nuevaVivienda.agregarMueble("Mesa ratona", "Vidrio", "N/A");
		
		System.out.println(nuevaVivienda.recuperarInfoVivienda());
		

		
	}

}
