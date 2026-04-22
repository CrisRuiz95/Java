import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn = null;
		Statement stm = null; 
		ResultSet res = null; 
		
		String nombre ="";
		float precio = 0.0f;
		int cantidad = 0;
		int id = 0 ;
		int campo = 0 ; 
		
		System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
		System.out.println("★★★★★★★★★GESTOR DE PRODUCTOS★★★★★★★★★");
		System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
		System.out.println("");
		System.out.println("");
		
		Scanner menu =new Scanner(System.in);
		Scanner entradaDatos = new Scanner(System.in);
		int operacion;
		
		do {
			
			System.out.println("Introduzca una opción del menú ");
			System.out.println("1. Crear un producto");
			System.out.println("2. Listar todos los productos");
			System.out.println("3. Modificar un producto");
			System.out.println("4. Borrar un producto");
			System.out.println("0. Salir");
			System.out.println("");
			System.out.println("");

			System.out.println("Introduzca una opción: ");
			operacion=menu.nextInt();
			
			
			
			switch (operacion) {
			case 1: 
				
				
				System.out.println("");
				System.out.println("*****Crear un producto*****"); 
				System.out.println("");
				
				try {
					
					try {
					System.out.println("Introduzca el nombre del producto: ");
					nombre= entradaDatos.next(); 
					
					System.out.println("Introduzca el precio unitario del producto: ");
					precio = entradaDatos.nextFloat();
					
					System.out.println("Introduzca la cantidad del producto: ");
					cantidad = entradaDatos.nextInt();
					
					conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda", "root", "");
					System.out.println("La conexión se ha establecido correctamente");
					System.out.println("");
					stm = (Statement) conn.createStatement();
					
					int correcto = stm.executeUpdate("INSERT INTO productos(`id`, `nombre`, `precio`, `cantidad`) VALUES (NULL,'"+nombre+"','"+precio+"','"+cantidad+"')");
					if(correcto>0) {
						System.out.println("El producto se ha añadido correctamente");
						System.out.println("");
					}
					}catch (InputMismatchException e) {
						System.out.println("Ha introducido un valor erroneo en alguno de los campos");
						System.out.println("");
					}
					
				}catch (SQLException e) {

					System.out.println("Lo sentimos, no se ha podido establecer la conexión");
					System.out.println("");
				}
										
					break;
					
					
			case 2: 
				
				System.out.println("");
				System.out.println("*****Listar todos los productos*****"); 
				System.out.println("");
				
				try {
					conn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda", "root", "");
					System.out.println("La conexión se ha establecido correctamente");
					stm = (Statement) conn.createStatement();
					res = (ResultSet) stm.executeQuery("SELECT * FROM productos");
					res.last();
				
					if (res.getRow() >0) {
						res.first();
						while (!res.isAfterLast()) {
							 System.out.println(res.getInt(1)+ " - "+res.getString(2) + " - "+res.getFloat(3)+"€ - " +res.getInt(4) +" unidades");
							
							 res.next();
						}
					}else {
						System.out.println("La tabla está vacía");
					}
				
					
				} catch (SQLException e) {
					System.out.println("Lo sentimos, no se ha podido establecer la conexión");
				}
				
				
					break;
					
					
			case 3: 
				
				System.out.println("");
				System.out.println("*****Modificar un producto*****"); 
				System.out.println("");
				
				try {
					
				
					conn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda", "root", "");
					System.out.println("La conexión se ha establecido correctamente");
					stm = (Statement) conn.createStatement();
					res = (ResultSet) stm.executeQuery("SELECT * FROM productos");
					res.last();
				
					if (res.getRow() >0) {
						res.first();
						while (!res.isAfterLast()) {
							 System.out.println(res.getInt(1)+ " - "+res.getString(2) + " - "+res.getFloat(3)+"€ - " +res.getInt(4) +" unidades");
							
							 res.next();
						}
					}else {
						System.out.println("La tabla está vacía");
					}
				
			
					
						System.out.println("Introduzca el id del producto: ");
						id=entradaDatos.nextInt();
						
						System.out.println("");
						System.out.println("Introduzca el campo que desea modificar del producto");
						System.out.println("");
						System.out.println("1. Introduzca el nuevo nombre del producto ");
						System.out.println("2. Introduzca el nuevo precio del producto ");
						System.out.println("3. Introduzca la nueva cantidad del producto ");
						System.out.println("Introduzca una opción: ");
						campo = entradaDatos.nextInt();
						entradaDatos.nextLine();
						
						if (campo == 1) {
						System.out.println("1. Introduzca el nuevo nombre del producto: ");
						nombre= entradaDatos.nextLine(); 	
						}
						else if (campo ==2) {
						System.out.println("2. Introduzca el nuevo precio del producto: ");
						precio = entradaDatos.nextFloat();	
						entradaDatos.nextLine();
						}
						else if (campo ==3) {
						System.out.println("3. Introduzca la nueva cantidad del producto: ");
						cantidad = entradaDatos.nextInt();	
						entradaDatos.nextLine();
						}
						
						try {
							
						int actualizacion = stm.executeUpdate ("UPDATE productos SET  `nombre`='"+nombre+"',`precio`='"+precio+"',`cantidad`='"+cantidad+"' WHERE id=" +id);
						
						  if (actualizacion > 0) {
						        System.out.println("El producto se ha actualizado correctamente");
						    } 
							
						}catch (InputMismatchException e) {
							System.out.println("Ha introducido un valor erroneo en alguno de los campos");
							entradaDatos.nextLine();
						} 
						
						
				} catch (SQLException e) {
					System.out.println("Lo sentimos, no se ha podido establecer la conexión");
				}
				
							
				
				break;
					
			case 4: 
				
				try {
					
				
				System.out.println("");
				System.out.println("*****Borrar un producto*****");
				System.out.println("");
				
				conn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda", "root", "");
				System.out.println("La conexión se ha establecido correctamente");
				stm = (Statement) conn.createStatement();
				res = (ResultSet) stm.executeQuery("SELECT * FROM productos");
				res.last();
			
				if (res.getRow() >0) {
					res.first();
					while (!res.isAfterLast()) {
						 System.out.println(res.getInt(1)+ " - "+res.getString(2) + " - "+res.getFloat(3)+"€ - " +res.getInt(4) +" unidades");
						
						 res.next();
					}
				}else {
					System.out.println("La tabla está vacía");
				}
		
				try {
	
				 System.out.println("Introduzca el id del producto que desea eliminar: ");
		            id = entradaDatos.nextInt();

		            int eliminacion = stm.executeUpdate("DELETE FROM productos WHERE id=" + id);
		            if (eliminacion > 0) {
		                System.out.println("El producto se ha eliminado correctamente");
		            } else {
		                System.out.println("No se ha eliminado ningún producto");
		            }
		        } catch (InputMismatchException e) {
		            System.out.println("Ha introducido un valor erróneo en alguno de los campos");   
		        } 
				}catch (SQLException e) {
		            System.out.println("Lo sentimos, no se ha podido establecer la conexión");
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
		
				}while(operacion != 0 || operacion<0 || operacion > 4 );
				
	}

}
