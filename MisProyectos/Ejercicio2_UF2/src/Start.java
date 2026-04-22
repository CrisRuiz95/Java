
public class Start {

	public static boolean esPositivo (int param1) {
		if(param1 > 0) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean res = false;
		
		res = esPositivo(-5);
		System.out.println(res);
	}

}
