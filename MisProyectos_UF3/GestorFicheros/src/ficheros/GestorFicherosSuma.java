package ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GestorFicherosSuma {
	FileReader fr=null;
	BufferedReader br = null;
	File f = null; 
	f = new File (fichero);
	String linea="";
	int contadorLineas = 0 ;
	int id= 0 ; 
	boolean encontrado = false;
	String[]partes;
	String cadenaSalida="";
	float sumatorio = 0.0f;
	
	if (f.exists()) {
		try {
			fr = new FileReader(f);	
			br = new BufferedReader (fr);
			//Leo el fichero linea a linea
			
			encontrado = false;
		while (linea !=null) {
			linea = br.readLine();
			if (linea != null) {
				
				contadorLineas= contadorLineas+1;
				if(contadorLineas >1) {
					
					//System.out.println(linea);
					partes = linea.split(";");
					sumatorio = sumatorio + Float.parseFloat(partes [4]);
				
					}
				}			
			}	
				
		
		if (encontrado == false) {
			return "Lo siento no se ha encontrado ninguna factura con ese ID";
		}
			br.close();
			fr.close();
		
		} catch (FileNotFoundException e) {
			return "Error en la lectura";
		} catch (IOException e) {
			return -2.0f;
		}	
	}else {
		return -3.0f;
	
	}
		return 0;
}

}

