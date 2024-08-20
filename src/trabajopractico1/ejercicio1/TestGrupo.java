package trabajopractico1.ejercicio1;

public class TestGrupo {

	public static void main(String[] args) {
		
		Grupo grupo1 = new Grupo("Primer grupo");
		
		System.out.println(grupo1.agregarIntegrante("Manuel"));
		System.out.println(grupo1.agregarIntegrante("Natalia"));
		System.out.println(grupo1.agregarIntegrante("Juan Cruz"));
		System.out.println(grupo1.agregarIntegrante("Pedro"));
		
		System.out.println( "Cantidad de integrantes del grupo " + grupo1.getCantidadIntegrantes());
		
		System.out.println(grupo1.agregarIntegrante("Natalia"));

		System.out.println(grupo1.removerIntegrante("pedro"));
		
		grupo1.mostrarIntegrantes();
	}

}
