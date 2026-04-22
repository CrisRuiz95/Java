
public class Hijo2 extends Padre {

	@Override
	public String modoEstudio() {
		// TODO Auto-generated method stub
		String infoPadre = super.modoEstudio();
		return "info hijo2" + "----" +infoPadre;
	}

	@Override
	public String gustoMusical() {
		// TODO Auto-generated method stub
		return "rock";
	}

}
