
public class Futbolista {

	//Atributos
	protected String nombre;
	protected int dorsal;
	protected String apodo;
	protected float altura;
	
	//Definicion de constructor
	
	public Futbolista() {
		this.nombre="Eustaquio";
		this.dorsal=8;
		this.apodo="fulanito";
		this.altura= 1.90f;
	}
	
	//Definicion de getters and setters
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApodo() {
		return apodo;
	}
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
}
