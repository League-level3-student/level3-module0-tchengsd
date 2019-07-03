package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		// 2. create an array of 5 robots.
		Robot[] robtos = new Robot[5];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robtos.length; i++) {
			robtos[i] = new Robot();
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up
		robtos[0].moveTo(100, 475);
		robtos[1].moveTo(200, 475);
		robtos[2].moveTo(300, 475);
		robtos[3].moveTo(400, 475);
		robtos[4].moveTo(500, 475);
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		Random rand = new Random();
		for (int i = 0; i < robtos.length; i++) {
			int rng = rand.nextInt(50);
			robtos[i].move(rng);
		}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
		boolean raceOngoing = true;
		while (raceOngoing) {
			for (int i = 0; i < robtos.length; i++) {
				int rng = rand.nextInt(50);
				robtos[i].move(rng);
				if (robtos[i].getY() <= 0) {
					raceOngoing = false;
					int winner = i + 1;
					JOptionPane.showMessageDialog(null, "Robot " + winner + " wins!");
					break;
				}
			}
		}

		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
	}
}