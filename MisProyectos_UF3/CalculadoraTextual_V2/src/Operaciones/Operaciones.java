package Operaciones;

public class Operaciones {

	public static float suma(float a, float b)
	{
		return a+b;
	}
	
	public static float resta(float a, float b)
	{
		return a-b;
	}
	
	public static float multiplicacion(float a, float b)
	{
		return a*b;
	}
	public static float division(float a, float b)
	{
		return a/b;
	}
	public static String numeroMayor(float a, float b, float c)
	{

		if (a>b && a>c) {
			 return "El primer número es el mayor";
		}
		else if (b>c && b>a) {
			return "El segundo número es el mayor";
		}
		else {
			return "El tercer número es el mayor";
		}
	}
	public static float numeroFactorial(float numero1) {
		int factorial=1;
		int i=0;
		
			for (i=1; i<=numero1; i++) {
		factorial=factorial*i;
		
	}
		return factorial;
	}
}
