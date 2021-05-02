package ifElse;

public class NestedIfElse {

	public static void main(String[] args) {
		
		int a = 12;
		int b = 17;
		int c = 18;
		
		if(a > b) {
			if (a > c) { 
				System.out.println("a is greater");
				
			} else {
				System.out.println("c is greater");
			}
		} else {
			if(b>c) {
			System.out.println("b is greater");
			} else {
				System.out.println("c is greater");
			}
		}

	}

}
