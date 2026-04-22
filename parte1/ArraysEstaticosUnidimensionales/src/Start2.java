import java.util.Scanner;

public class Start2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entradaDatos = new Scanner (System.in);
		int num=0;
		String nombre="";
		int i = 0 ;
		
		System.out.println("Introduce el número de alumnos a escribir: ");
		num = entradaDatos.nextInt();
		
		String [] alumnos2 = new String [num];
		
		for (i=0; i < alumnos2.length; i++) {
			System.out.println("Introduzca el nombre del alumno de la posición " +i + ": " );
			nombre = entradaDatos.next();
			alumnos2[i] = nombre;
		}
		
		for (i=0; i < alumnos2.length; i++) {
			System.out.println("La posición " +i + " es: " +alumnos2[i]);
		}
	}

}
