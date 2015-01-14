package persona;

public class TestPersona {

	public static void main(String[] args) {
	Persona p = new Persona("Jesus", 19);
	System.out.println(p);
	System.out.println("¿Es mayor de edad?: "+p.esMayorDeEdad());
	// Vamos a cambiar la edad a Jesus
	p.setEdad(21);
	System.out.println(p);
	System.out.println("¿Es mayor de edad?: "+p.esMayorDeEdad());
	}

}
