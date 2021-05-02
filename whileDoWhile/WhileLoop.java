package whileDoWhile;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int n = sc.nextInt();
	    int temp = n;
	    int sum = 0;
	    
	    while(temp>0) {
	    	
	    	int lastDigit = temp % 10 ;
	    	temp /= 10;
	    	
	    	sum += lastDigit;
	    	System.out.println(lastDigit+"  "+ temp + "  "+ sum);
	    }
        System.out.println("the sum of digits of "+ n +" is "+sum);
	}

}
