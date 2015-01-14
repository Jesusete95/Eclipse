package persona;

public class TestPersonaArgumentos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = args[0]; // Run>Run Configurations>Arguments>Program Arguments
		int edad = Integer.parseInt(args[1]); // LOS ESPACIOS SEPARAN "Program Arguments"
		Persona p = new Persona(nombre, edad);
		System.out.println(p);
		if (p.esMayorDeEdad()) {
			System.out.println(p.getNombre()+" es mayor de edad.");
		} else {
			System.out.println(p.getNombre()+" no es mayor de edad.");
		}
	}

}
