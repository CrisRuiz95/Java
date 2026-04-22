package vehiculo;

public abstract class vehiculo {

	protected String marca;
	protected float velocidadActual;
	protected float velocidadMaxima;
	protected String modelo;
	protected boolean arrancando;
	
	public vehiculo() {
		this.marca  = "Seat";
		this.modelo ="cordoba";
		this.velocidadActual=0.0f;
		this.velocidadMaxima = 200.0f;
		this.arrancando = false;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float velocidadActual() {
		return velocidadActual;
	}
	public void setVelocidadActual(float velocidadActual) {
		this.velocidadActual = velocidadActual;
	}
	public float velocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(float velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public boolean getArrancando() {
		return arrancando;
	}
	public void setArrancando (boolean arrancando) {
		this.arrancando = arrancando;
	}
	public abstract float acelerar(float a);
		
	
}
