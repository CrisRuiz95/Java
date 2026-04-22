
public class Start {

	public static String crearLinea(String cadena, int cantidad) {
		int i=0;
		String resultado="";
		for(i=0; i<=cantidad; i++) {
			resultado=resultado+cadena;
		}
		return resultado;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crear una cadena con el texto "Hola" 5 veces
		String res="";
		
		res=crearLinea("Hola",5);
		System.out.println(res);
	}

}
