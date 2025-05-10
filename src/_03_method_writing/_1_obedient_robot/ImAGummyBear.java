package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class ImAGummyBear {

	public static void main(String[] args) {
       		
Robot gerald = new Robot();
gerald.penDown();
gerald.setSpeed(10);
drawSquare(gerald);
gerald.moveTo(200, 400);
	drawTriangle(gerald);
	}
	
	public static void drawSquare(Robot robo) {
		for(int i = 0; i < 4; i++) {
			robo.move(250);
			robo.turn(90);
			}
	}
	public static void drawTriangle(Robot tina) {
		for(int o = 0; o < 3; o++) {
			tina.turn(120);
			tina.move(150);
		}
	}
}