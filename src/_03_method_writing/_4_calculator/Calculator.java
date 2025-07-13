package _03_method_writing._4_calculator;

import javax.swing.JOptionPane;

public class Calculator {

	
	public static void main(String[] args) {
		String input1 = JOptionPane.showInputDialog("Enter a number");
		String input2 = JOptionPane.showInputDialog("Enter another number");
		int number1 = Integer.parseInt(input1);
		int number2 = Integer.parseInt(input2);
		int task = JOptionPane.showOptionDialog(null, "What do you choose?", "Calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "divide", "multiply", "subtract", "add" }, null);

		
		double answer = 0;
		if(task == 0) {
			 answer =  divide(number1, number2);
		}
		
		if(task == 1) {
			answer = multiply(number1, number2);
		}
		
		if(task == 2) {
			answer = subtract(number1, number2);
		}
		
		if(task == 3) {
			answer = add(number1, number2);
		}
		// 4) Call the result() method and put the answer in a pop-up\
		System.out.println(answer);
		JOptionPane.showMessageDialog(null, result(answer));
	}
	
	 static double divide(int num1, int num2) {
		 return num1 / num2;
	 }
	 
	 static double subtract(int num1, int num2) {
		 return num1 - num2;
	 }
	 
	 static double multiply(int num1, int num2) {
		 return num1 * num2;
	 }
	 
	 static double add(int num1, int num2) {
		 return num1 + num2;
	 }
	 
	 static String result(double number) {
		return "Your answer is " + number;
	 }
	
}
