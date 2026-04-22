import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entradaDatos=new Scanner (System.in);
		
		String nombre="";
		int cantidad = 0 ;
		int i=0;
		String opcion="alumnos.txt";
		String ruta="alumnos.txt";
		File f=null; /* Para cuando no sabes para que lo vas a utilizar */
		FileWriter fw=null; /* Abir fichero en modo escritura*/
		PrintWriter pw=null; //Una vez abierto lo vamos a rescribir
		
		//saber si existe o no
		f = new File(ruta);
		// CRear un fichero y abrirlo en modo escritura
		try {
			
			System.out.println("Desea machacar el contenido?");
			opcion =entradaDatos.next();
			
			if (opcion.equalsIgnoreCase("y")) {
				//Intento abrir el fichero en modo escritura
			fw = new FileWriter(f);
			}
			else {
			fw = new FileWriter(f, true);
			}
			
			pw= new PrintWriter(fw);
			
			
			System.out.println("Introduce la cantidad de alumnos: ");
			cantidad=entradaDatos.nextInt();
			
			System.out.println("Has definido el número como: "+cantidad);
		
		for (i=0; i<cantidad; i++) {
			System.out.println("Introduce el nombre del alumno");
			nombre =entradaDatos.next();
			System.out.println("El nombre es: " +nombre);
			//Escribiría en el fichero
			pw.println(nombre);
		}
		
		pw.close();
		fw.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//System.out.println("Error al abrir el fichero");
			e.printStackTrace();
		}
		
		
		/*if (f.exist()) {
			System.out.println("El fichero existe");
		}
		else  {
			System.out.println("El fichero no existe");
		}
		*/
		
				
		
	}

}
