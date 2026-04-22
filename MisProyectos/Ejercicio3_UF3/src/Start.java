import java.io.File;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ruta="";
		String confirmacion="";
		
		Scanner entradaDatos = new Scanner (System.in);
		
		System.out.println("Introduzca la ruta del fichero: ");
		ruta= entradaDatos.next();
		
		File f = new File (ruta);
		
		if(f.exists()) {
			System.out.println("Desea eliminar el fichero? S/N");
			confirmacion=entradaDatos.next();
			if (confirmacion.toUpperCase().equals("S")) {
				
			
			if(f.delete()) {
				System.out.println("El fichero se ha eliminado correctamente");
			} else {
				System.out.println("El fichero no se ha eliminado");
			}
			}
		}else {
			System.out.println("Error el fichero no existe");
		}
		
	}

}
