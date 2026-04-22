import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entradaDatos= new Scanner(System.in);
		
		int numero=0;
		int numeroSecreto=5;
		
		while (numero!=numeroSecreto) {
			System.out.println("Introduzca su número: ");
			numero=entradaDatos.nextInt();
			if (numero!=numeroSecreto) {
				System.out.println("inténtelo de nuevo");
			}
		}
		System.out.println("¡¡Has ganado!!");

	}

}
