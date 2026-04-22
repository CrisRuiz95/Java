import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		Scanner entradaDatos = new Scanner(System.in);
		String rutaFichero="";
		String sobreescribir="";
		
		
		
		System.out.println("");
		System.out.println("Introduzca el nombre del fichero a editar: "); 
		rutaFichero= entradaDatos.next(); 
		File f = new File(rutaFichero);
		
		if(f.exists()) {
			System.out.println("Introduzca el texto que desea añadir al fichero");
			entradaDatos.nextLine(); 
			sobreescribir= entradaDatos.nextLine();
			
			try {
				FileWriter fw = new FileWriter(rutaFichero, true);
				PrintWriter pw = new PrintWriter(rutaFichero);
				pw.println(sobreescribir);
				fw.close();
				pw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}	
		else {
			System.out.println("El fichero no existe");
		
		
	}

}
}
	