import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entradaDatos = new Scanner(System.in);
		String rutaFichero="";
		String sobreescribir="";
		String opcion="SI";
		String vacio="";
		
		
		
		System.out.println("");
		System.out.println("Introduzca el nombre del nuevo fichero: "); 
		rutaFichero= entradaDatos.next(); 
		File f = new File(rutaFichero);
		
		//Creamos nuestro archivo en el caso de que no exista
			if(f.exists()) {
				
				System.out.println("Fichero existente ¿Desea sobrescribirlo?");
				sobreescribir = entradaDatos.next();

				
				if (opcion.equalsIgnoreCase("Si")){
					
					try {
						
						FileWriter fw = new FileWriter(rutaFichero, false);
						PrintWriter pw = new PrintWriter(rutaFichero);
						pw.println(vacio);
						fw.close();
						pw.close();
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
				} 

					else if(opcion.equalsIgnoreCase("No")){
						
					}
				
					else {
						
					}
			
			}	
			else {
				
				try {
					
					PrintWriter pw = new PrintWriter(rutaFichero);
					System.out.println("ha sido creado.");
					pw.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
							
			}
			
	}
	}

