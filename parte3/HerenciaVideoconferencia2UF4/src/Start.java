
public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hijo h1 = new Hijo();
		System.out.println("La altura del hijo es: "+h1.getAltura());
		System.out.println("El color de ojos son: " +h1.getColorOjos());
		System.out.println("EL modo de estudio del hijo 1 es: " +h1.modoEstudio());
		Nieto n1=new Nieto();
		System.out.println("El color de ojos del nieto son:" +n1.getColorOjos());
		System.out.println("Asignaturas del nieto es: " +n1.getNumAsignaturas());
		Hijo2 h2= new Hijo2();
		System.out.println("El modo de estudio del hijo 2 es: " +h2.modoEstudio());
	}

}
