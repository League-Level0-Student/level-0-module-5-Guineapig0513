package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class ImAGummyBear {

	public static void main(String[] args) {
       		
Robot gerald = new Robot();
gerald.penDown();
gerald.moveTo(600, 300);
drawSquare(gerald);
gerald.moveTo(200, 400);
	drawTriangle(gerald);
	gerald.moveTo(125, 150);
	drawCircle(gerald);
	}
	
	public static void drawSquare(Robot robo) {
		robo.setSpeed(10);
		for(int i = 0; i < 4; i++) {
			robo.move(200);
			robo.turn(90);
			}
	}
	public static void drawTriangle(Robot tina) {
		tina.setSpeed(10);
		for(int o = 0; o < 3; o++) {
			tina.turn(120);
			tina.move(200);
		}
	}
	public static void drawCircle (Robot john) {
		john.setSpeed(1000);
		for(int p = 0; p < 360; p++) {
			john.move(2);
			john.turn(1);
		}
	}
}