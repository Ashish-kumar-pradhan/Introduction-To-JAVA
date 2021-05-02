package loops;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number of which table you want ");
		int x = sc.nextInt();
		
		for(int i = 1; i <= 10 ; i = i + 1) {
			int a = x * i;
			System.out.println( x +"x"+ i +"="+ a);
		}

	}

}
