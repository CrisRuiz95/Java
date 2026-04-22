
public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int contador=0;
		int[][] numerosTabla = new int [10][10];
		
		//Doy valor inicial a cada una de las posiciones
		//Recoroo la primera dimensión (filas)
		for (int i = 0 ; i < numerosTabla.length; i++) {
		//Recorro la segunda dimensión (columnas)
			for ( int j = 0; j < numerosTabla.length; j++) {
				contador = contador +1;
				numerosTabla[i][j] = contador;
			}
		}
		
		//Muestro en la consola cada posición
		for (int i = 0 ; i < numerosTabla.length; i++) {
			//Recorro la segunda dimensión (columnas)
				for ( int j = 0; j < numerosTabla.length; j++) {
					System.out.print(numerosTabla[i][j] + " -- ");
				}
				
				System.out.println("");
			}
		
		System.out.println("----" +numerosTabla [2][3]);
	}

}
