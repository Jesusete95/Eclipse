package pendulo;

public class Pendulo {
// Atributos
	private double longitud;
	public static final double GRAVEDAD = 9.8;
// Constructor
public Pendulo(double longitud) {
	this.longitud = longitud;
}
// Getters & Setters
public double getLongitud() {
	return longitud;
}
public void setLongitud(double longitud) {
	this.longitud = longitud;
}
// Métodos
public double calcularPeriodo() {
	return 2*Math.PI*(Math.sqrt(this.longitud/GRAVEDAD));
}
// Método toString()
@Override
public String toString() {
	return "Pendulo, de longitud: "+ longitud +" metros, tiene de periodo: " + calcularPeriodo() + " segundos";
}



	
}
