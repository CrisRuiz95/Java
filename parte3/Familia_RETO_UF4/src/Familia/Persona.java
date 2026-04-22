package Familia;

public class Persona extends Familia{

	protected String nombre;
	protected int edad;
	protected String dni;
	protected String sexo;
	protected float peso;
	protected float altura;
	
	public Persona () {
		
		this.nombre="Fulanito";
		this.edad = 30;
		this.dni= "35795453A";
		this.sexo= "Hombre";
		this.peso= 85.4f;
		this.altura= 1.9f;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	@Override
	public float imc() {
		// TODO Auto-generated method stub
		return this.peso / (this.altura * this.peso);
		}
	}
	


