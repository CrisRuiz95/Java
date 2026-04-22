import java.util.ArrayList;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Estático
		Alumno [] alumnos = new Alumno [10];
		
		alumnos [0] = new Alumno ("Jessica",35);
		alumnos [1] = new Alumno ("José Angel", 20);
		
		for ( int i = 0 ; i < alumnos.length; i++) {
			if (alumnos[i] !=null) {
			System.out.println(alumnos[i].mostrarInfo());
			}
			
		}
		
		//Dinámido
		ArrayList<Alumno> alumnosD = new ArrayList <Alumno>();
		
		Alumno a1 = new Alumno ("Jessica", 35);
		alumnosD.add(a1);
		Alumno a2 = new Alumno ("José Ángel", 20);
		alumnosD.add(a2);
		
		for (int i = 0 ; i < alumnosD.size(); i++) {
			System.out.print(alumnosD.get(i).getNombre() +"--");
			System.out.println(alumnosD.get(i).getEdad());
		}
	}

}
