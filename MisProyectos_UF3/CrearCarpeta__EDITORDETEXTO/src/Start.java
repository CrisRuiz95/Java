import java.io.File;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entradaDatos = new Scanner (System.in);
		String carpeta="";
		
		System.out.println("");
		System.out.println("Introduzca el nombre de la carpeta a crear: "); 
		carpeta= entradaDatos.next(); 
		File crearCarpeta = new File(carpeta);
		
		if(crearCarpeta.exists()) {
			System.out.println("Carpeta ya existente");
		}
		else {
			System.out.println("La carpeta se creó correctamente");
			crearCarpeta.mkdirs();
		}
	}

}
