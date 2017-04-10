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
	private int binaryToCode(int operand) {
		int operandCode = 0;
		int mod;
		while (operand != 0) {
			mod = operand % 10;
			operand = operand / 10;
			mod = mod + '0';
			System.out.println(mod);
		}		
		return operandCode;		
	}
	public int add() {
		// transform code to integer
		int operand1 = this.codeToBinay();
		int operand2 = this.codeToBinay();
		// compute
		int result = operand1 + operand2;
		// transform integer to code
		int resultCode = binaryToCode(result);
		return result;
	}
}









