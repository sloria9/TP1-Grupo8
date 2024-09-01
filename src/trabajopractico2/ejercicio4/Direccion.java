package trabajopractico2.ejercicio4;

public class Direccion {

	private String calle;
	private int altura;
	private int piso;
	private String dpto;

	public Direccion(String calle, int altura, int piso, String dpto) {
		setCalle(calle);
		setAltura(altura);
		setPiso(piso);
		setDpto(dpto);
	}


	@Override
	public String toString() {
		return " calle: " + calle + ", altura: " + altura + ", piso: " + piso + ", dpto: " + dpto;
	}


	public void setCalle(String calle) {
		this.calle = calle;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public void setDpto(String dpto) {
		this.dpto = dpto;
	}
	public void setPiso(int piso) {
		this.piso = piso;
	}
}
