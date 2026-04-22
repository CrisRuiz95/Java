
public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aula aula1;
		aula1 = new Aula();
		
		System.out.println(aula1.getNombre());
		
		Silla s1; 
		s1= new Silla();
		s1.setAnchura(10.0f);
		s1.setLargo(10.0f);
		
		//Hemos asignado la silla 1 con el aula 1
		aula1.setSilla1(s1);
		
		
		Silla s2; 
		s2= new Silla();
		s2.setAnchura(10.0f);
		s2.setLargo(10.0f);
	
		aula1.setSilla2(s2);
		
		//REpetimos con las otras dos sillas 
		
		System.out.println("Anchura de la silla 1: " +aula1.getSilla1().getAnchura());
	
		
		
		Mesa m1;
		m1 = new Mesa();
		m1.setAnchura(10.0f);
		m1.setLargo(20.0f);
		
		aula1.setMesa1(m1);
		
	
	}

}
