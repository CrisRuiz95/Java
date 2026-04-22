package cadenasdecaracteres;

public class FuncionesCadenaDeCaracteres {

	public static int numeroDeVocales(String cad) {
		
		int i=0;
		int contadorVocales=0;
		cad= cad.toLowerCase();
		
		for(i=0; i<cad.length(); i++) {
			if (cad.charAt(i)=='a') {
				contadorVocales=contadorVocales+1;
			}
			else if (cad.charAt(i)=='e') {
				contadorVocales=contadorVocales+1;
		}
			else if (cad.charAt(i)=='i') {
				contadorVocales=contadorVocales+1;
			}
			else if (cad.charAt(i)=='o') {
				contadorVocales=contadorVocales+1;
			}
			else if (cad.charAt(i)=='u') {
				contadorVocales=contadorVocales+1;
			}
	}
		System.out.println("Numero de vocales "+ contadorVocales);
		return contadorVocales;
}
	public static String eliminarEspaciosEnBlanco(String cad) {
		
		int i=0;
		String cadenaSinEspacios="";
		
		
		for(i=0; i<cad.length(); i++) {
			if(cad.charAt(i)!=' ') {
				
				cadenaSinEspacios=cadenaSinEspacios + cad.charAt(i);
			}
		}
		
		return cadenaSinEspacios;
}
}