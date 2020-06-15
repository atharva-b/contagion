import javax.swing.JFrame;

/*
Name: Atharva Bhalerao, Rushi Barot
Date: Monday, June 15, 2020
Teacher: Ms. Krasteva
Description: This class is the driver the entire Contagion game.
 */

public class Driver {       
	public static void main (String[] args) {
		JFrame frame = new JFrame("Postplay Games Presents");
		Splashscreen sc = new Splashscreen();
		frame.add(sc);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(650, 650);
		frame.setVisible(true);
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {}
		frame.dispose();
		new MouseListenerContagion();
	}
}

