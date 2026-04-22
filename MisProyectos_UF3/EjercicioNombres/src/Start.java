import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entradaDatos= new Scanner(System.in);
		
		String palabra="";
		String palabraAlReves="";
		int i=0;
		
		System.out.println("Introduce una palabra");
		palabra= entradaDatos.next();
		
		System.out.println("Has introducido" +palabra);
		
		for(i=palabra.length()-1; i>=0; i--) {
			palabraAlReves= palabra.charAt(i) + palabraAlReves;
			System.out.print(palabra.charAt(i)+ " - ");
		}
			
		
	}

}
