package persona;

public class Persona {
	// Atributos
	private String nombre;
	private int edad;

	// Constructor
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	// Getters & Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// Método toString 
	@Override
	public String toString() {
		return "Persona [Nombre=" + nombre + ", Edad=" + edad + "]";
	}
	
	/** Método que me devuelve si es mayor de edad
	 * @return true si es mayor de edad
	 */
	public boolean esMayorDeEdad(){
	return this.edad >= 18;
	}
	

}
