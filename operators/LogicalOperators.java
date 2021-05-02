package operators;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if(a>= 1 && a <= 100) {
			System.out.println("the number is between 1 to 100 ");
		} else {
			System.out.println("the number is out of range ");
		}
	}

}
 