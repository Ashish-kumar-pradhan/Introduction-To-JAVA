package loops;

import java.util.Scanner;

public class Patterns8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number ");
		int n = sc.nextInt();
		

		for (int j=1; j<=n; j++) {
			
			for(int i = 1; i <= j; i++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int k=n-1; k>=1; k--) {
					
			for(int i = 1; i <= k; i++) {
				System.out.print("* ");
					}
			System.out.println();
		}
		
	}

}
