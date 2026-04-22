package ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GestorFicheros {

	public static String listar(String fichero) {
		
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
						
						if (id== Integer.parseInt(partes[0])){
							
						
						//Te saca las partes del excel: System.out.println(partes[4]);
						cadenaSalida +="**********************";
						cadenaSalida +="ID: "+ partes [0]+"\n";
						cadenaSalida +="Empresa: "+ partes [1] +"\n";
						cadenaSalida +="Descripción : "+ partes [2] +"\n";
						cadenaSalida +="IVA: "+ partes [3] +"\n";
						cadenaSalida +="Total: "+ partes [4] +"\n";
						encontrado = true ;
						break;
						}
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
				return "No se pudo cerrar el archivo";
			}	
		}else {
			return "Error el fichero no existe";
		
		}
			return cadenaSalida="";
	}

}
