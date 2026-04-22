import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entradaDatos= new Scanner(System.in);
		
		String mes="";
		
		System.out.println("Introduce tu mes");
		mes=entradaDatos.next();
		
		if(mes.equalsIgnoreCase("Enero")){
			System.out.println("Aries");
		}
		else if(mes.equalsIgnoreCase("Febrero")) {
			System.out.println("Tauro");
		}
		else if(mes.equalsIgnoreCase("Marzo")) {
			System.out.println("Virgo");
		}
		else {
			System.out.println("Error de mes");
		}
	}

}
