//PARA GENERAR JAVADOC. PROJECT> GENERATE JAVADOC..
package alumno;
/**
 * Clase que representa un alumno de CFGS DAM
 * @author Jesus
 * @version 0.0
 */
public class Alumno {
	
	private String nombre;
	private String nif;
	private int edad;
	/**
	 * Contructor que crea alumnos, basado en los 3 argumentos
	 * @param nombre
	 * @param nif
	 * @param edad
	 */
	public Alumno(String nombre, String nif, int edad) {
		super();
		this.nombre = nombre;
		this.nif = nif;
		this.edad = edad;
	}
	/**
	 * Constructor por defecto
	 */
	public Alumno(){
	}
	/**
	 * Getter para cambiar nombre
	 * @return nombre del alumno
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Método para cambiar nombre del alumno
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNif() {
		return nif;
	}
	/**
	 * Método para cambiar el nif del alumno
	 * @param nif
	 */
	public void setNif(String nif) {
		this.nif = nif;
	}
	public int getEdad() {
		return edad;
	}
	/**
	 * Método para cambiar la edad del alumno
	 * @param edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	/**
	 * Método que sobreescribe el toString de la clase object
	 */
	public String toString() {
		return "Alumno [nombre=" + nombre + ", nif=" + nif + ", edad=" + edad
				+ "]";
	}
	/**
	 * Método que devuelve boolean indicando si es o no mayor de edad
	 * @return true si es mayor de edad
	 */
	public boolean esMayorEdad(){
		return this.edad > 17;
	}
	
	
	

}
