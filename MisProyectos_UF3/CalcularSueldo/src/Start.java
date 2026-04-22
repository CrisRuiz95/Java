import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		
		try (Scanner entradaDatos = new Scanner(System.in)) {
			float sueldoMensual=9.0f; 
			float numeroDeHoras=8.0f; 
			float numeroDeDias=3.0f; 
			float precioHora=10.0f; 
			String dni="343434A"; 
			
			System.out.println("Introduce el número de horas: ");
			numeroDeHoras= entradaDatos.nextFloat();
			
			System.out.println("El número de horas introducido es" + numeroDeHoras);
			
			sueldoMensual=numeroDeHoras * precioHora * numeroDeDias; 
			
			System.out.println("Introduce el número de días: ");
			numeroDeDias= entradaDatos.nextFloat();
			
			//Lo mismo se haría con el DNI y el precio hora
			
			System.out.println("Tu sueldo es: " + sueldoMensual);
		} 
	
	}
	}	