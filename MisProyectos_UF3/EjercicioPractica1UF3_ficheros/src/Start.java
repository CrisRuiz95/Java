import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre="";
		String apellidos="";
		Scanner entradaDatos= new Scanner (System.in);
		
		
		System.out.println("Introduce tu nombre: ");
		nombre= entradaDatos.next();
		
		System.out.println("Introduce tus apellidos: ");
		entradaDatos.nextLine(); //Recoge el fin de la primera petición anterior 
		apellidos= entradaDatos.nextLine(); //El nextLine coge toda la información hasta los espacios en blanco.
		
		File f= new File("infousuario.txt");
		
		try {
			FileWriter fw = new FileWriter(f);
			PrintWriter pw = new PrintWriter(fw);
			pw.println(nombre);
			pw.println(apellidos);
			
			pw.close();
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("El fichero no puede escribirse");
		}	
		
	}

}
