
public class Hijo extends Padre {

	protected int numAsignaturas;
	public Hijo() {
		//Si no especificamos los atributos el hijo hereda los atributos del padre
		this.altura=2.0f;
		this.colorOjos="naranjas";
		// super(); --> Para hereredar los atributos del padre (redundante si no se especifica otras caracteristicas de ojos y altura)
		this.numAsignaturas =5;
		}
		
		public int getNumAsignaturas() {
			return numAsignaturas;
		}
		public void setNumAsignaturas (int numAsignaturas) {
			this.numAsignaturas= numAsignaturas;
		}

		@Override
		public String modoEstudio() {
			// TODO Auto-generated method stub
			return "Subrayando las partes más importantes";
		}

		@Override
		public String gustoMusical() {
			// TODO Auto-generated method stub
			return "pop";
		}
	
		
}
