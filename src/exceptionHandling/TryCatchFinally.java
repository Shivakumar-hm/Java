package exceptionHandling;

public class TryCatchFinally {
	
	public static void main(String[] args) {
		
		int arr[] = new int[5];
		
		try {
			arr[10] = 100;
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("this is finally block");	
		}
		
		
	}
	
	 

}
