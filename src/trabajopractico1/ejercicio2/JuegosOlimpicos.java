package trabajopractico1.ejercicio2;

public class JuegosOlimpicos {

	/**
	 * Para los Juegos Olímpicos de la Juventud nos pidieron un programa con el cual podamos
	 * calcular quién fue el ganador de una carrera. Para eso ingresaremos un atleta y los
	 * segundos que ha empleado (con decimales) para recorrer la distancia de una especialidad
	 * determinada. Se debe tener en cuenta que puede haber más de un ganador (sus tiempos empleados fueron los mismos).
	 */
	public static void main(String[] args) {


		Atleta primerAtleta = new Atleta("Sofia", 35);
		Atleta segundoAtleta = new Atleta("Matias", 46);
		Atleta tercerAtleta = new Atleta("Juan", 37);
		Atleta cuartoAtleta = new Atleta("Natalia", 46);
		Atleta quintoAtleta = new Atleta("Pedro", 35);


		Carrera nuevaCarrera = new Carrera();
		nuevaCarrera.agregarAtleta(primerAtleta);
		nuevaCarrera.agregarAtleta(segundoAtleta);
		nuevaCarrera.agregarAtleta(tercerAtleta);
		nuevaCarrera.agregarAtleta(cuartoAtleta);
		nuevaCarrera.agregarAtleta(quintoAtleta);

		
		System.out.println(nuevaCarrera.getAtletas());
		
		System.out.println(nuevaCarrera.getGanador());

	}

}
