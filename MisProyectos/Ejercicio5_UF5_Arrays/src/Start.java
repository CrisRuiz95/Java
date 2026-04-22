import java.util.ArrayList;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList <String> nombres = new ArrayList <String>();
		
		nombres.add("Pedro");
		nombres.add("Maria");
		nombres.add("Pablo");
		nombres.add("Jaime");
		nombres.add("Álvaro");
		
		for (int i =0 ; i<nombres.size(); i++) {
			System.out.println(nombres.get(i));
		}
	}

}
