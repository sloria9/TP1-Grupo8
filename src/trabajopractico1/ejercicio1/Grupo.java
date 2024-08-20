package trabajopractico1.ejercicio1;

import java.util.ArrayList;

public class Grupo {

	private String nombreGrupo;
	private ArrayList<String> integrantes;  //nombre de integrantes


	public Grupo(String nombreGrupo) {
		setNombreGrupo(nombreGrupo);
		this.integrantes = new ArrayList<String>();
	}


	public void setNombreGrupo(String nombreGrupo) {
		this.nombreGrupo = nombreGrupo;
	}


	public String getNombreGrupo() {
		return nombreGrupo;
	}

	public int getCantidadIntegrantes() {
		return integrantes.size();
	}


	/**
	 * Agrega al grupo el nombre de un nuevo integrante,
	 * siempre y cuando éste no haya sido cargado con anterioridad.
	 *
	 * @param nombreIntegrante
	 * @return
	 */
	public String agregarIntegrante(String nombreIntegrante) {
		String agregado = null;

		if(this.integrantes.isEmpty() || this.buscarIntegrante(nombreIntegrante) == null) {
			this.integrantes.add(nombreIntegrante);
			agregado = nombreIntegrante.concat( " fue agregado ");
		}else {
			agregado = "El integrante " + nombreIntegrante + " ya existe ";
		}
		return agregado;
	}


	/**
	 * Busca al integrante del grupo cuyo
	 * nombre coincida con el parámetro de entrada. En caso de que haya coincidencia, lo
	 * devuelve; caso contrario, el método devolverá null.
	 *
	 * @param nombreIntegrante
	 * @return
	 */
	private String buscarIntegrante(String nombreIntegrante) {
		String encontrado = null;
		int index = 0;

		while(index < integrantes.size() && encontrado == null) {
			if(integrantes.get(index).equalsIgnoreCase(nombreIntegrante)) {
				encontrado = integrantes.get(index);
			}
			index++;
		}
		return encontrado;
	}


	/**
	 * Devuelve la posición en el grupo del integrante cuyo nombre se ha recibido por parámetro.
	 * En caso de no encontrarlo devolverá -1.
	 *
	 * @param nombreIntegrante
	 * @return
	 */
	private int obtenerPosicionIntegrante(String nombreIntegrante) {
		int posic = -1;
		int index = 0;


		while(index < integrantes.size() && posic == -1) {
			if(integrantes.get(index).equalsIgnoreCase(nombreIntegrante)) {
				posic = index;
			}
			index++;
		}
		return posic;
	}


	/**
	 * Recibe un valor entero que representa la pposición del integrante en la lista (entero igual o mayor que 1)
	 * y devuelve el integrante guardado en (posicion - 1) dentro de la colección de integrantes.
	 * Si el integrante no existe se debe devolver null.
	 * @param posicIntegrante
	 * @return
	 */
	public String obtenerIntegrante(int posicIntegrante) {
		String integrantePosic = null;

		if(posicIntegrante < this.integrantes.size()) {
			integrantePosic = this.integrantes.get(posicIntegrante-1);
		}
		return integrantePosic;
	}


	/**
	 * Remueve de la colección de integrantes a aquel cuyo nombre coincide con el nombre recibido como parámetro.
	 * Si lo encontró, luego de removerlo debe devolverlo con return, y si no debe devolver null.
	 * @param nombreIntegrante
	 * @return
	 */
	public String removerIntegrante(String nombreIntegrante) {

		String integrante = buscarIntegrante(nombreIntegrante);
		int posicIntegrante = obtenerPosicionIntegrante(nombreIntegrante);

		if(integrante != null && posicIntegrante != -1) this.integrantes.remove(posicIntegrante);

		return integrante;
	}


	/**
	 *  Muestra por consola la cantidad de integrantes y los nombres de cada uno de ellos.
	 */
	public void mostrarIntegrantes() {
		System.out.println(toString());
		System.out.println(recuperarCantidadIntegrantes());
		System.out.println(recuperarNombres());
	}


	@Override
	public String toString() {
		return "Nombre del grupo: " + getNombreGrupo() ;
	}

	private String recuperarNombres() {
		return this.integrantes.toString();
	}

	private String recuperarCantidadIntegrantes() {
		return "La cantidad de integrantes es " + this.getCantidadIntegrantes();
	}

	public void vaciar() {
		System.out.println(" Se eliminan todos los integrantes de la lista. ");
		this.integrantes.removeAll(integrantes);
	}
}
