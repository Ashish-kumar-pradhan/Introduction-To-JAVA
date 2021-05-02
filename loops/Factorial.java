package loops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number of which factorial you want ");
		int x = sc.nextInt();
		int sum = 1;
		for(int i = 1; i <= x ; ++i ) {
			sum = sum * i;	
		}
		System.out.println( x +"! = "+ sum);

	}

}
