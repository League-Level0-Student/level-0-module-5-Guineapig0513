package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class sigma {

	public static void main(String[] args) {
		String numberString = JOptionPane.showInputDialog("Tell me a number! Any number!!");
		int number = Integer.parseInt(numberString); 
		for(int i = 2; i<number; i++) {
			if(number%i==0) {
				JOptionPane.showMessageDialog(null, "The number "+number+ " is NOT a prime number :)!! Thank you for playing :D!!");
				System.exit(0);
			}

		}
		
			JOptionPane.showMessageDialog(null, "The number " +number+" IS a prime number :0! Thank you for playing :p!!");
				
	}

}
