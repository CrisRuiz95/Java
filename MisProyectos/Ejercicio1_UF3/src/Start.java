import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre ="";
		String apellido = "";

		
		Scanner entradaDatos = new Scanner (System.in);
		
		System.out.println("Introduce tu nombre: ");
		nombre = entradaDatos.next();
		
		System.out.println("Introduce tu apellido: ");
		apellido = entradaDatos.next();
		
		File f = new File ("infousuario.txt");
		FileWriter fw;
		try {
			fw = new FileWriter(f);
			PrintWriter pw = new PrintWriter(fw);
			pw.println(nombre);
			pw.println(apellido);
			
			pw.close();
			fw.close();
			
		} catch (IOException e) {

			System.out.println("No se ha podido escribir en el fichero");
		}
		
		
	}

}
