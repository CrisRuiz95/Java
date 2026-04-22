package vehiculo;

public class moto extends vehiculo implements IVehiculo{

	@Override
	public float acelerar(float a) {
		// TODO Auto-generated method stub
		return this.velocidadActual+a;
	}

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return this.marca + "-" + this.modelo+ "-"+ this.velocidadActual + "-" + this.velocidadMaxima;
		
	}

}
