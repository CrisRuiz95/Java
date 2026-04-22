package clasesDiferentes;

public class Operaciones {

	
	public static String saludar(String n) 
	{
		return "Hola " +n;
	}
	
	public static float suma(float a, float b)
	{
		return a+b;
	}
	
	public static int sumaPositivos(int a, int b)
	{
		if (a>=0 && b>=0) {
			return a+b;
		}
		else {
			return -1;
		}
	}


	}

