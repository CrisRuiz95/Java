import java.util.ArrayList;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> nombresD = new ArrayList <String>();
		System.out.println("El tamaño es: " +nombresD.size());
	
		nombresD.add("Jessica");
		nombresD.add("José");
		
		System.out.println("El tamaño es: " +nombresD.size());
		
		nombresD.set(1, "Rosario");
		nombresD.add("Victor");
		
		nombresD.remove(0);
		
		System.out.println("El tamaño es: " + nombresD.size());
	
	for (int i = 0; i < nombresD.size(); i++) {
		System.out.println(i+ ")" +nombresD.get(i));
	}
	//Otra manera de recorrer arrays
	for (String nom: nombresD) {
		System.out.println(nom);
	}

}

}
