package trabajopractico1.ejercicio2;

import java.util.ArrayList;

public class Carrera {

	private ArrayList<Atleta> atletas;

	public Carrera() {
		this.atletas = new ArrayList<>();
	}

	public String getAtletas() {
		return this.atletas.toString();
	}

	public void agregarAtleta(Atleta atleta) {
		if(atleta != null) this.atletas.add(atleta);
	}

	public ArrayList<Atleta> getGanador() {

		//asumimos que el primer atleta es el mas rapido
		double minSegundos = atletas.get(0).getSegundos();
		ArrayList<Atleta> ganadores = new ArrayList<>();
		ganadores.add(atletas.get(0));

		//recorro todos los atletas
		for (int i = 1; i < atletas.size(); i++) {
			Atleta atleta = atletas.get(i);

			if (atleta.getSegundos() <= minSegundos) {
				if (atleta.getSegundos() < minSegundos) {
					minSegundos = atleta.getSegundos();
					ganadores.clear();
				}
				ganadores.add(atleta);
			}
		}
		return ganadores;
	}




}
