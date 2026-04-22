package Vehiculos;

public class Vehiculo {
	//Definición de los atributos:
		protected String marca;
		protected int precio;
		protected String color;
		protected int peso;
		protected float longitud;
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public int getPrecio() {
			return precio;
		}
		public void setPrecio(int precio) {
			this.precio = precio;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public int getPeso() {
			return peso;
		}
		public void setPeso(int peso) {
			this.peso = peso;
		}
		public float getLongitud() {
			return longitud;
		}
		public void setLongitud(float longitud) {
			this.longitud = longitud;
		}
}
