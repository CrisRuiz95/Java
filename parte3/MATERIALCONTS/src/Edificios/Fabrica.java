package Edificios;

public class Fabrica extends Edificios {

	//Definición de los constructores:
	public Fabrica () {
		this.anchura= 400;
		this.altura= 400;
		this.profundidad= 500;
		this.tipo="Fábrica";
		this.funcionalidadEdificio();
	}
	//Método abstracto
	@Override
	public String funcionalidadEdificio() {
		// TODO Auto-generated method stub
		return "Se crea el producto";
	}

	
}
