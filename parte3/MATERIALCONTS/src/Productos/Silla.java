package Productos;

public class Silla extends Productos{
	
	
	//Definición de los constructores
	public Silla(int id, String nombre, String tipo, float anchura, float profundidad, float altura) {
		super(id, nombre, tipo, anchura, profundidad, altura);
			
	}
	
	
	//Definir los métodos propios:
	public String mostrarInfo() {
		return " El ID es: " +this.id + "\n El nombre del producto es: " + this.nombre + "\n El tipo del producto es: " + this.tipo + "\n La anchura del producto es: "+ this.anchura + "\n La altura del producto es: " + this.altura + "\n La profundidad del producto es: " +this.profundidad;
	
	}
	
}
