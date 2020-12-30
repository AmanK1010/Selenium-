package org.practise;

public class Diamond {
public static void main(String[] args) {
	
	int rows=10;
	for (int i = 1; i <= rows; i++) {
		for (int j = 1; j <=rows-i; j++) {
			System.out.print(" ");
			
		}
		for (int j =1; j <=2*i-1; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	for (int i = 1; i <=rows-1; i++) {
		for (int j =1; j <=i; j++) {
			System.out.print(" ");
		}
		for (int j =2*(rows-i)-1; j>0 ; j--) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
