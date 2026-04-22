
public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num1 = new int [10];
		int[] num2 = new int [10];
		
		int i = 0 ;
		
		for (i=0; i < num1.length; i++) {
			num1[i]=i;
		}
		for (i=0; i < num2.length; i++) {
			num2[i]=num1[i];
		}
		for (i=0; i< num1.length ; i++) {
			System.out.println("Pos:" +i + ":" +num2[i] );
		}
		
	}

}
