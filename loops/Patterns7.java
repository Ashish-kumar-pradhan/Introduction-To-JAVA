package loops;

import java.util.Scanner;

public class Patterns7 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number of rows ");
		int n = sc.nextInt();
		
		int num = 1;
		
		for (int i = 1; i<=n ; i++ ) {
			
			for(int j = n-i ; j >= 0 ; j-- ) {
				System.out.print("  ");
			}
			
			for(int j = 1 ; j<= i ; j++) {
			System.out.print(num++ +"   ");
		}
		System.out.println();
		}

	}

}
