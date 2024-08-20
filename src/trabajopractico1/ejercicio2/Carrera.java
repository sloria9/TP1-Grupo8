package trabajopractico1.ejercicio2;

import java.util.ArrayList;

public class Carrera {

	private String especialidad;
	private ArrayList<Atleta> atletas;
	
	public Carrera(String especialidad) {
		this.atletas = new ArrayList<>();
		this.especialidad = especialidad;
	}

	public ArrayList<Atleta> getAtletas() {
		return atletas;
	}
	
	//despues filtramos por especialidad (ej 100mts, 400mts)
	// 
	public void getGanador() {
		int index = 0;
		Atleta ganador = null;
		double minSegundos = 0;
		ArrayList<Atleta> ganadores = new ArrayList<>();
		
		
		//revisar condicion para cuando hay mas de un ganador revisar esoq onda
		while(index < atletas.size() && ganador == null || ganadores.isEmpty()) {
			if(atletas.get(index).getSegundos() <= minSegundos) {
				minSegundos = atletas.get(index).getSegundos();
				ganador = atletas.get(index);
			}
			index++;
		}
	}
	
	
	
	
}
