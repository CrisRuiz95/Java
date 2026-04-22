import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 Scanner entradaDatos = new Scanner (System.in);
	 String nombre ="";
	 int num=0;
	 float nota = 0.0f;
	 float media= 0.0f;
	 
	 System.out.println("Introduce el número de alumnos a escribir: ");
	 num = entradaDatos.nextInt();
	 
	 String[] nombres = new String [num];
	 float[] notas = new float[num];
	 
	 for (int i=0; i < nombres.length; i ++) {
		 System.out.println("Introduce el nombre del alumno: ");
		 nombre = entradaDatos.next();
		 System.out.println("Introduce la nota del alumno: ");
		 nota= entradaDatos.nextFloat();
		 
		 nombres [i] = nombre; 
		 notas [i] = nota; 
		 media = media + nota;
		 
		 
	 }
	 
	 media = media / num;
	 System.out.println("La media es: " + media);
	}

}
