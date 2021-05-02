package strings;

public class Assignment1 {

	public static void main(String[] args) {
		
		String sentance = "I love Java, the Coffee";
		String words[] = sentance.split(" ");
		for (int i=0; i< 5 ; i++) {
			System.out.print(words[4-i]+" ");

		}

	}

}
