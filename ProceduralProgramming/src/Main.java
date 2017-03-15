import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello");
		try {
			// memory allocation
			int input;	
			input = System.in.read();
			System.out.println(input);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
