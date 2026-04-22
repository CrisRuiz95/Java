import java.util.Scanner;

public class Start {

	public static int contarVocales (String cadena) {
		
		//String cad="";
		
		int numVocales=0;
		
		//cad = cadena.toLowerCase();
		
		for ( int i = 0; i < cadena.length(); i++) {
			
			
			
			if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'A') {
				
				numVocales ++ ;
				
			} else if( cadena.charAt(i) == 'e' || cadena.charAt(i) == 'E') {
				numVocales ++;
			} else if( cadena.charAt(i) == 'i' || cadena.charAt(i) == 'I') {
			numVocales ++;
			} else if( cadena.charAt(i) == 'o' || cadena.charAt(i) == 'O' ) {
				numVocales ++;
			}else if( cadena.charAt(i) == 'u' || cadena.charAt(i) == 'U' ) {
			numVocales ++;
		}
		}
	
		return numVocales;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nVocales=0;
		
		nVocales = contarVocales("Hola caracola");
		System.out.println(nVocales);
		
	}

}
