package Empresa;

import Edificios.Almacen;
import Edificios.Fabrica;
import Edificios.Oficina;
import Productos.Puertas;
import Productos.Silla;
import Vehiculos.VehiculoElectrico;
import Vehiculos.VehiculoGasoil;

public  class Empresa {

	//Definición de atributos de VEHICULOS
		VehiculoElectrico coche1;
		VehiculoGasoil coche2;
	//Definir los atributos de PRODUCTOS
		Silla producto1;
		Silla producto2;
		Puertas producto3;
		Puertas producto4;
		//Definir los atributos de EDIFICIOS
		Fabrica edificio1;
		Oficina edificio2;
		Almacen edificio3;
		
	public Empresa () {
		
		//Definir los constructores de VEHICULOS:
		this.coche1=null;
		this.coche2=null;
		//Definir los constructores de PRODUCTOS:
		this.producto1 = null;
		this.producto2= null;
		this.producto3=null;
		this.producto4=null;
		//Definir los constructores de EDIFICIOS:
		this.edificio1 =null;
		this.edificio2= null;
		this.edificio3= null;
		
		}
		//Definición de getters and setters DE VEHICULOS:
		public VehiculoElectrico getCoche1() {
			return this.coche1;
		}
		
		public void setCoche1(VehiculoElectrico coche1) {
			this.coche1 = coche1;
		}
		
		public VehiculoGasoil getCoche2() {
			return coche2;
		}
		
		public void setCoche2(VehiculoGasoil coche2) {
			this.coche2 = coche2;
		}
		//Definición de getters and setters DE PRODUCTOS
		public Silla getProducto1() {
			return this.producto1;
		}
		public void setProducto1(Silla producto1) {
			this.producto1 = producto1;
		}
		public Silla getProducto2() {
			return this.producto2;
		}
		public void setProducto2(Silla producto2) {
			this.producto2= producto2;
		}
		public Puertas getProducto3() {
			return this.getProducto3();
		}
		public void setProducto3(Puertas producto3) {
			this.producto3 = producto3;
		}
		public Puertas getProducto4() {
			return this.producto4;
		}
		public void setProducto4(Puertas producto4) {
			this.producto4 = producto4;
		}
		//Definir getter and setters de EDIFICIOS
		public void setEdificio1(Fabrica edificio1){
			this.edificio1 = edificio1;
		}
		public Fabrica getEdificio1() {
			return edificio1;
		}
		public void setEdificio2(Oficina edificio2) {
			this.edificio2 = edificio2;
		}
		public Oficina getEdificio2() {
			return edificio2;
		}
		public void setEdificio3(Almacen edificio3) {
			this.edificio3 = edificio3;
		}
		public Almacen getEdificio3() {
			return edificio3;
		}
		public String disenho1() {
			return "\n ********************************** \n";
		}
		public String disenho2() {
			return "\n ------------------------------------ \n";
		}
		public String mostrarInfo() {
			return 
			
			coche1.mostrarInfo()
			+disenho1()
			+ coche2.mostrarInfo() 
			+disenho2()
			+ producto1.mostrarInfo()
			+disenho1()
			+ producto2.mostrarInfo()
			+disenho1()
			+ producto3.mostrarInfo()
			+disenho1()
			+ producto4.mostrarInfo() 
			+disenho2()
			+ edificio1.mostrarInfo() 
			+disenho1()
			+ edificio2.mostrarInfo()
			+disenho1()
			+ edificio3.mostrarInfo();
				
				}
}
