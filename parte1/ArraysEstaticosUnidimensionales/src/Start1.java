import java.util.Scanner;

public class Start1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entradaDatos = new Scanner (System.in);
		String nombre="";
		String [] alumnos2 = new String [4];
		int i = 0 ;
		
		for (i=0; i < alumnos2.length; i++) {
			System.out.println("Introduzca el nombre del alumno de la posición "+i + " es: ");
			nombre = entradaDatos.next();
			
			alumnos2[i] = nombre;
		}
		for (i=0; i < alumnos2.length; i++) {
			System.out.println("La posición " +i + " es: " +alumnos2[i]);
		}
	}

}
