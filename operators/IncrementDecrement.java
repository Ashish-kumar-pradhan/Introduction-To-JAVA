package operators;

public class IncrementDecrement {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 10;
		int c = 10;
		int d = 10;
		
		int w = a--;
		int x = b++;
		int y = ++c;
		int z = --d;
		
		System.out.println(a +" "+ w);
		System.out.println(b +" "+ x);
		System.out.println(c +" "+ y);
		System.out.println(d +" "+ z);

	}

}
