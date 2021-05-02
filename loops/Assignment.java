package loops;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of terms ");
		int n = sc.nextInt();
		
		float result = 0;
		for(float i = 1; i <= n ; i++) {
			 result += 1/i ;			
		}
		System.out.println("the sum is "+ result );
	}

}
