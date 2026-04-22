
public class Start {
	
	public static int sumaPositiva( int num1, int num2) {
		int resultado= 0;
		resultado = num1 + num2;
		if (resultado >= 0) {
			return resultado;
		}else {
			return -1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(sumaPositiva(-4, 2));
	}

}
