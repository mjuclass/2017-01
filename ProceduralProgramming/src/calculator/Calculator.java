package calculator;

public class Calculator {
	// attributes
	
	// method/function
	private int codeToBinay() {
		try {
			int operand = 0;
			// get operands
			int operandCode = System.in.read();
			while(operandCode<'0' || operandCode>'9') {
				operandCode = System.in.read();
			}
			// 숫자 읽기
			while(operandCode>='0' && operandCode<='9') {
				operand = operand * 10 + (operandCode - '0');
				operandCode = System.in.read();
			}
			return operand;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	private char[] binaryToCode(int operand) {
		char operandCode[] = new char[11];
		int mod;
		int i =0;
		while (operand != 0) {
			// 나머지 계산
			mod = (operand % 10);
			operand = operand / 10;
			mod = (mod + '0');
			// 숫자를 코드로 - type casting
			operandCode[i] = (char)mod;
			i++;
		}
		operandCode[i] = '\0';
		
		char result[] = new char[11];
		int j=0;
		while (operandCode[j]!='\0') {
			result[  ] = operandCode [] ;
			j++;
		}
		return result;		
	}
	// 한글
	public int add() {
		// transform code to integer
		int operand1 = this.codeToBinay();
		int operand2 = this.codeToBinay();
		// compute
		int result = operand1 + operand2;
		System.out.println(result);
		// transform integer to code
		char resultCode[] = binaryToCode(result);
		return result;
	}
}









