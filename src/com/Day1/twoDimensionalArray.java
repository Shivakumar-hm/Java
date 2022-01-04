package com.Day1;

public class twoDimensionalArray {
	
	public static void main(String[] args) {
		
		int a[][] = new int [3][3];
		
		
		a[0][0] = 20;
		a[0][1] = 30;
		a[0][2] = 120;
		
		a[1][0] = 120;
		a[1][1] = 203;
		a[1][2] = 20;
		
		a[2][0] = 2;
		a[2][1] = 220;
		a[2][2] = 20;
		
		
		
		for(int i[]:a) {
			for(int j:i) {
				System.out.print(j + "  ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int b[][] = {{20, 10, 30}, {12, 23, 34}, {23, 44, 55}};
		
		for(int l = 0; l <= 2; l++) {
			for(int k = 0; k <= 2; k++) {
				System.out.print(b[l][k] + " ");
			}
			System.out.println();
		}
		
		
	}

}
