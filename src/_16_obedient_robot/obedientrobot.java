package _16_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedientrobot {
	static Robot walle = new Robot();
	public static void main(String[] args) {
	String color = JOptionPane.showInputDialog(null, "What color do you want your robot to display? Red, green or blue?");
	String shape = JOptionPane.showInputDialog(null, "What shape do you want your robot to draw?");
	if(color.equalsIgnoreCase("blue")) {
		walle.setPenColor(Color.BLUE);
	}
	else if(color.equalsIgnoreCase("green")) {
		walle.setPenColor(Color.GREEN);
	}
	else if(color.equalsIgnoreCase("red")) {
		walle.setPenColor(Color.RED);
	}
	if(shape.equalsIgnoreCase("square")) {
		drawSquare();
	}
	else if(shape.equalsIgnoreCase("triangle")) {
		drawTriangle();
	}
	else if(shape.equalsIgnoreCase("circle")) {
		drawCircle();
	}
	}

	static void drawSquare() {
		walle.penDown();
		walle.setSpeed(100);
		for(int i = 0;i<4;i++) {
			walle.move(100);
			walle.turn(90);
		}
	}
	static void drawTriangle() {
		walle.penDown();
		walle.setSpeed(100);
		walle.turn(25);
		walle.move(100);
		walle.turn(125);
		walle.move(100);
		walle.turn(118);
		walle.move(100);
	}
	static void drawCircle() {
		walle.penDown();
		walle.setSpeed(100);
		for(int i = 0;i<360;i++) {
			walle.move(1);
			walle.turn(1);
		}
	}
}
