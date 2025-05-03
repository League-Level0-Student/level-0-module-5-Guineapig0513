package _02_nested_loops._3_for_loop_gauntlet;

public class I {

	public static void main(String[] args) {
		for(int i = 0; i <101; i++) {
			//		System.out.println(i);
		}
		for(int o = 100; o > -1; o--) {
			//System.out.println(o);
		}
		for(int i = 2; i <101; i++) {
			if(i % 2 == 0) {
				//System.out.println(i);
			}
		}
		for(int i = 1; i <100; i++) {
			if(i % 2 == 1) {
				//System.out.println(i);
			}
		}
		for(int i = 0; i <501; i++) {
			if(i % 2 == 0) {
				//System.out.println(i + " is even :D.");
			}
			else {
				//System.out.println(i + " is odd :3.");
			}
		}
		for(int i = 0; i < 778; i++) {
			if(i % 7 == 0) {
				//System.out.println(i);
			}
		}
		for(int i = 2014; i < 2026; i++) {
			//System.out.println("In "+i+", I was "+(i - 2014)+" years old.");
		}
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				//System.out.println(i +" "+ j);			
				}
		}
		for(int i = 0; i <101; i++) {
			System.out.println(100 + i);
		}
	}
	
}