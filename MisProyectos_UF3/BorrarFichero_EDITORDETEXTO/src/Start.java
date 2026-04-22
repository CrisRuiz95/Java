import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entradaDatos = new Scanner(System.in);
		String rutaFichero="";
		String borrar="";
		
		System.out.println("");
		System.out.println("Introduzca el nombre del fichero a borrar: "); 
		rutaFichero= entradaDatos.next(); 
		File f = new File(rutaFichero);
		
		
		if(f.exists()) {
			System.out.println("¿Está seguro de que desea borrarlo?");
			borrar= entradaDatos.next();
			
			if (borrar.equalsIgnoreCase("Si")){
				
				f.delete(); 
			} 

				else {
					System.out.println("El archivo no se borró del sistema");
				}
			
		
		}	
		else {
			System.out.println("El fichero no existe");
		
		
	}
		
	}

}
