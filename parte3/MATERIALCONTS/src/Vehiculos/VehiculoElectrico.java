package Vehiculos;

public class VehiculoElectrico extends Vehiculo{

	//Definición de los atributos:
	
	private int potencia;


	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	//Definición de los constructores;
	public VehiculoElectrico() {
		this.marca ="Seat Altea";
		this.precio = 20000;
		this.peso = 3000;
		this.color= "rojo";
		this.longitud = 3;
		this.potencia = 4000;
		
	}
	
	//Definir los métodos propios:
	public String mostrarInfo() {
		return " La marca del coche es: " +this.marca + "\n El precio del coche es: " + this.precio + "\n El color del coche es: " + this.color + "\n La longitud del coche es: "+ this.longitud + "\n La potencia del coche es: " + this.potencia;
	}
		
}
