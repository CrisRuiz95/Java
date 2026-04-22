import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Start3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Establecemos las variables y los procesos que vamos a realizar
		String ruta3="libro.txt";
		File f=null;
		f = new File(ruta3);
		FileReader fr=null;
		BufferedReader br=null; //Este parámetro lee linea por linea el fichero
		String lineaFichero=""; //Nos dará las lineas del fichero
		
		try {
			System.out.println("El fichero existe"); //Si el fichero existe tomará esta ruta y saldrá en la consola el mensaje
			fr = new FileReader(f);
			br= new BufferedReader(fr);
			
			try {
				while ((lineaFichero =br.readLine())!= null) //El valor es null y se para cuando no hay más líneas que leer, es decir, acaba de leerse el fichero
				{
					System.out.println(lineaFichero);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("El fichero no existe"); //En cambio si el fichero no existe tomara está otra ruta y aparecerá ese mensaje
			e.printStackTrace();
		}
		
		try {
			fr.close(); // Cerramos nuestro fichero en modo lectura
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
