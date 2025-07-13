package _04_practice._2_code_4_life;


import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Code4Life {
	public static void main(String[] args) {
		int e = JOptionPane.showOptionDialog(null,
				"How many hours have you spent coding this week?",
				null, 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "1-2", "3-4", "5+", "I dont know" },
				null);
		
		if(e == 0) {
		JOptionPane.showMessageDialog(null, "Stop spending so much time on youtube or tiktok or whatever and start coding now!!!");
		System.exit(0);
	}
		if(e == 1) {
			JOptionPane.showMessageDialog(null, "Your a coding ninja!!!");
			System.exit(0);
		}
		if(e == 2) {
			playBatmanTheme();
			displayBatman();
			System.exit(0);
		}
		int i = 0;
		if(e == 3) {
			i = JOptionPane.showOptionDialog(null,
					"Im gonna ask again... How many hours have you spent coding this week?",
					null, 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "1-2", "3-4", "5+", "I actually dont know." },
					null);
			
		}
		
		if(i == 0) {
			JOptionPane.showMessageDialog(null, "Stop spending so much time on youtube or tiktok or whatever and start coding now!!!");
			System.exit(0);
		}
			if(i == 1) {
				JOptionPane.showMessageDialog(null, "Your a coding ninja!!!");
				System.exit(0);
			}
			if(i == 2) {
				playBatmanTheme();
				displayBatman();
				System.exit(0);
			}
			int u = 0;
			if(i == 3) {
				u = JOptionPane.showOptionDialog(null,
						"JUST ANSWER THE QUESTION!! HOW MANY HOURS HAVE YOU SPENT CODING THIS WEEK?????",
						null, 0, JOptionPane.INFORMATION_MESSAGE, null,
						new String[] { "1-2", "3-4", "5+", "Just leave me alone." },
						null);
			}
			if(u == 0) {
				JOptionPane.showMessageDialog(null, "Stop spending so much time on youtube or tiktok or whatever and start coding now!!!");
				System.exit(0);
			}
				if(u == 1) {
					JOptionPane.showMessageDialog(null, "Your a coding ninja!!!");
					System.exit(0);
				}
				if(u == 2) {
					playBatmanTheme();
					displayBatman();
					System.exit(0);
				}
				if(u == 3) {
					JOptionPane.showMessageDialog(null, "...");
					JOptionPane.showMessageDialog(null, "Fine. Since you wont answer my question.");
					System.exit(0);
				}
	}
	/***********  SOUND ***************
	 * Some computers are unable to play sounds. 
	 * If you cannot play sound on this computer, set canPlaySounds to false.
	 * If you are not sure, ask your teacher 
	 * *****************/
	static boolean canPlaySounds = true;
	
	
	// 1. Ask the user how many hours they spent coding this week.
	
	// 3. If it is greater than or equal to 3 AND less than or equal to 5, tell them
	// they're a Code Ninja

	// 4. If it is more than 5, call the playBatmanTheme  method, then 
	//    call the displayBatman method.



	
	private static void playBatmanTheme() {
	// NOTE: Download batman.wav from league-sounds on GitHub: https://github.com/jointheleague/league-sounds
	//	     Then put batman.wav into the "_2_code_4_life" project
	//       If you want to play a different audio, change the file name in the code below.
		if (canPlaySounds) {		
			File sound = new File("src/_04_practice/_2_code_4_life/batman_theme_x.wav");
			if (sound.exists()) {
				new Thread(() -> {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sound));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength()/1000);
				}
				catch (Exception e) {
					System.out.println("Could not play this sound");
				}}).start();
	 		}
			else {
				System.out.println("File does not exist");
			}
		}
	}
	
	private static void displayBatman() {		
		ImageIcon icon = new ImageIcon("src/_04_practice/_2_code_4_life/batman.png");
		JOptionPane.showMessageDialog(null, "", "You must be Batman!", 0, icon);
	}
	

}
