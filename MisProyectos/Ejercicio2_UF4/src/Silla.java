
public class Silla {

	protected String tipo;
	protected int numPatas;
	protected float anchura;
	protected float largo;
	protected float altura;
	
	public Silla() {
		this.tipo="Madera";
		this.numPatas=4;
		this.anchura=1.0f;
		this.largo = 1.0f;
		this.altura=1.0f;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}

	public float getAnchura() {
		return anchura;
	}

	public void setAnchura(float anchura) {
		this.anchura = anchura;
	}

	public float getLargo() {
		return largo;
	}

	public void setLargo(float largo) {
		this.largo = largo;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	
}


