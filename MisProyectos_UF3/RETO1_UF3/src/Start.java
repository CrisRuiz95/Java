import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entradaDatos = new Scanner (System.in);
		String ruta="notasPepe.txt";
		FileReader fr= null;
		BufferedReader br=null;
		String lineasFichero="";
		float notas=0.0f;
		float notaMedia=0.0f;
		float suma=0.0f;
		int contador=0;
		
		try {
			File f = new File(ruta);
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			
			while ((lineasFichero =br.readLine())!= null)
			{
				System.out.println(lineasFichero);
				
					notas=Float.parseFloat(lineasFichero.substring(lineasFichero.indexOf(" ")));
					suma+=notas;
					contador++;
					
			}
				notaMedia=suma/contador;
				System.out.println("La nota media es: " +notaMedia);
				fr.close();
				br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
				
			}
		
	}


/*
	if (lineasFichero.length()>7) {
	System.out.println(lineasFichero.substring(7)); 
	}
	else {
	System.out.println(lineasFichero.substring(6)); 	
	}

}
	*/