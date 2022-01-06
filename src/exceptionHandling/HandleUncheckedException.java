package exceptionHandling;

public class HandleUncheckedException {
	public static void main(String[] args) {
		System.out.println("started");
		
		int a = 10;
		
		try {
			System.out.println(a/0);
		}
		
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());      //ArithmeticException
		}
		
		finally {
			
		}
		
		String s = null;
		 
		
		try {
			System.out.println(s.length());          //NullPointerException
		}
		
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("program in progress");
		System.out.println("program is stopped");
	}

}
