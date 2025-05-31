package _03_method_writing._1_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ImAGummyBear {

	public static void main(String[] args) {

		Robot gerald = new Robot();
		gerald.penDown();
		int uh = JOptionPane.showOptionDialog(null, "Gerald wants too draw a basic shape. Which shape should he draw? " ,"does anyone see this???" ,JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, 
				new String[] {"Can Gerald please draw a circle?", "Can Gerald please draw a triangle", "Can Gerald please draw a square?"}, null);

		String shape = "";
		if(uh == 2) {
			shape = "Square";

		}
		else if(uh == 1) {
			shape = "Triangle";
		}
		else {
			shape = "Circle";
		}
		int e = JOptionPane.showOptionDialog(null, shape+"? interesting.. Now gerald wants you to choose one of the primary colors that he would draw in." ,"I like slope 3 its fun" ,JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, 
				new String[] {"Yellow sounds nice", "Blue sounds nice", "Red sounds nice"}, null);
		Color pencil = null;
		if(e == 2) {
			pencil = Color.RED;
		}
		else if(e == 1) {
			pencil = Color.BLUE;
		}
		else {
			pencil = Color.YELLOW;
		}
		
		
		if(uh == 2) {
			drawSquare(gerald, pencil);
		}
		else if(uh == 1) {
			drawTriangle(gerald, pencil);
		}
		else {
			drawCircle(gerald, pencil);
		}

	}

	public static void drawSquare(Robot robo, Color color) {
		robo.setSpeed(10);
		robo.setPenColor(color);
		for(int i = 0; i < 4; i++) {
			robo.move(200);
			robo.turn(90);
		}
	}
	public static void drawTriangle(Robot tina, Color color) {
		tina.setSpeed(10);
		tina.setPenColor(color);
		for(int o = 0; o < 3; o++) {
			tina.turn(120);
			tina.move(200);
		}
	}
	public static void drawCircle (Robot john, Color color) {
		john.setPenColor(color);
		john.setSpeed(1000);
		for(int p = 0; p < 360; p++) {
			john.move(2);
			john.turn(1);
		}
	}
}