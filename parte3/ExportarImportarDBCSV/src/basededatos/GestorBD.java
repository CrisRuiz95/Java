package basededatos;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class GestorBD {
	protected Connection conn;
	protected Statement stm;
	protected ResultSet res;
	
	public GestorBD() {
		this.conn=null;
		this.stm=null;
		this.res=null;
	}
	
	public boolean conectar() {
		
		try {
			conn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda", "root","");
			return true;
		} catch (SQLException e) {
			return false;
		}
		} 
	public String leer() {
		
		String salida="";
		if (conn!=null) {
			try {
				this.stm =(Statement) this.conn.createStatement();
				this.res=(ResultSet) this.stm.executeQuery("SELECT * FROM usuarios");
				this.res.last();
				if (this.res.getRow()>0) {
					this.res.first();
					salida="id;nombre;apellidos;edad;activo"+"\n";
					System.out.println("Número de columnas: "+this.res.getMetaData().getColumnCount());
					while (!this.res.isAfterLast()) {
						
						salida= salida+this.res.getString(1)+";"+this.res.getString(2)+";"+this.res.getString(3)+";"+this.res.getString(4)+";"+this.res.getString(5)+"\n";
			
						this.res.next();
					}
				}
				
				this.stm.close();
				this.res.close();
				
			} catch (SQLException e) {
				return "";
			}
		}return salida;
		}
	
	public boolean cerrar() {
		if(this.conn!=null) {
			try {
				this.conn.close();
				return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} return true;
	}
	public String insertar (String tl) {
		String salida = "";
		int i = 0 ;
		System.out.println(tl);
		String[] lineas=tl.split("\n");
		String consulta ="";
		try {
			this.stm = (Statement) this.conn.createStatement();
			
			for (i = 0 ; i < lineas.length; i++) {
				String[] partes = lineas[i].split(";");
				//System.out.println(partes[0] + "---" +partes[1]+ "---" +partes[2]+ "---" +partes[3] + "---" +partes[4]);
				consulta ="INSERT INTO usuarios (id, nombre, apellidos, edad, activo) VALUES (NULL,'" +partes[1] + "','"+partes[2]+"','"+partes[3]+"','"+partes[4]+"')";  
				
				if (stm.executeUpdate(consulta)<=0) {
					salida ="Error no se han podido insertar los datos en la base de datos";
				}
				
				//System.out.println(consulta);
			}
			if(salida.equals("")) {
				salida = "Se ha importado la información correctamente";
			}
		} catch (SQLException e) {
			salida= "No se ha podido lanzar la consulta a la base de datos";
		}
		
		
		System.out.println(lineas.length);
		return salida;
	}

	}
	

