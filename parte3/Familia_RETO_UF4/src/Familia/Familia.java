package Familia;

public abstract class Familia{
	protected int numLibro;
	protected String direccion;
	protected String poblacion;
	protected String provincia;
	
	public Familia () {
		this.numLibro = 1234;
		this.direccion= "Calle fulanito";
		this.poblacion= "Santovenia";
		this.provincia= "Zamora";
		
	}
	
	public int getNumLibro() {
		return numLibro;
	}
	public void setNumLibro(int numLibro) {
		this.numLibro = numLibro;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public abstract float imc () ;

	
}
