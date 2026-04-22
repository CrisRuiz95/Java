package vehiculo;

public class coche extends vehiculo{

	@Override
	public float acelerar(float a) {
		// TODO Auto-generated method stub
		return this.velocidadActual-this.velocidadMaxima * 8.0f;
	}
	
}
