package exceptionHandling;

public class Uncheckedexception {
	
	public static void main(String[] args) {
		//int a = 20;
		//System.out.println(a/0);        //ArithmeticException
		
		//String s = null;
		//System.out.println(s.length()); //NullPointerException
		
		//String str = "abcde";
		//int i = Integer.parseInt(str);  //NumberFormatException
		//System.out.println(i);
		
		int arr[] = new int[5];
		arr[10] = 100;
		System.out.println(arr[10]);      //ArrayIndexOutOfBoundsException
		
	}

}
