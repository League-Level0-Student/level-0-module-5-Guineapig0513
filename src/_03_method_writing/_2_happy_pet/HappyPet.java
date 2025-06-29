package _03_method_writing._2_happy_pet;

import javax.swing.JOptionPane;

public class HappyPet {

	// 1. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,
				"You walk into the local petco looking for a young and bright new pet and walk to a employee");
		// 2. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		int e = JOptionPane.showOptionDialog(null,
				"Employee:  Hello welcome to the local petco we have many variacions here! :D", "The local petco",
				JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
				new String[] { "Beta fish", "Puppy", "Kitten", "Baby guinea pig" }, null);
		String name = JOptionPane.showInputDialog("Employee: Great choice! What will you name it?");
		JOptionPane.showMessageDialog(null, "Good luck with " + name + "! Its a lovely name! :D");
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		while (happinessLevel <= 100) {

			// 4. Use showOptionDialog to ask the user what they want to do to make their
			// pet happy
			// (eg: cuddle, food, water, take a walk, groom, clean up poop).
			// Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null,
					"You now have this breathing living creature in your house what will you do with it?", "Your House",
					0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Pet + Cuddle", "Feed + Give water", "Take a Walk", "Groom", "Clean Up The Cage/House", "Let out to the wild" },
					null);
			System.out.println(happinessLevel);
			if (task == 0) {
				cuddlebug(e);
			}
			if (task == 1) {
				atedrank(e);
			}
			if (task == 2) {
				waddling(e);
			}
			if (task == 3) {
				hairbrush(e);
			}
			if (task == 4) {
				nonstinky(e);
			}
			if (task == 5) {
				why(e);
			}
			JOptionPane.showMessageDialog(null, "Happiness percentage: "+happinessLevel+". Goal: 100% happy");
			// 6. Use user input to call the appropriate method created in step 5 below.

			// 7. If you determine the happiness level is large enough, tell the
			// user that he loves his pet and use break; to exit for loop.

		}
		JOptionPane.showMessageDialog(null, "Your pet is very happy :>");
	}

	private static void why(int e) {
		JOptionPane.showMessageDialog(null, "WHY... WHY... WHY DID YOU DO IT???? IF YOU HAD THE OPTION TO JUST DONT DO IT WHY????");
		JOptionPane.showMessageDialog(null, "Somewhere deep in the wild is your pets dead corpse... rotting due to your actions.. YOUR ACTIONS.");
		JOptionPane.showMessageDialog(null, "Remember your the cause a poor pet died. Remember in regret and sorrow..");
		System.exit(0);
	}

	private static void nonstinky(int e) {
		JOptionPane.showMessageDialog(null, "Your pet is happily now bouncing around the sparkly clean enclosure");
		happinessLevel += 25;
	}
	private static void hairbrush(int e) {
		if(e == 0) {
			JOptionPane.showMessageDialog(null, "Come on.. be reasonable.. You literally hurt your fish.");
			happinessLevel -= 75;
		}
		else {
			JOptionPane.showMessageDialog(null, "Your pet wasnt too amused but it felt okay to them but now they are sparkly clean :D!");
			happinessLevel += 10;
		}
		
	}

	private static void waddling(int e) {
		if(e == 0) {
			JOptionPane.showMessageDialog(null, "Your fish died... What did you expect?");
			happinessLevel -= 10000;
			System.exit(0);
		}
		else if(e == 3) {
			JOptionPane.showMessageDialog(null, "Trust me. Your guinea pig was NOT AMUSED.");
			happinessLevel -= 20;
		}
		else {
			JOptionPane.showMessageDialog(null, "Your pet is happy and curious outside :D but kinda lazy..");
			happinessLevel += 10;
		}
		
		
	}

	private static void atedrank(int e) {
		
		JOptionPane.showMessageDialog(null, "Great your pet is now happily eating and enjoying the water :)");
		happinessLevel += 20;
	}

	private static void cuddlebug(int e) {
		if(e == 0) {
			JOptionPane.showMessageDialog(null, "No comment.");
			happinessLevel -= 35;
		}
		else {
			JOptionPane.showMessageDialog(null, "Your pet is as snug as a bug and loves the pets :>!!");
			happinessLevel += 15;
		}
		
	}

	// 5. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
}