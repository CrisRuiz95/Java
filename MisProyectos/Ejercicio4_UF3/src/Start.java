import java.io.File;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fichero = "";
		
		
		
		Scanner entradaDatos = new Scanner (System.in);
		
		System.out.println("Introduce el nombre del fichero que quieres crear: ");
		fichero = entradaDatos.next();
		
		File f = new File (fichero);
		
		if (!f.exists()) {
			if(f.mkdir()) {
				System.out.println("El fichero se ha creado correctamente");
			}
		}else {
			System.out.println("El fichero ya existe");
		}
	}

}
