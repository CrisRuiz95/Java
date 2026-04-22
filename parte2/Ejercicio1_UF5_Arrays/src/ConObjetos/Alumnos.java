package ConObjetos;

public class Alumnos {

	protected String nombre;
	protected float nota;
	
	public Alumnos() {
		this.nombre="";
		this.nota=0;
	}
	public Alumnos ( String n, float nt) {
		this.nombre=n;
		this.nota=nt;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}
	public String mostrarInfo() {
		return this.nombre + " -- " + this.nota; 
	}
}
