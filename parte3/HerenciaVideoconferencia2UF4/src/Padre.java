
public abstract class Padre {
	protected String colorOjos;
	protected float altura;
	
	public Padre() {
		//Cuando es private algún atributo no se hereda
		this.colorOjos="verde";
		this.altura = 1.80f;
	}
	public String getColorOjos() {
		return colorOjos;
	}
	public void setColorOjos (String colorOjos) {
		this.colorOjos =colorOjos;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura (float altura) {
		this.altura = altura;
	}
	public String modoEstudio () {
		return "modo de estudio del padre";
		//Con métodos abstractos no tiene implementación a otros hijos (en el Start)
		// Se implementa las clases abstractas cuadno obligatoriamente debe ser heredado a los hijos.
		//es decir si es exactamente igual se hereda si difiere sería clase abstracta
	}
		public abstract String gustoMusical();
		
	}
		
		
	

