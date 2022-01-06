package datastructure;

import java.util.ArrayList;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		ArrayList <String> list = new ArrayList <String>();
		
		//adding names to array list
		
		list.add("Roja");
		list.add("Roja1");
		list.add("Roja2");
		list.add("Roja3");
		list.add("Roja4");
		
		System.out.println(list.size());
		
		for(String s:list) {
			System.out.println(s);
		}
	}

}
