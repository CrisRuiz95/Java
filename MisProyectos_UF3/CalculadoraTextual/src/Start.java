import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner calculadora=new Scanner(System.in);
		System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
		System.out.println("★★★Calculadora de Calculator S.A★★★");
		System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
		System.out.println("");
		System.out.println("");
		
		//Calculadora básica:
		int operacion;
		float numero1=0.0f;
		float numero2=0.0f;
		float numero3=0.0f;
		float resultado=0.0f;		
		
		//Capicúa:
		Scanner capicua= new Scanner(System.in);
		int numero;
		int numeroinvertido;
		String num, numinvert="";
		
		
		do {
			
			System.out.println("Introduzca una opción del menú ");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Número mayor de 3 números");
			System.out.println("6. Capicúa");
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
					resultado=numero1+numero2;
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
					resultado=numero1-numero2;
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
					resultado=numero1*numero2;
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
					resultado=numero1/numero2;
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
					if (numero1>numero2 && numero1>numero3) {
						System.out.println("✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸"); 
						System.out.println("El primer número es el mayor de los tres");
						System.out.println("✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸"); 
					}
					else if (numero2>numero1 && numero2>numero3) {
						System.out.println("✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸"); 
						System.out.println("El segundo número es el mayor de los tres");
						System.out.println("✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸"); 
					}
					else {
						System.out.println("✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸"); 
						System.out.println("El tercer número es el mayor de los tres");
						System.out.println("✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸"); 
					}
					break;
				
				
			case 6: System.out.println("Introduzca un número para saber si es capicúa");
					numero=capicua.nextInt();
					num=numero+"";
					
					for (int i=0; i<num.length(); i++) {
						numinvert=num.charAt(i)+numinvert;
						
					}
					numeroinvertido=Integer.parseInt(numinvert);
					if( numero==numeroinvertido ) {
						System.out.println("");
						System.out.println("✸✸✸✸✸✸✸✸✸✸");
						System.out.println("SI es capicúa");
						System.out.println("✸✸✸✸✸✸✸✸✸✸");
						System.out.println("");
					}
					else {
						System.out.println("");
						System.out.println("✸✸✸✸✸✸✸✸✸✸");
						System.out.println("NO es capicúa");
						System.out.println("✸✸✸✸✸✸✸✸✸✸");
						System.out.println("");
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