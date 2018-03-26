package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {

	public static void main(String[] args) {

		// START
		System.out.println("hello world");
		Robot c3po = new Robot();
		c3po.setPenColor(Color.pink);
		c3po.penDown();
		c3po.move(200);
		c3po.setSpeed(100);
		c3po.turn(90);
		c3po.move(100);
		c3po.turn(90);
		c3po.sparkle();
		c3po.move(200);
		c3po.sparkle();
		c3po.turn(90);
		c3po.move(100);
		for (int i = 0; i < 4; i++) {

		}

	}
}
