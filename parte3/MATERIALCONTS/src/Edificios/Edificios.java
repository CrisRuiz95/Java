package Edificios;

public abstract class Edificios {
	//Definición de atributos
	protected float anchura;
	protected float altura;
	protected float profundidad;
	protected String tipo;
	protected float precioMetro=30;
	
	
	//Getters and setters
	public float setAnchura() {
		return this.anchura;
	}
	public float getAnchura() {
		return anchura;
	}
	public float setAltura() {
		return this.altura;
	}
	public float getAltura() {
		return altura;
	}
	public float setProfundidad() {
		return this.profundidad;
	}
	public float getProfundidad() {
		return profundidad;
	}
	public String setTipo() {
		return this.tipo;
	}
	public String getTipo() {
		return tipo;
	}
	public float getCosteMetro() {
		return this.precioMetro;
	}
	public float setCosteMetro() {
		return precioMetro;
	}
	//Definir el método propio que compartirá con los 3 tipos de edificios
		public float costePintura() {
			if (precioMetro < 0 || anchura < 0 || altura < 0 || profundidad < 0) {
				return -1.0f;
			} else  {
				return precioMetro * this.anchura * this.altura * this.profundidad;
			}	
}
		public abstract String funcionalidadEdificio();
		
		//Definir los métodos propios:
		public String mostrarInfo() {
			return " La anchura del edificio es: " +this.anchura + "\n La altura del edificio es: " + this.altura + "\n La profundidad del edificio es: " + this.profundidad + "\n La funcionalidad del edificio es: "+ this.funcionalidadEdificio() + "\n El tipo de edificio es: " + this.tipo + "\n El coste por pintura es: "+costePintura() ;
			}
}