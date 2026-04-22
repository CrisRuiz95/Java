import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entradaDatos = new Scanner (System.in);
		
		String[] posiciones = new String[5];
		
		
		int i = 0;
		
		for(i=0; i < posiciones.length; i++) {
			System.out.println("Introduce el nombre: ");
			posiciones[i] = entradaDatos.next();
			
		}
		for (i=0; i<posiciones.length; i++) {
			System.out.println("La posición: " +i + " corresponde al nombre de: "+posiciones[i]);
		}
		
	}

}
