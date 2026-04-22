import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entradaDatos=new Scanner (System.in);
		
		String ruta="datos.txt"; //Damos la ruta y la creación de nuestro fichero
		String dato="datos.txt";
		File f=null; // Para no especificar el uso del fichero
		FileWriter fw=null; //Abrir el fichero en modo escritura
		PrintWriter pw=null; //Para poder reescribir el fichero
		
		f = new File(ruta); //Para saber si existe el fichero
		
		try {
		pw= new PrintWriter(f); //Para poder escribir en nuestro fichero
					
					//Lineas escritas en el fichero a modo de ejemplo:
					pw.println("Vamos");
					pw.println("a");
					pw.println("Machacar");
					pw.println("el");
					pw.println("Fichero");
					
						
					
					//Abrimos el fichero en modo escritura
					fw = new FileWriter(f, false); //Con esta opción sirve para machacar el fichero
					pw= new PrintWriter(fw);
					
					//Ahora vamos a machacar el fichero con nuestro texto original, reescribiendolo.
					System.out.println("Introduce cualquier tipo de dato para machacar el archivo");
					dato=entradaDatos.next();
					pw.write(dato);
					
					
					//Cerramos el fichero
					fw.close();
					pw.close();
					
					
					
				
				} catch (IOException e) {
					e.printStackTrace();
					
				}
	}

}
