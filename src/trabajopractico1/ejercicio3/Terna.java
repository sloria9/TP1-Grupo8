package trabajopractico1.ejercicio3;

import java.util.ArrayList;

public class Terna {

	private String nombreTerna;
	private ArrayList<Atleta> atletas;

	public Terna(String nombreTerna) {
		this.nombreTerna = nombreTerna;
		this.atletas = new ArrayList<Atleta>();
	}

	public String getNombreTerna() {
		return nombreTerna;
	}

	public String getAtletas() {
		return this.atletas.toString();
	}
	
	public ArrayList<Atleta> getAtletasList() {
		return this.atletas;
	}
	
	public void agregarAtleta(Atleta atleta) {
		if(atleta != null) this.atletas.add(atleta);
	}

	public ArrayList<Atleta> getGanadores() {

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
	
	@Override
	public String toString() {
		return " Nombre de la terna: " + nombreTerna;
	}
	
}
