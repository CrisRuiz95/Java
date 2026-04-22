import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn=null;
		Statement stm= null;
		ResultSet res = null; 
		
		//Establecemos la conexión 
		
		try {
			conn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda", "root", "");
			System.out.println("Conexión correcta");
			
			stm = (Statement) conn.createStatement();
			
			res = (ResultSet) stm.executeQuery("SELECT * FROM usuarios Where edad>20");
			res.last();
			
			System.out.println("Te devuelvo " +res.getRow()+ " alumnos");
			if (res.getRow() >0) {
				res.first();
				while (!res.isAfterLast()) {
					//las columnas empiezan por 1 en vez de por 0 
					System.out.println(res.getString(1)+ " - "+res.getString(2) + " - "+res.getString(3)+" - " +res.getString(4) + " - " +res.getString(5));
					
					res.next();
				}
			}else {
				System.out.println("No hay ningún alumno");
			}
			
			res.close();
			stm.close();
			conn.close();
			
		} catch (SQLException e) {
			System.out.println("No se ha podido realizar la conexión");
	
		}
	}

}
