import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
		System.out.println("★★★★★★★★★EDITOR TEXTUAL★★★★★★★★★");
		System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
		System.out.println("");
		System.out.println("");
		
		//menú
		Scanner menu= new Scanner(System.in);
		int operacion;
		
		//Variables fichero
		Scanner entradaDatos = new Scanner(System.in);
		String rutaFichero="";
		String sobreescribir="";
		String vacio="";
		String borrar="";
		
		//Variables carpeta
		String carpeta="";
		
		
		do {
			
			System.out.println("Introduzca una opción del menú ");
			System.out.println("1. Crear un fichero");
			System.out.println("2. Editar un fichero");
			System.out.println("3. Borrar un fichero");
			System.out.println("4. Crear una carpeta");
			System.out.println("5. Borrar una carpeta");
			System.out.println("0. Salir");
			System.out.println("");
			System.out.println("");

			System.out.println("Introduzca una opción: ");
			operacion=menu.nextInt();
			
			
			
			switch (operacion) {
			case 1: 
				
				
				System.out.println("");
				System.out.println("Introduzca el nombre del nuevo fichero: "); 
				rutaFichero= entradaDatos.next(); 
				File f = new File(rutaFichero);
				
			
					if(f.exists()) {
						
						System.out.println("Fichero existente ¿Desea sobrescribirlo?");
						sobreescribir = entradaDatos.next();

						
						if (sobreescribir.equalsIgnoreCase("Si")){
							
							try {
								
								FileWriter fw = new FileWriter(rutaFichero, false);
								PrintWriter pw = new PrintWriter(rutaFichero);
								pw.println(vacio);
								fw.close();
								pw.close();
								
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} 
						} 

							else if(sobreescribir.equalsIgnoreCase("No")){
								
							}
						
							else {
								
							}
					
					}	
					else {
						
						try {
							
							PrintWriter pw = new PrintWriter(rutaFichero);
							System.out.println("ha sido creado.");
							pw.close();
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	
									
					}
					
				
					break;
			case 2: 
				
				System.out.println("");
				System.out.println("Introduzca el nombre del fichero a editar: "); 
				rutaFichero= entradaDatos.next(); 
				File f2 = new File(rutaFichero);
				
				if(f2.exists()) {
					System.out.println("Introduzca el texto que desea añadir al fichero");
					entradaDatos.nextLine(); 
					sobreescribir= entradaDatos.nextLine();
					
					try {
						FileWriter fw = new FileWriter(rutaFichero, true);
						PrintWriter pw = new PrintWriter(rutaFichero);
						pw.println(sobreescribir);
						fw.close();
						pw.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				}	
				else {
					System.out.println("El fichero no existe");				
			}
					
					break;
			case 3: 
				
				System.out.println("");
				System.out.println("Introduzca el nombre del fichero a borrar: "); 
				rutaFichero= entradaDatos.next(); 
				File f3 = new File(rutaFichero);
				
				
				if(f3.exists()) {
					System.out.println("¿Está seguro de que desea borrarlo?");
					borrar= entradaDatos.next();
					
					if (borrar.equalsIgnoreCase("Si")){
						
						f3.delete(); 
					} 

						else {
							System.out.println("El archivo no se borró del sistema");
						}
					
				
				}	
				else {
					System.out.println("El fichero no existe");
				
				
			}
					
					break;
			case 4: 
				
				
				System.out.println("");
				System.out.println("Introduzca el nombre de la carpeta a crear: "); 
				carpeta= entradaDatos.next(); 
				File crearCarpeta = new File(carpeta);
				
				if(crearCarpeta.exists()) {
					System.out.println("Carpeta ya existente");
				}
				else {
					System.out.println("La carpeta se creó correctamente");
					crearCarpeta.mkdirs();
				}
					
					break;
			case 5: 
				
				System.out.println("");
				System.out.println("Introduzca el nombre de la carpeta a borrar: "); 
				carpeta= entradaDatos.next(); 
				File borrarCarpeta = new File(carpeta);
				
				if(borrarCarpeta.exists()) {
					
					System.out.println("¿Está seguro de querer borrar la carpeta?");
					borrar= entradaDatos.next();
					
					if (borrar.equalsIgnoreCase("Si")){
						
						borrarCarpeta.delete();
						System.out.println("Carpeta borrada correctamente"); 
					} 

						else if(borrar.equalsIgnoreCase("No")){
							System.out.println("La carpeta no se borró del sistema");
							
						}
					
						else {
							
						}
				}
				else {
					System.out.println("La carpeta no existe");
					
				}
				
					break;
				
				
			case 0: 
					System.out.println("✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸");
					System.out.println("El programa ha finalizado");
					System.out.println("✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸✸");
					break;
					default: 
						System.out.println("");
						System.out.println("Opción erronea");
						System.out.println("");	 
			}
		
				}while(operacion != 0 || operacion<0 || operacion > 5 );
		}
	
	
		}
			