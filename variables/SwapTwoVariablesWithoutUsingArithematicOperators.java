package variables;

public class SwapTwoVariablesWithoutUsingArithematicOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1;
		int b = 5;
		
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println(a + " " + b);

	}

}
