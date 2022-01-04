package com.Day2;

public class stringMethods {
	public static void main(String[] args) {
		/*length()
		 * concat()
		 * equals()
		 * equalsignore()
		 * contains()
		 * substrings() //substring(starting index, ending index)
		 * replace()
		 */
		
		
		String s = "Welcome", s1 = "Welcome to", s2 = " Training" , s3 = "ONE", s4 = "ONE", s5 = "one";
		
		
		
		System.out.println("Length of the string s is " + s.length());
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		System.out.println("Two strigns are equal: "+ s1.equals(s2));
		System.out.println("Two strigns are equal: "+ s3.equals(s4));
		System.out.println("Two strigns are equal: "+ s4.equalsIgnoreCase(s5));
		System.out.println("String s1 contains Wel: "+ s1.contains("Wel"));
		System.out.println("String s1 contains Train: "+ s1.contains("Train"));
		System.out.println(s.substring(0,3));
		System.out.println(s.substring(3,5));
		System.out.println(s.substring(5,7));
		System.out.println(s.replace('e', 'a'));
		System.out.println(s.replace("come", "kame"));





		
	}

}
