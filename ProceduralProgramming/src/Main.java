import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		try {
			// 명사, 명사, 동사, 부사
			// Object.Method(Parameter);
			int intInput;
			// pre-condition: initial state
			intInput = System.in.read();
			while(intInput != 0x20) {
				// task
				System.out.println(intInput);
				// 상태를 변화시켜주는 명령
				intInput = System.in.read();
			}
			
			for (intInput = System.in.read();
					intInput != 0x20;
					intInput = System.in.read()) {
				System.out.println(intInput);			
			}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
