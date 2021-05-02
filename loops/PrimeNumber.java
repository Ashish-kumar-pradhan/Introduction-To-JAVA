package loops;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
	  
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number");
		int n = sc.nextInt();
		boolean iPn = true;
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				iPn = false;
				break;
			}
		}
        System.out.println("the number is prime => "+ iPn);
	}

}
