package loops;

import java.util.*;
import java.io.*;


public class Random {

	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        int arr[] = new int[3*t];
	        for(int i=0 ; i<3*t ;i++) {
	           arr[i] = in.nextInt(); 
	        }
	        
	        for(int i=0 ; i<3*t ; i = i + 3) {
	        	int a = arr[i];
	        	int b = arr[i+1];
	        	int n = arr[i+2];
	        	
	        	for(int j=0 ; j < n ; j++){
	                int result = a + (int)Math.pow(2 , j)*b;
	                a = result;
	                System.out.print(result + " ");
	            }
	        	
	        	System.out.println();
	        }

             
	        in.close();

	}

}
