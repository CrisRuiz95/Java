import Familia.Persona;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona padre = new Persona();
		
		//Mostrar datos por pantalla:
		System.out.println("El nombre es :" +padre.getNombre());
		System.out.println("La edad es: " +padre.getEdad());
		System.out.println("El DNI es: " +padre.getDni());
		System.out.println("El sexo es: " +padre.getSexo());
		System.out.println("El peso es: " +padre.getPeso());
		System.out.println("La altura es: " +padre.getAltura());
		System.out.println("El número de familia es: " +padre.getNumLibro());
		System.out.println("La dirección es: " +padre.getDireccion());
		System.out.println("La población es: " +padre.getPoblacion());
		System.out.println("La provincia es: "+padre.getProvincia());
		System.out.println("El IMC es: " +padre.imc());
	}

}
