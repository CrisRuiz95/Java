package Vehiculos;

public class VehiculoGasoil extends Vehiculo{

	
	//Definición de los constructores;
		public VehiculoGasoil() {
		
			this.marca ="renault Kadjar";
			this.precio = 28000;
			this.peso = 4000;
			this.color= "azul";
			this.longitud = 3.5f;
		}
	//Definir el método
	public String mostrarInfo() {
			return " La marca del coche es: " +this.marca + "\n El precio del coche es: " + this.precio + "\n El color del coche es: " + this.color + "\n La longitud del coche es: "+ this.longitud;
		
	}
	
	
}
