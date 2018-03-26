package section2;

import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {

	// 2. Create a new Robot
Robot sese = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible

		// 5. Set the pen width to 5

		// 6. Use a for loop to repeat steps #7 to #8, four times...
for (int i = 0; i < 4; i++) {
	drawSquare();
	sese.turn(90);
	
}
		// 7. Set the pen color to random
    sese.setRandomPenColor();
		// 1. Call the drawSquare() method
		
		
		// 8. Turn the robot 90 degrees to the right

	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
for (int i = 0; i < 4; i++) {
	        sese.miniaturize();
	        sese.sparkle();
	        sese.setSpeed(100);
            sese.penDown();
			sese.move(100);
			sese.turn(90);
			

		}
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
