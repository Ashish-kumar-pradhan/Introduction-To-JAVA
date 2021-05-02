package switchCaseStatement;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the first number  ");
		int a = sc.nextInt();
		
		System.out.println("enter the second number  ");
		int b = sc.nextInt();
		
		System.out.println("enter the opration ");
		sc.nextLine();
		char op = sc.nextLine().charAt(0);
		
		int result = 0;
		
		switch(op) {
		
		case '+':
			result = a + b ;
			break;
		case '-':
			result = a - b ;
			break;
		case '*':
			result = a * b ;
			break;
		case '/':
			result = a / b ;
			break;
		default:
			System.out.println("invalid operation");
			}	
		System.out.println("the result is "+ result);

	}

}
