package loops;

public class Patterns4 {

	public static void main(String[] args) {

		for (int j=5; j>=1; j--) {
			
			for (int i=1; i<=5-j ; i++) {
				System.out.print("  ");
			}
			
			for(int i = 1; i <= j; i++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}


	}

}
