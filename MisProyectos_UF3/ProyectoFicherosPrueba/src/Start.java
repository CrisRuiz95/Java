import java.util.InputMismatchException;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre="";
		int edad=0;
		Scanner entradaDatos = new Scanner (System.in);
		
		try {
			
		System.out.println("Introduce tu edad");
		edad =entradaDatos.nextInt();
		
		System.out.println("Introduce tu nombre");
		nombre =entradaDatos.next();
		
		System.out.println("Tu nombre es: " +nombre);
		}
		catch(ArithmeticException aritm) {
			System.out.println("No se puede dividir entre 0");
			}
		catch(InputMismatchException numerico) {
			System.out.println("El tipo de dato debe de ser numérico");
			}
		catch(Exception e) {
			System.out.println("Se ha producido un error en el programa");
		}
			System.out.println("Continuo.....");
		}
	
}

/** 
**/