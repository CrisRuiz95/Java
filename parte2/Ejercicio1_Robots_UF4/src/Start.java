import Objetos.Empresa;
import Objetos.Robot;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Definir un objeto de tipo Robot
		Empresa emp=new Empresa();
		
		Robot r1= null;
		Robot r2= null;
		Robot r3=null;
		Robot r4 = new Robot ("negro", "4444", 4.0f, true);
		r1 = new Robot();
		r2 = new Robot();
		r3 = new Robot();
		
		if (r1!=null) {
			System.out.println("antes del set: "+r1.getColor());
			}
			
		//Color sea de color azul
		r1.setColor("azul");
		if (r1!=null) {
		System.out.println("Después del set: " +r1.getColor());
		}
		//Modelo 1111
		//Altura 1.80
		r1.setModelo("1111");
		r1.setAltura(1.80f);
		r1.setActivado(true);
		
		System.out.println(r1.print());
		//Robot 2
		r2.setColor("verde");
		r2.setAltura(2.00f);
		r2.setActivado(false);
		r2.setModelo("2222");
		
		//Robot 2
		r3.setColor("amarillo");
		r3.setAltura(3.00f);
		r3.setActivado(false);
		r3.setModelo("3333");
		
		//Quiero introducir el robot r1 en la empresa
		
		
		emp.setRobot1(r1);
		System.out.println("Cantidad: "+ emp.ocupacion());
		emp.setRobot2(r2);
		System.out.println("Cantidad: " +emp.ocupacion());
		emp.setRobot3(r3);
		System.out.println("Cantidad: " +emp.ocupacion());
		
		
		//Tengo 3 robots dentro de la empresa
		System.out.println(emp.getRobot2().print());
		//obtenermos el color del robot
		System.out.println(emp.getRobot3().getColor());
		//Cambiamos la altura del robot 3 de la empresa y ponemos 10.0f
		emp.getRobot3().setAltura(10.0f);
		
		System.out.println(emp.mostrarInfo(1));
	}
	


}
