package calculator;

import java.util.Scanner;

public class Calculator {
	private Scanner scanner;
	// 한글
	public int add() {
		// transform code to integer
		int operand1 = scanner.nextInt();		
		int operand2 = scanner.nextInt();
		// compute
		int result = operand1 + operand2;
		// print result
		System.out.println(result);
		return result;
	}

	public void run() {
		this.scanner = new Scanner(System.in);
		
		String opCode = scanner.next();
		while (!opCode.equals("x")) {
			if (opCode.equals("+")) {
				this.add();
			}
			opCode = scanner.next();
		}		
		System.out.println("Goodbye!");
		
		this.scanner.close();		
	}
}









