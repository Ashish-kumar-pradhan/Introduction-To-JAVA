package loops;

public class NestedForLoop {

	public static void main(String[] args) {
		for (int j=1; j<=10; j++) {
			
			for(int i = 1; i <= 20; i++) {
				System.out.print(i*j+"    ");
			}
			System.out.println();
		}
	}
}
