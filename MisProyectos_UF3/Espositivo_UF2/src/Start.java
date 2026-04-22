import java.util.Scanner;

public class Start {

		public static boolean esPositivo(int num)
		{
			boolean resultado=true;
			if (num>=0) {
				resultado=true;
			}
			else {
				resultado=false;
			}
			return resultado;
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		boolean res=true;
		int numero=0;
		Scanner entradaDatos = new Scanner(System.in);
				
		System.out.println("Introduce un número para saber si es positivo");
		numero=entradaDatos.nextInt();
		System.out.println("El número introducido es:" +numero);
		res=esPositivo(numero);
		
		if (res==true) {
			System.out.println("Es positivo");
		}
		else {
			System.out.println("NO es positivo");
		}
		
	}

}
