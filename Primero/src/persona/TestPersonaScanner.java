package persona;
import java.util.Scanner;


public class TestPersonaScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Dime el nombre:");
		String nombre = in.next();
		System.out.println("Dime la edad:");
		int edad = in.nextInt();
		
		Persona p = new Persona(nombre, edad);
		System.out.println(p);
		
		in.close();
	}

}
/* PARA CREAR EL ARCHIVO. JAR
 * BOT�N DERECHO EN EL ARCHIVO QUE QUEREMOS CONVERTIR, LUEGO EXPORT.
 * EN LA CMD, NOS VAMOS AL DIRECTORIO DONDE EST� EL .JAR
 * java -jar nombredelarchivo.jar
 */
