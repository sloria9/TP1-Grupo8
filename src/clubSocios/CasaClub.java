package clubSocios;

import java.util.ArrayList;

public class CasaClub {

	private ArrayList<Socio> socios;

	public CasaClub() {
		this.socios = new ArrayList<Socio>();
	}
	
	//buscar socio, agregar socio

	public void agregarSocio(Socio nuevoSocio) {
		if(nuevoSocio != null && this.buscarSocio(nuevoSocio.getNroSocio()) == null) {
			socios.add(nuevoSocio);
		}
	}
	public Socio buscarSocio(int nroSocio) {
		Socio encontrado = null;
		int i = 0;
		
		while(i < socios.size() && encontrado == null) {
			if(socios.get(i).getNroSocio() == nroSocio) {
				encontrado = socios.get(i);
			}
			i++;
		}
		return encontrado;
		
	}
	
	public ArrayList<Socio> listarVitalicios(){
		ArrayList<Socio> vitalicios = new ArrayList<>();
		for(Socio socio: socios) {
			if(socio.esVitalicio()) {
				vitalicios.add(socio);
			}
		}
		return vitalicios;
	}
	
	public Socio removerSocio(int nroSocio) {

		Socio socio = buscarSocio(nroSocio);
		if(socio == null) System.out.println("No se ha encontrado el socio. ");
		
		this.socios.remove(socio);
		
		return socio;
	}
	

	
	
}
