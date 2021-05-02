package whileDoWhile;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number you want to check");
		
		int n = sc.nextInt();
		int temp = n;
		int reversedNumber = 0;
		
		while (temp > 1) {
			
			int lastDigit = temp % 10;
			
			reversedNumber = reversedNumber * 10 + lastDigit;
			
			temp /= 10;
		}
		
		System.out.println(reversedNumber);
		
		if(reversedNumber == n) {
			System.out.println(n+" is a Palindrome ");
		} else { 
			System.out.println(n+" is a not a Palindrome ");
		
			
		}

	}

}
