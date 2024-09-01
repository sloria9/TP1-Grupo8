package trabajopractico2.ejercicio4;

public class Mueble {

	@Override
	public String toString() {
		return " Nombre: " + nombre + ", Material: " + material + ", Color: " + color; 
	}
	private String nombre;
	private String material;
	private String color;
	
	public Mueble(String nombre, String material, String color) {
		setNombre(nombre);
		setMaterial(material);
		setColor(color);
	}
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
