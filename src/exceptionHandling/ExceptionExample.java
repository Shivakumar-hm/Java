package exceptionHandling;

public class ExceptionExample {
	
	public static void main(String[] args) {
		System.out.println(" Started");
		
		//Thread.sleep(4000); //Interrupted exception (Checked Exception)
		
		int i = 10;
		
		System.out.println(i/0);  //Unchecked Exception.
		
		System.out.println("stopped");
		
	}

}
