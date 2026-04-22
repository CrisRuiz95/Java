import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entradaDatos=new Scanner (System.in);
		int numeroCaracteres=0;
		int numeroLineas=0;
		String ruta="alumnos.txt";
		String linea="";
		String lineasTotales="";
		File f=null;
		FileReader fr=null;
		BufferedReader br=null;
		
		System.out.println("Indica la ruta del fichero: ");
	
		ruta = entradaDatos.next();
		
		f = new File(ruta);
		
		if(f.exists()) {
			//Puedo leer el fichero
			try {
				//Intento abrir el fichero en modo lectura
				fr= new FileReader(f);
				br = new BufferedReader(fr);
				
				while(linea!=null)
				{
					linea =br.readLine();
					if (linea!=null) {
						lineasTotales=lineasTotales + "\n"+ linea;
						numeroCaracteres= numeroCaracteres + linea.length();
						numeroLineas=numeroLineas+1;
					
					}				
				}
				
				System.out.println("El número de lineas es: "+ numeroLineas);
				System.out.println("El número de caracteres es: " +numeroCaracteres);
				System.out.println(lineasTotales);
				/*linea =br.readLine();
				System.out.println(linea);*/
				
				br.close();
				fr.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		} else {
			System.out.println("Lo siento, el fichero no existe");
		}
		
		
		/* */
	}

}
