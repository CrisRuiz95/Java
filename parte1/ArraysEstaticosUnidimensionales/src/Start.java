

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] alumnos1 = {"Jessica", "Ana", "Victor"};
		System.out.println("El tamaño de alumnos 1 es: " +alumnos1.length);
		//Bucle para ver los valores del array 
				int i = 0;
				for (i=0; i < alumnos1.length; i++) {
					System.out.println("La posición " + i + " es " + alumnos1[i]);

				}
			
		
		String[] alumnos2 = new String [12];
		System.out.println("El tamaño de alumnos 2 es: "+ alumnos2.length);
		alumnos2 [0] = "Rosario";
		alumnos2 [2] = "Sesé";
	
		System.out.println("En la posición cero de alumnos 2 hay " + alumnos2[0]);
		System.out.println("En la posición dos de alumnos 2 hay: " +alumnos2[2]);
		
		//Antes de dar los valores iniciales (para añadir valores en todas posiciones):
				for (i=0; i < alumnos2.length; i++) {
					alumnos2[i]="-";
				}
				alumnos2 [0] = "Rosario";
				alumnos2 [2] = "Sesé";
				for (i=0; i < alumnos2.length; i++) {
					System.out.println("La posición " + i + " es " + alumnos2[i]);

				}
			
		
	
	
	}

}
