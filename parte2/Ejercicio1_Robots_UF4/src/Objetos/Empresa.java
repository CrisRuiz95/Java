package Objetos;

public class Empresa {

	//Definicion de atributos
	private Robot robot1;
	private Robot robot2;
	private Robot robot3;
	
	//Definir el contructor/es
	public Empresa() {
		this.robot1=null;
		this.robot2=null;
		this.robot3=null;
	}
	//Definición de getters y setters
	public Robot getRobot1() {
		return this.robot1;
	}
	public void setRobot1(Robot r) {
		this.robot1=r;
	}
	public Robot getRobot2() {
		return robot2;
	}
	public void setRobot2(Robot robot2) {
		this.robot2 = robot2;
	}
	public Robot getRobot3() {
		return robot3;
	}
	public void setRobot3(Robot robot3) {
		this.robot3 = robot3;
	}
	//Definición e métodos propios
	public int ocupacion() {
		int cantidad = 0 ;
		if (this.robot1!=null) {
			cantidad=cantidad+1;
		}
		if (this.robot2!=null) {
			cantidad=cantidad+1;
		}
		if (this.robot3!=null) {
			cantidad=cantidad+1;
		}
		return cantidad;
	}
	public String mostrarInfo(int numRobot) {
		String salida="";
	if (numRobot ==1) {
		
	
		if (this.robot1!=null) {
		  salida= salida+ robot1.print() + "\n";
		}
	}	else if (numRobot ==2) {
		
	
		if (this.robot2!=null) {
			  salida= salida+ robot2.print() +"\n";
			}
	}	else if (numRobot==3) {
		
	
		if (this.robot3!=null) {
			  salida= salida+ robot3.print() +"\n";
			}
	}	
		return salida;
	}
}
