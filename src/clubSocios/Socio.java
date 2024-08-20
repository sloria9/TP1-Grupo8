package clubSocios;

public class Socio {

	private int nroSocio;
	private String nombreCompleto;
	private String numTelefono;
	private Fecha creationDate;
	private TipoSocio tipoSocio;
	private static int conteoSocio=1;

	
	public int getNroSocio() {
		return nroSocio;
	}


	public Socio(String nombreCompleto, String numTelefono, Fecha creationDate, TipoSocio tipoSocio) {
		this.setNroSocio();
		this.nombreCompleto = nombreCompleto;
		this.numTelefono = numTelefono;
		this.creationDate = creationDate;
		this.tipoSocio = tipoSocio;
	}


	public String getNombreCompleto() {
		return nombreCompleto;
	}


	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}


	public String getNumTelefono() {
		return numTelefono;
	}


	public void setNumTelefono(String numTelefono) {
		this.numTelefono = numTelefono;
	}


	public Fecha getCreationDate() {
		return creationDate;
	}


	public void setCreationDate(Fecha creationDate) {
		this.creationDate = creationDate;
	}


	public TipoSocio getTipoSocio() {
		return tipoSocio;
	}


	public void setTipoSocio(TipoSocio tipoSocio) {
		this.tipoSocio = tipoSocio;
	}


	public void setNroSocio() {
		this.nroSocio = conteoSocio++;;
	}


	public boolean esVitalicio() {
		return TipoSocio.VITALICIO.equals(this.tipoSocio);
	}
	

}
