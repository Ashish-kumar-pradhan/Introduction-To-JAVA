package loops;

import java.util.Scanner;

public class SampleQuestion1 {

	private static int i;

	public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    System.out.println("enter the value of base ");
    int x = sc.nextInt();
   
    System.out.println("enter the value of power ");
    int y = sc.nextInt();
    
    int result = 1;
    
    for( i = 1; i <= y ; i++ ) {
    	
    	result *= x ;
    	
       }
    System.out.println( "the result is "+ result);

	}

}
