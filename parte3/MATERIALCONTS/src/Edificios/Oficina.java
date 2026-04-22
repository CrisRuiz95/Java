package Edificios;

public class Oficina extends Edificios{

	//Definición de los constructores
	public Oficina () {
		this.anchura=600;
		this.altura=400;
		this.profundidad=700;
		this.funcionalidadEdificio();
		this.tipo="Oficina";
	}	
	
	//Método abstracto
	@Override
	public String funcionalidadEdificio() {
		// TODO Auto-generated method stub
		return "Se etiqueta el producto";
	}

}
