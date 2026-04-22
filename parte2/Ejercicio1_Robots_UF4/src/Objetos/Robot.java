package Objetos;

public class Robot {

	//Definición de atributos
	private String color;
	private String modelo;
	private float altura;
	private boolean activado;
	
	//Definición del constructor/es
	public Robot() {
		this.color="Rojo";
		this.modelo="A11";
		this.activado=false;
	}
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public boolean isActivado() {
		return activado;
	}

	public void setActivado(boolean activado) {
		this.activado = activado;
	}
	
	public Robot (String c, String m, float al, boolean ac) {
		this.color =c;
		this.modelo=m;
		this.altura=al;
		this.activado=ac;
	}
	//Definición de getters y setters
	public String getColor() {
		return this.color;
	}
	public void setColor(String c) {
		this.color=c;
	}
	//Definir los métodos propios
	public String print() {
		return this.color+ " - " +this.modelo + " - " + this.altura + " - " + this.activado;
	}
}
