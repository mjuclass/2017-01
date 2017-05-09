package calculator;

import java.util.Scanner;

public class CalculatorTest {
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
			result[i-j-1] = operandCode [j] ;
			j++;
		}
		result[j] = '\0';
		return result;		
	}
	// 한글
	public int add() {
		// transform code to integer
		Scanner scanner = new Scanner(System.in);
		int operand1 = scanner.nextInt();
		int operand2 = scanner.nextInt();
		scanner.close();
		// compute
		int result = operand1 + operand2;
		System.out.println(result);
		// transform integer to code
		char resultCode[] = binaryToCode(result);
		for (int i=0; resultCode[i]!='\0'; i++) {
			System.out.println(resultCode[i]);
		}
		return result;
	}
}









