package trabajopractico1.ejercicio3;

import java.util.ArrayList;

public class Carrera {
	
	private ArrayList<Terna> ternas;

	public Carrera() {
		this.ternas = new ArrayList<Terna>();
	}
	
	public String getTernas() {
		return this.ternas.toString();
	}
	
	public boolean existeTerna(String nombreTerna) {
		int index = 0;
		boolean existe = false;
		while (index < this.ternas.size()) {
			if (this.ternas.get(index).getNombreTerna().equalsIgnoreCase(nombreTerna)) {
				existe = true;
			}
			index++;
		}
		return existe;
	}
	
	public void agregarTerna(Terna terna) {
		if (terna != null && !existeTerna(terna.getNombreTerna())) {
			this.ternas.add(terna);
		}else System.out.println(" La terna ya existe ");
	}

	public Terna getTerna(String nombreTerna) {
		for (Terna terna : this.ternas) {
			if (terna.getNombreTerna().equalsIgnoreCase(nombreTerna)) {
				return terna;
			}
		}
		return null;
	}
	
    public Terna getTernaGanadora() {
        Terna ternaGanadora = null;
        double bestTime = Double.MAX_VALUE;

        for (Terna terna : ternas) {
            double fastestTimeInTerna = findFastestTime(terna);

            if (fastestTimeInTerna < bestTime) {
                bestTime = fastestTimeInTerna;
                ternaGanadora = terna;
            }
        }

        return ternaGanadora;
    }

    private double findFastestTime(Terna terna) {
        double fastestTime = Double.MAX_VALUE;
        for (Atleta atleta : terna.getAtletasList()) {
            if (atleta.getSegundos() < fastestTime) {
                fastestTime = atleta.getSegundos();
            }
        }
        return fastestTime;
    }




}
