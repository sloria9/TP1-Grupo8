package trabajopractico2.ejercicio5;

public class Mueble {


	private String nombre;
	private String material;
	private String color;
	
	public Mueble(String nombre, String material, String color) {
		setNombre(nombre);
		setMaterial(material);
		setColor(color);
	}
	
	@Override
	public String toString() {
		return " Nombre: " + nombre + ", Material: " + material + ", Color: " + color; 
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
