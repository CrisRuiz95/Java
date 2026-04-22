
public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean tieneHuecos = false;
		int contador = 0 ;
		String[] valor = new String [10];
		
		valor[0] = "valor";
		valor[1] = "valor";
		valor[2] = "";
		valor[3] = "valor";
		valor[4] = "valor";
		valor[5] = "valor";
		valor[6] = "valor";
		valor[7] = "valor";
		valor[8] = "";
		valor[9] = "valor";
		
		for(int i=0; i< valor.length; i++) {
			//System.out.println(valor[i]);
			if( valor[i].equals("")) {
				contador++;
				tieneHuecos=true;
			}
		}
		if(tieneHuecos) {
			System.out.println("El array tiene huecos vacíos("+contador+")");
		}else {
			System.out.println("El array está correctamente lleno");
		}
		
	}

}
