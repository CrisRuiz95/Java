import java.util.Scanner;

import Operaciones.Operaciones;


public class Start {
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner calculadora=new Scanner(System.in);
		System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
		System.out.println("★★★Calculadora de Calculator Versión 2 S.A★★★");
		System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
		System.out.println("");
		System.out.println("");
		
		//Calculadora básica:
		int operacion;
		float numero1=0.0f;
		float numero2=0.0f;
		float numero3=0.0f;
		float resultado=0.0f;	
		
		
		
		Scanner factorialScanner= new Scanner(System.in);
		
		
		
		
		do {
			
			System.out.println("Introduzca una opción del menú ");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Número mayor de 3 números");
			System.out.println("6. Factorial");
			System.out.println("0. Salir");
			System.out.println("");
			System.out.println("");

			System.out.println("Introduzca una opción: ");
			operacion=calculadora.nextInt();
			
			
			
			switch (operacion) {
			case 1: 
								
					System.out.println("");
					System.out.println("Introduzca el primer número flotante a sumar: "); 
					numero1 = calculadora.nextFloat();
					System.out.println(""); 
					System.out.println("Introduzca el segundo número flotante a sumar: ");
					numero2= calculadora.nextFloat();
					resultado= Operaciones.suma(numero1, numero2);
					
					System.out.println("");
					System.out.println("✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸"); 
					System.out.println("La suma de " +numero1 + " y " +numero2+ " es: " +resultado); 
					System.out.println("✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸"); 
					System.out.println("");
					break;
			case 2: 
					System.out.println("");
					System.out.println("Introduzca el primer número flotante a restar: "); 
					numero1 = calculadora.nextFloat();
					System.out.println("Introduzca el segundo número flotante a restar: ");
					numero2= calculadora.nextFloat();
					resultado=Operaciones.resta(numero1, numero2);
					
					System.out.println("");
					System.out.println("✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸"); 
					System.out.println("La resta de " +numero1 + " y " +numero2+ " es: " +resultado); 
					System.out.println("✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸"); 
					System.out.println("");
					break;
			case 3: 
					System.out.println("Introduzca el primer número flotante a Multiplicar: "); 
					numero1 = calculadora.nextFloat();
					System.out.println("Introduzca el segundo número flotante a Multiplicar: ");
					numero2= calculadora.nextFloat();
					resultado=Operaciones.multiplicacion(numero1, numero2);
					
					System.out.println("");
					System.out.println("✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸"); 
					System.out.println("La multiplicación de " +numero1 + " y " +numero2+ " es: " +resultado); 
					System.out.println("✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸"); 
					System.out.println("");
					break;
			case 4: 
					System.out.println("Introduzca el primer número flotante a dividir: "); 
					numero1 = calculadora.nextFloat();
					System.out.println("Introduzca el segundo número flotante a dividir: ");
					numero2= calculadora.nextFloat();
					resultado=Operaciones.division(numero1, numero2);
					System.out.println("");
					System.out.println("✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸"); 
					System.out.println("La división de " +numero1 + " y " +numero2+ " es: " +resultado); 
					System.out.println("✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸"); 
					System.out.println("");
					if (numero2==0) {
						System.out.println("");
						System.out.println("Error división por 0");
						System.out.println("");
					}
					break;
			case 5: 
				System.out.println("Introduzca el primer número flotante de los 3: "); 
				numero1 = calculadora.nextFloat();
				System.out.println("Introduzca el segundo número flotante de los 3: ");
				numero2= calculadora.nextFloat();
				System.out.println("Introduzca el tercer número flotante de los 3: ");
				numero3= calculadora.nextFloat();
				
				
				
				System.out.println(Operaciones.numeroMayor(numero1, numero2, numero3));
				
				break;
				
				
			case 6: System.out.println("Introduzca un número: ");
					numero1=calculadora.nextFloat();
					
					if(numero1<0) { 
						System.out.println("Error Valor menor que 0, introduzca un número positivo");
						}
					else {
					resultado=Operaciones.numeroFactorial(numero1);
					System.out.println("El resultado es: ");
					System.out.println(resultado);
					}
					break;
			case 0: 
					System.out.println("✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸");
					System.out.println("El programa ha finalizado");
					System.out.println("✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸");
					break;
					default: 
						System.out.println("");
						System.out.println("Opción erronea");
						System.out.println("");	 
			}
		
				}while(operacion != 0 || operacion<0 || operacion > 6 );
		
}

	
	
	}
