
public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Futbolista fut1;
		Futbolista fut2;
		
		//instanciamos
		fut1 = new Futbolista();
		fut2 = new Futbolista();

		fut2.setDorsal(5);
		fut2.setApodo("linares");
		fut2.setAltura(1.80f);
		fut2.setNombre("MariCarmen");
		
		
		
		System.out.println("El dorsal es: " +fut1.getDorsal());
		//Repetimos lo mismo con todos los atributos
		System.out.println("El dorsal es: " +fut2.getDorsal());
		}
	}


