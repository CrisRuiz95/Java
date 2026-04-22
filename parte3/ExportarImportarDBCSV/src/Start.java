import basededatos.GestorBD;
import ficheros.GestorFicheros;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String resultados ="";
		GestorBD gbd= new GestorBD();
		GestorFicheros gf = new GestorFicheros();
		String res="";
		
		if (gbd.conectar()) {
			System.out.println("Conexión establecida correctamente");
			resultados = gbd.leer();
			System.out.println(resultados);
			res=gf.escribirFichero("exportacion.csv", resultados);
			
			
			res=gf.leerFichero("importacion.csv");
			res= gbd.insertar(res);
			System.out.println(res);
			
		}
		else {
			System.out.println("No se ha podido establecer la conexión con la base de datos");
		}
	}

}
