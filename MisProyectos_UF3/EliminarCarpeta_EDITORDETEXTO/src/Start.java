import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entradaDatos = new Scanner (System.in);
		String carpeta="";
		String borrar="";
		
		System.out.println("");
		System.out.println("Introduzca el nombre de la carpeta a borrar: "); 
		carpeta= entradaDatos.next(); 
		File borrarCarpeta = new File(carpeta);
		
		if(borrarCarpeta.exists()) {
			
			System.out.println("¿Está seguro de querer borrar la carpeta?");
			borrar= entradaDatos.next();
			
			if (borrar.equalsIgnoreCase("Si")){
				
				borrarCarpeta.delete();
				System.out.println("Carpeta borrada correctamente"); 
			} 

				else if(borrar.equalsIgnoreCase("No")){
					System.out.println("La carpeta no se borró del sistema");
					
				}
			
				else {
					
				}
		}
		else {
			System.out.println("La carpeta no existe");
			
		}
	}

}
