package arrays;

import java.util.Scanner;

public class SumOfMatrix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows");
		int r = sc.nextInt();
		
		System.out.println("Enter the number of coloumn");
		int c = sc.nextInt();
		
		int a[][] = new int[r][c];
		int b[][] = new int[r][c];
		
		System.out.println("Enter the first matrix");
		for(int i = 0; i < r ; i++ ) {
			for(int j = 0; j < r ; j++ ){
				a[i][j] = sc.nextInt();
				
			}
			
		}
		System.out.println("Enter the second matrix");
		for(int i = 0; i < r ; i++ ) {
			for(int j = 0; j < r ; j++ ){
				b[i][j] = sc.nextInt();
				
			}
			
		}
		
		int sum[][] = new int[r][c];
		
		for(int i = 0; i < r ; i++ ) {
			for(int j = 0; j < r ; j++ ){
				sum[i][j] = a[i][j] + b[i][j];
				
			}
			
		}
		System.out.println("The value of sum ");
		for(int i = 0; i < r ; i++ ) {
			for(int j = 0; j < r ; j++ ) {
				System.out.print(sum[i][j]+" ");
				
			}
			System.out.println();
		}

	}

}
