
public class Alumno {

	protected String nombre;
	protected int edad;
	
	public Alumno() {
		this.nombre="";
		this.edad= 0;
	}
	public Alumno (String n, int e) {
		this.nombre = n;
		this.edad = e;
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
	public String mostrarInfo() {
		return this.nombre + "--" + this.edad;
	}
}
