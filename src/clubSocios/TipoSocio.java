package clubSocios;

public enum TipoSocio {
	
	VITALICIO (0.10, true),
	TRADICIONAL (0.08, false), 
	VIP (0.18, true);
	
	
	
	private double valor;
	private boolean permisos; 
	
	TipoSocio (double valor, boolean permisos){
		this.valor = valor; 
		this.permisos = permisos; 
	}

	public double obtenerDescuento() {
		return valor; 
	}
	
	public boolean obtenerPermiso() {
		return permisos;
	}
	
}