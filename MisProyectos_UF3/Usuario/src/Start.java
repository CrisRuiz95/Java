import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entradaDatos=new Scanner(System.in);
		String nombre="";
		int edad=0;
		
		System.out.println("introduce tu nombre");
		nombre=entradaDatos.next();
		
		System.out.println("Introduce tu edad");
		edad= entradaDatos.nextInt();
		
		System.out.println("Tu nombre es" + nombre +  "y tu edad es" + edad);
		
		if(nombre.equalsIgnoreCase("Pepe") && (edad >=18)) {
			System.out.println("Eres mayor de edad");
		}
		else {
			System.out.println("No eres mayor de edad");
		}
	}

}
