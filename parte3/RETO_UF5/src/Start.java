import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre="";
		int empleados=0;
		float salario=0.0f;
		float media = 0.0f;
		int i = 0 ; 
	
		Scanner entradaDatos = new Scanner (System.in);
		
		System.out.println("Introduce el número de empleados que existen: ");
		empleados= entradaDatos.nextInt();
		
		String [] nombres = new String [empleados];
		float [] salarios = new float [empleados];
		
	
		for (i = 0 ; i < nombres.length; i++) {
			System.out.println("Introduce el nombre del empleado: ");
			nombre = entradaDatos.next();
			System.out.println("Introduce el salario de cada empleado: ");
			salario= entradaDatos.nextFloat();
			nombres [i] = nombre; 
			salarios [i] = salario; 
			media = media + salario;
			
			}
			for (i = 0 ; i < nombres.length; i++) {
			
				System.out.println("El empleado es: " +nombres[i] + " cuyo salario es: " + salarios[i]);
				
			} 
			media = media / empleados;
			System.out.println("La media de los salarios es: " + media);
			
	}

}
