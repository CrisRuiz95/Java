import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner hora= new Scanner(System.in);
		
		int horas;
		int minutos;
		int segundos;
		
		
		System.out.println("Introduzca la hora: ");
		horas=hora.nextInt();
		System.out.println("Introduzca los minutos: ");
		minutos=hora.nextInt();
		System.out.println("Introduzca los segundos: ");
		segundos=hora.nextInt();
		
		
		if((horas>=0 && horas<=23) && (minutos>=0 && minutos<=59) && (segundos>=0 && segundos<=59)) {
			System.out.println("La hora es correcta");
		}
		else {
			System.out.println("La hora NO es correcta");
		}
			
		
	}

}
