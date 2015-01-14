package pendulo;

import java.util.Scanner;

public class TestPenduloScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Dime la longitud del pendulo:");
		double longitud = in.nextDouble();
					
		Pendulo p = new Pendulo(longitud);
		System.out.println(p);
		
		in.close();
	}

}
