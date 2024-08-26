package trabajopractico1.ejercicio3;

import java.util.ArrayList;

public class JuegosOlimpicos {

		/**
		 * Ejercicio 3.
			Modificá el ejercicio anterior para que en vez de indicar solamente quién fue el ganador
			obtenga cuál fue la terna ganadora. Debe tener en cuenta que puede haber atletas que
			“empaten” en cualquiera de las tres posiciones del podio.
		 */
		
	public static void main(String[] args) {


		Carrera carrera = new Carrera();
		Terna terna100mts = new Terna("100mts");
		Terna terna400mts = new Terna("400mts");
		
		carrera.agregarTerna(terna100mts);
		carrera.agregarTerna(terna400mts);
		
		Atleta primerAtleta = new Atleta("Sofia", 35);
		Atleta segundoAtleta = new Atleta("Matias", 46);
		Atleta tercerAtleta = new Atleta("Juan", 37);
		Atleta cuartoAtleta = new Atleta("Natalia", 46);
		Atleta quintoAtleta = new Atleta("Pedro", 35);
		Atleta sextoAtleta = new Atleta("Claudio", 54);
		Atleta septimoAtleta = new Atleta("Valentina", 36);
		Atleta octvoAtleta = new Atleta("Sandra", 54);
		Atleta nvnoAtleta = new Atleta("Elias", 41);


		terna100mts.agregarAtleta(primerAtleta);
		terna100mts.agregarAtleta(segundoAtleta);
		terna100mts.agregarAtleta(tercerAtleta);
		terna100mts.agregarAtleta(nvnoAtleta);
		terna100mts.agregarAtleta(septimoAtleta);
		terna100mts.agregarAtleta(octvoAtleta);
		////
		terna400mts.agregarAtleta(tercerAtleta);
		terna400mts.agregarAtleta(cuartoAtleta);
		terna400mts.agregarAtleta(quintoAtleta);
		terna400mts.agregarAtleta(octvoAtleta);
		terna400mts.agregarAtleta(sextoAtleta);
		terna100mts.agregarAtleta(septimoAtleta);


		System.out.println("Atletas de 100mts: " + terna100mts.getAtletas().toString());
		
		ArrayList<Atleta> ganadores100 = terna100mts.getGanadores();
		System.out.println("Ganadores del 100mts: " + ganadores100);
		
		System.out.println("Atletas de 400mts: " + terna100mts.getAtletas().toString());

		
		ArrayList<Atleta> ganadores400 = terna400mts.getGanadores();
		System.out.println("Ganadores del 400mts: " + ganadores400);
		
		System.out.println("La terna ganadora es: " + carrera.getTernaGanadora());
	}

}
