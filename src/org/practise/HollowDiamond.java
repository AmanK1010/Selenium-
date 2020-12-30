package org.practise;

public class HollowDiamond {
	
	public static void main(String[] args) {
		
		int rows=18;
		
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <=rows-i; j++) {
				System.out.print(" ");
				
			}
			for (int j =1; j <=2*i-1; j++) {
				if (j==1||j==2*i-1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for (int i = 1; i <=rows-1; i++) {
			for (int j =1; j <=i; j++) {
				System.out.print(" ");
			}
			for (int j =2*(rows-i)-1; j>0 ; j--) {
				if (j==1||j==2*(rows-i)-1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	
}