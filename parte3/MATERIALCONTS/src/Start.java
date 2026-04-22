import Edificios.Almacen;
import Edificios.Fabrica;
import Edificios.Oficina;
import Empresa.Empresa;
import Productos.Productos;
import Productos.Puertas;
import Productos.Silla;
import Vehiculos.VehiculoElectrico;
import Vehiculos.VehiculoGasoil;
import Vehiculos.VehiculoGasolina;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empresa emp= new Empresa ();
		
		
		//********PARTE DE VEHÍCULOS************
		VehiculoElectrico ve = new VehiculoElectrico();
		VehiculoGasoil vg = new VehiculoGasoil();
		VehiculoGasolina vG = new VehiculoGasolina();
		
		
		
		//********PARTE DE LOS PRODUCTOS***************
		Silla si1 = new Silla(1, "SillaN20", "Silla", 1.0f, 0.5f, 0.5f);
		Silla si2 = new Silla(2, "SillaM100", "Silla", 1.5f, 0.5f, 1.5f);
		Puertas puer1 = new Puertas(3, "Puerta P9", "Puerta", 1.5f, 2.25f, 0.25f);
		Puertas puer2 = new Puertas(4, "Puerta F50", "Puerta", 1.25f, 1.25f, 0.25f);
		
		
		
		
		//***********PARTE DE EDIFICIOS*******************
		Fabrica fa = new Fabrica();
		Oficina ofi = new Oficina();
		Almacen al = new Almacen();
		
		//Setters
		emp.setCoche1(ve);
		emp.setCoche2(vg);
		emp.setProducto1(si1);
		emp.setProducto2(si2);
		emp.setProducto3(puer1);
		emp.setProducto4(puer2);
		emp.setEdificio1(fa);
		emp.setEdificio2(ofi);
		emp.setEdificio3(al);
		
		System.out.println(emp.mostrarInfo());
	}

}
