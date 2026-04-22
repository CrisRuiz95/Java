import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import ficheros.GestorFicheros;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entradaDatos = new Scanner (System.in);
		int opcion = -1;
		FileReader fr=null;
		BufferedReader br = null;
		File f = null; 
		String linea="";
		int contadorLineas = 0 ;
		int id= 0 ; 
		boolean encontrado = false;
		String listado = "";
		//ARRAY
		String[]partes;
		// nueva factura
		int miId=0;
		String empresa="";
		String descripcion="";
		int iva = 0 ;
		float total = 0.0f;
		FileWriter fw=null;
		PrintWriter pw=null;
		
				System.out.println("**********Facturación 1.0****************");

		f = new File("almacen.csv");
		
		
		while (opcion != 0) {
			
		System.out.println("Menú del programa");
		System.out.println("1.- Añadir una nueva factura");
		System.out.println("2.- Suma total");
		System.out.println("3.- Copia de seguridad");
		System.out.println("4.- Listar facturas");
		System.out.println("5.- Buscar factura");
		System.out.println("0.- Salir");
		System.out.println("Opción");
		
		System.out.println("Introduzca una opción: ");
		opcion = entradaDatos.nextInt();
		
		if (opcion ==1) {
			System.out.println("Introduce una nueva factura al fichero");
			
			System.out.println("Introduce el ID de la factura");
			miId=entradaDatos.nextInt();
			
			System.out.println("Introduce el nombre de la empresa");
			empresa= entradaDatos.next();
			
			System.out.println("Introduce la descripción");
			descripcion = entradaDatos.next();
			
			System.out.println("introduce el IVA de la empresa");
			iva=entradaDatos.nextInt();
			
			System.out.println("Introduce el total de la empresa");
			total =entradaDatos.nextFloat();
			
			linea=miId+";"+empresa+ ";"+ descripcion +";"+iva+";"+total;
			
			try {
				fw = new FileWriter(f, true);
				pw= new PrintWriter(fw);
				
				pw.println(linea);
				
				pw.close();
				fw.close();
				
				System.out.println("Se ha introducido la factura correctamente");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}else if (opcion ==2) {
			
		}else if (opcion ==3) {
			
		}else if (opcion == 4) {
			// NO SALE
			listado=GestorFicheros.listar("Almacen.csv");
			System.out.println(listado);
		}else if (opcion == 5) {
			System.out.println("Introduce el ID de la factura a buscar: ");
			id = entradaDatos.nextInt();
			
			//Código para buscar:
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
							System.out.println("**********************");
							System.out.println("ID: "+ partes [0]);
							System.out.println("Empresa: "+ partes [1]);
							System.out.println("Descripción : "+ partes [2]);
							System.out.println("IVA: "+ partes [3]);
							System.out.println("Total: "+ partes [4]);
							encontrado = true ;
							break;
							}
						}			
					}	
				}		
				
				if (encontrado == false) {
					System.out.println("Lo siento no se ha encontrado ninguna factura con ese ID");
				}
					br.close();
				fr.close();
				
				} catch (FileNotFoundException e) {
					System.out.println("Error en la lectura");
				} catch (IOException e) {
					System.out.println("No se pudo cerrar el archivo");
				}	
			}else {
				System.out.println("el fichero no existe");
			}
		}else if (opcion == 0) {
			System.out.println("El programa ha finalizado");
		}else {
			System.out.println("*******Opción erronea**********");
		}
	}
	}

}
