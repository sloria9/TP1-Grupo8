package trabajopractico2.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Edificio {

	private String nombre;
	private List<Vivienda> viviendas;
	
	public Edificio(String nombre) {
		setNombre(nombre);
		this.viviendas = new ArrayList<Vivienda>();
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void agregarVivienda(String calle, int altura, int piso, String dpto) {
		this.viviendas.add(new Vivienda(calle, altura, piso, dpto));
	}
	
	public void agregarPersona(int piso, String dpto, String nombre, String apellido, int edad) {
		Vivienda vivienda = recuperarViviendaByPisoDpto(piso, dpto);
		vivienda.agregarPersona(nombre, apellido, edad);
	}
	
	
	public void agregarMueble(int piso, String dpto, String nombre, String material, String color) {
		Vivienda vivienda = recuperarViviendaByPisoDpto(piso, dpto);
		vivienda.agregarMueble(nombre, material, color);
	}
	
	
	public List<String> realizarMudanza(int pisoOrigen, String dptoOrigen, int pisoDestino, String dptoDestino) {
		
		List<String> infoViviendas = new ArrayList<String>();
		
		Vivienda viviendaOrigen = recuperarViviendaByPisoDpto(pisoOrigen, dptoOrigen);
		Vivienda viviendaDestino = recuperarViviendaByPisoDpto(pisoDestino, dptoDestino);
		
		if(viviendaOrigen != null && viviendaDestino != null) {
			
			String infoViviendaOrigen = viviendaOrigen.recuperarInfoVivienda();
			
			viviendaDestino.agregarPersonas(viviendaOrigen.getPersonas());
			viviendaDestino.agregarMuebles(viviendaOrigen.getMuebles());
			
			viviendaOrigen.vaciarVivienda();
			
			String infoViviendaDestino = viviendaDestino.recuperarInfoVivienda();
			
			infoViviendas.add(infoViviendaOrigen);
			infoViviendas.add(infoViviendaDestino);
		}
		
		return infoViviendas;
	}
	
	
	private Vivienda recuperarViviendaByPisoDpto(int piso, String dpto) {
		Vivienda encontrada = null;
		boolean flagEncontrada = false;
		int index = 0;
		
		while(index < this.viviendas.size() && encontrada == null) {
			Vivienda vivienda = this.viviendas.get(index);
			flagEncontrada = vivienda.validarVivienda(piso, dpto);
			if(flagEncontrada) {
				encontrada = vivienda;
			}
			index++;
		}
		return encontrada;
	}
	
	public void mostrarTodo() {
		for(Vivienda vivienda: this.viviendas) {
			System.out.println(vivienda.recuperarInfoVivienda());
		}
	}
	
}
