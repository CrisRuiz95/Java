package Edificios;

public class Almacen extends Edificios{

	//definición de los costructores:
	public Almacen () {
		this.anchura=600;
		this.altura=400;
		this.profundidad=700;
		this.funcionalidadEdificio();
		this.tipo="Almacén";
	}
	//Método abstracto
	@Override
	public String funcionalidadEdificio() {
		// TODO Auto-generated method stub
		return "Se guarda el producto para posteriormente venderlo";
	}

}
