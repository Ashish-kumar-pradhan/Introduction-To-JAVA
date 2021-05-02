package loops;

public class Patterns5 {

	public static void main(String[] args) {

		for (int j=1; j<=5; j++) {
			
			for(int k = 5-j ; k >= 1 ; k-- ) {
				System.out.print("  ");
			
			}
			
			for(int i = 1; i <= j; i++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
