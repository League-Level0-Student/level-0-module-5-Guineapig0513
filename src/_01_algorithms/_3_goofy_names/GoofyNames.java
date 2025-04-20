package _01_algorithms._3_goofy_names;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {
		String goofyName = "";

		// 1. Ask the user to enter their name
		String yay = JOptionPane.showInputDialog("Whats your name experiment 12- I mean someone I dont know?..");
		// 2. Print upper case name to the console using .toUpperCase()
		//    Run your program to see that this works.
		//System.out.println(yay.toUpperCase());
		// 3. Loop through each character of the name (steps 4 - 7).
		//    HINT: Use .length() to determine the number of characters in the String.
		for(int i = 0; i< yay.length(); i++) {


			// 4. Create a char variable to store the next character of the name
			//    use .charAt()

			char c = yay.charAt(i);
			// 5. Use MODULO operator (%) to identify if it is an EVEN or ODD character.
			if(i % 2 ==0) {
				goofyName  += Character.toUpperCase(c);
			}
			else {
				goofyName += Character.toLowerCase(c);
			}

				// 6. Even characters should be made uppercase and odd characters made lowercase
				//    HINT: use Character.toUpperCase() or Character.toLowerCase()


				// 7. ADD the char to the end of the goofyName String
		}
		JOptionPane.showMessageDialog(null, "*is doing something behind a curtain*");

		// 8. Use pop-up to show user their Goofy name
JOptionPane.showMessageDialog(null, "Thank you for the help with my work experiment 12- I mean "+goofyName+"! WHY DID I SAY IT THAT WEIRD AUGFIWEGFYE WHAT DID I DO WRONG?! Augh.. Nevermind.. have a terrible day >:(");
	}
}

