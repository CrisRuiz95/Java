
public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String semaforo="morado";
		
		switch(semaforo) {
		case "rojo":
		System.out.println("Estoy en color rojo");
		break;
		case "amarillo":
			System.out.println("Estoy en color amarillo");
			break;
		case "verde":
			System.out.println("Estoy en color verde");
			break;
			default:
				
				System.out.println("Color erróneo");
				break;
		}
		
		if(semaforo=="rojo") {
			System.out.println("Estoy en color rojo");
		}
		else if (semaforo=="amarillo"){
			System.out.println("Estoy en color amarillo");
		}
		else if (semaforo=="verde"){
			System.out.println("Estoy en color verde");
		}
		else{
			System.out.println("El color no existe");
		}
	}

}
