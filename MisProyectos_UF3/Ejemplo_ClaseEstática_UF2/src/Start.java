
import java.util.Scanner;

import cadenasdecaracteres.FuncionesCadenaDeCaracteres;
import clasesDiferentes.Operaciones;




 public class Start {

	/* public static int productorio(int n) {
		
		int res=1;
		int i=0;
		
		for (i=n; i>=1; i--) {
			res=res*i;
		}
		return res;
	} */
	 
	 public static int productorio(int n) {
		 if (n==0) return -1;
		 if( n==1) {
			 return 1;
		 }
		 return n * productorio(n-1);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entradaDatos= new Scanner(System.in);
		String saludo="";
		String nombre="";
		int cantidad=0;
		String cadenaSinEspacios="";
		
		int numero=0;
		int res=0;
		
		/** Factorial **/
		System.out.println("Introduzcaun número para hacer el productorio: ");
		numero=entradaDatos.nextInt();
		
		res=productorio(numero);
		System.out.println("El resultado es: "+res);
		
		
		int num1=5;
		int num2=6;
		int resultado=0;
		
		resultado= Operaciones.sumaPositivos(num1, num2);
		if (resultado==-1) {
			System.out.println("Error has introducido números negativos");
		}
		else   {
			System.out.println("El resutlado es" +resultado);
		}
		
		
		System.out.println("El resultado es: "+resultado);
		
		System.out.println("Introduzca su nombre:");
		nombre=entradaDatos.nextLine();
		
		cadenaSinEspacios=FuncionesCadenaDeCaracteres.eliminarEspaciosEnBlanco(nombre);
		System.out.println("La cadena sin espacios es: " +cadenaSinEspacios);
		
		cantidad=FuncionesCadenaDeCaracteres.numeroDeVocales(nombre);
		System.out.println("El número de vocales"+ cantidad);
		
		
		
		

		saludo= Operaciones.saludar(nombre);
		
		
		
		System.out.println(saludo);
		
		System.out.println(Operaciones.suma(5,4));
		
		// o también se puede System.out.println(saludar());
	}

}
