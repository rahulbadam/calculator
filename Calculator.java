package calculator;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		int operand1, operand2;
		Scanner input = new Scanner(System.in);
		Calci cal = new Calci();
		while (true) {
			System.out.print("Enter the first operand: ");
			operand1 = input.nextInt();
			System.out.print("Enter the second operand: ");
			operand2 = input.nextInt();
			System.out.println("Enter the number of operation to be performed: \n");
			cal.operations();
			int choice = input.nextInt();
			if (choice == 1) {
				Addition obj = new Addition();
				obj.setOperands(operand1, operand2);
				System.out.println("Result of " + operand1 + " + " + operand2 + " is " + obj.getValue());
			} else if (choice == 2) {
				Substraction obj = new Substraction();
				obj.setOperands(operand1, operand2);
				System.out.println("Result of " + operand1 + " - " + operand2 + " is " + obj.getValue());
			} else if (choice == 3) {
				Multiplication obj = new Multiplication();
				obj.setOperands(operand1, operand2);
				System.out.println("Result of " + operand1 + " * " + operand2 + " is " + obj.getValue());
			} else if (choice == 4) {
				Divison obj = new Divison();
				obj.setOperands(operand1, operand2);
				System.out.println("Result of " + operand1 + " / " + operand2 + " is " + obj.getValue());
			} else {
				System.out.println("You entered a wrong choice. Please enter a value between 1 to 4");
				continue;
			}
			System.out.print("Do you want to perform one more operation (Y/N): ");
			char option = input.next().charAt(0);
			if (option == 'y' || option == 'Y')
				continue;
			else
				break;
		}
		input.close();
	}
}
