package calculator;

public class Calci {
	int operand1, operand2;
	void operations() {
		System.out.println("1. Addition");
		System.out.println("2. Substracion");
		System.out.println("3. Multiplication");
		System.out.println("4. Divison");
	}
	void setOperands(int operand1, int operand2) {
		this.operand1 = operand1;
		this.operand2 = operand2;
	}
}
