package Productos;

public class Productos {
	
	//Definición de atributos:
		protected int id;
		protected String nombre="";
		protected String tipo="";
		protected float anchura;
		protected float profundidad;
		protected float altura;
		
		public Productos (int id, String nombre, String tipo, float anchura, float profundidad, float altura) {
			this.id = id;
			this.nombre = nombre;
			this.tipo = tipo;
			this.anchura = anchura;
			this.profundidad = profundidad;
			this.altura = altura;
		}
		
		//Definición de getters and setters
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public float getAnchura() {
			return anchura;
		}
		public void setAnchura(float anchura) {
			this.anchura = anchura;
		}
		public float getProfundidad() {
			return profundidad;
		}
		public void setProfundidad(float profundidad) {
			this.profundidad = profundidad;
		}
		public float getAltura() {
			return altura;
		}
		public void setAltura(float altura) {
			this.altura = altura;
		}
		
		
		//Getters and setters de tipo silla y puertas:
		public String getTipo() {
			return tipo;
		}


		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		//Definir los métodos propios:
		public String mostrarInfo() {
			return " El ID es: " +this.id + "\n El nombre del producto es: " + this.nombre + "\n El tipo del producto es: " + this.tipo + "\n La anchura del producto"+ " es: "+ this.anchura + "\n La altura del producto es: " + this.altura + "\n La profundidad del producto es: " +this.profundidad;
				
				}
	

}
