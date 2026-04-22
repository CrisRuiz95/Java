import java.util.Scanner;

public class Start {

	
	public static boolean esPrimo(int num) {
		int i=0;

		
		if (num <=1)
			return false;
		else {
			for (i=2; i<=num; i++) {
			if (num %i == 0) {
				break;
			}
					
			}
		} return i >= num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
		System.out.println("★★★Números Primos★★★");
		System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
		System.out.println("");
		
		int numero=0;
		
		Scanner entradaDatos= new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		numero=entradaDatos.nextInt();
		
		if(esPrimo(numero)) {
			System.out.println("El número: "+numero + " es primo");
		}
		else {
			System.out.println("El numero: "+numero + " NO es primo");
		}
		
	}

}




/* import java.util.Scanner;

public class Start {
 
	public static boolean esPrimo(int numero) {
 
		if (numero<=1) 
			return false;
		else if (numero==2)
			return true;
		else {
			for (int i=2; i<numero; i++)
				if (numero%i==0) {
					return false;
				}return true;
		}
 
	}
 
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner entradaDatos= new Scanner(System.in);
 
 
		System.out.println("******Números primos******");
		System.out.println("**************************");
		System.out.println("");
		System.out.println("Introduzca un número:");
		int numero=entradaDatos.nextInt();
 
		if (esPrimo(numero)) {
			System.out.println("El número SI es primo.");
		}
		else {
			System.out.println("El número NO es primo.");
		}
	}
 
}
*/

