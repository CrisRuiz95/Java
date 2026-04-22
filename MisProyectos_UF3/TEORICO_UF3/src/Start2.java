import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Start2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Creamos el fichero	
	String ruta2="pruebas.txt"; 
	File f=null;
		
	//Lo mismo que en el anterior punto del ejercicio
		f = new File(ruta2);
		FileWriter fw=null; 
		PrintWriter pw=null;
		
		
		
		try {
			//Abrir el fichero en modo escritura con el true para que no machaque el archivo, sino que lo escriba
			fw = new FileWriter (f, true);
			pw= new PrintWriter (fw);
			//Texto añadido en el fichero
			pw.println("Linea Nueva");
			
			//Cerramos fichero
			fw.close();
			pw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
