import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String linea ="";
		String ruta ="";
		Scanner entradaDatos = new Scanner (System.in);
		
		System.out.println("Introduce la ruta del fichero: ");
		ruta= entradaDatos.next();
		
		File f = new File (ruta);
		
		
		
		if(f.exists()) {
			System.out.println("El fichero existe");
			
			try {
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
				
				while (linea!=null) {
					linea = br.readLine();
					if (linea!=null) {
					System.out.println(linea);
					}
				
				}
				
				br.close();
				fr.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("El fichero no pudo ser leido");
			}
			
		}else {
			System.out.println("Error fichero inexistente ");
			
		}
		
		
	}

}
