package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "You walk into the local petco looking for a young and bright new pet and walk to a employee");
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
		int e = JOptionPane.showOptionDialog(null, "Employee:  Hello welcome to the local petco we have many variacions here! :D" ,"The local petco" ,JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, 
				new String[] {"Beta fish", "Puppy", "Kitten", "Baby guinea pig"}, null);
		String name = JOptionPane.showInputDialog("Employee: Great choice! What will you name it?");
		JOptionPane.showMessageDialog(null, "Good luck with "+name+ "! Its a lovely name! :D");
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		for(int i = 0; i < 7; i++) {
			
		
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "You now have this breathing living creature in your house what will you do with it?", "Your House", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Pet + Cuddle", "Feed+ Give water", "Take a Walk", "Groom", "Clean up poop" }, null);

			// 6. Use user input to call the appropriate method created in step 5 below. 

			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}
	}

	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}