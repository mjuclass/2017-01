import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		try {
			// ���, ���, ����, �λ�
			// Object.Method(Parameter);
			int intInput;
			// pre-condition: initial state
			intInput = System.in.read();
			while(intInput != 0x20) {
				// task
				System.out.println(intInput);
				// ���¸� ��ȭ�����ִ� ���
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
