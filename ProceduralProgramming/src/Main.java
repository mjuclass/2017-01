import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		try {
			// 명사, 명사, 동사, 부사
			// Object.Method(Parameter);
			System.out.println("Hello");
			int intInput;
			intInput = System.in.read();
			System.out.println(intInput);
			
			char charInput;
			charInput = (char)intInput;
			System.out.println(charInput);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
