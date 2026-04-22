import java.util.Scanner;

public class Start {

	public static boolean comprobarHora(int h, int m, int s)
	{
		boolean resultado=false;
		if((h>=0 && h<=23) && (m>=0 && m<=59) && (s>=0 && s<=59)) {
			resultado=true;
		}
		else {
			resultado=false;
		}
		return resultado;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entradaDatos= new Scanner(System.in);
		int hora=0;
		int minuto=0;
		int segundo=0;
		boolean res=false;
				
		System.out.println("Introduce la hora");
		hora= entradaDatos.nextInt();
		
		System.out.println("Introduce los minutos");
		minuto= entradaDatos.nextInt();
		
		System.out.println("Introduce los segundos");
		segundo = entradaDatos.nextInt();
		
		System.out.println("La hora introducida es:"+hora+":"+minuto+":"+segundo);
	
		res=comprobarHora(hora,minuto,segundo);
	
	
		if(res==true) 
		{
			System.out.println("La hora es correcta");
		}
		else {
			System.out.println("La hora NO es correcta");
		}
	
	}

}
