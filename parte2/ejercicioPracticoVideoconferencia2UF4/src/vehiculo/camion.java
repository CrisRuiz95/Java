package vehiculo;

public class camion extends vehiculo{

	@Override
	public float acelerar(float a) {
		// TODO Auto-generated method stub
		return this.velocidadActual+a *2.0f;
	}

}
