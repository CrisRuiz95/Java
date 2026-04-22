package ConObjetos;

import java.util.ArrayList;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner entradaDatos = new Scanner (System.in);
		 String nombre ="";
		 int num=0;
		 float nota = 0.0f;
		 float media= 0.0f;
		 
		 ArrayList<Alumnos> alumnos = new ArrayList<Alumnos>();
		 
		 System.out.println("Introduce el número de alumnos a escribir: ");
		 num = entradaDatos.nextInt();
		 
		 
		 
		 for (int i=0; i < num; i ++) {
			 System.out.println("Introduce el nombre del alumno: ");
			 nombre = entradaDatos.next();
			 System.out.println("Introduce la nota del alumno: ");
			 nota= entradaDatos.nextFloat();
			 
			 Alumnos al = new Alumnos(nombre, nota);
			 alumnos.add(al);
			 media = media + al.getNota();
			 
		 }
		 
		 media = media / num;
		 System.out.println("La media es: " + media);
		}

	}


