/*
Name: Atharva Bhalerao, Rushi Barot
Date: Monday, June 15, 2020
Teacher: Ms. Krasteva
Description: This class displays the information and the instructions for the test level.
*/

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.MouseListener;

public class TestLevel extends JFrame implements MouseListener {

	private int continueRectX = 850; 
	private int continueRectY = 575;
	private int RectWidth = 100; 
	private int RectHeight = 40;
	private int continueTextX = continueRectX + 25;
	private int continueTextY = continueRectY + 25;
	private int windowName = 7;

	public TestLevel() {
		JLabel label = new JLabel();  
		label.setIcon(new ImageIcon("Images/Example Logo.png"));
		label.setBounds(120, -100, 950, 350);
		add(label);
		Font font1 = new Font("Monospaced", Font.PLAIN, 14);
		JTextArea area = new JTextArea("Your Instructions:\n"
				+ "There is an outbreak of two different viruses at the gym: Ironbark Syndrome and Shadowpox.\n\n"
				+ "Iron Bark\n"
				+ "Symptoms: Red Face, Shivers, Coughing.\n"
				+ "Transmission: Through the air.\n"
				+ "Prevention: Face Masks and staying 2 metres apart stops the spread of Ironbark.\n\n"
				+ "Shadowpox\n"
				+ "Symptoms: Dark spots on face, sneezing, sweating.\n"
				+ "Transmission: Through body fluids - saliva, sweat, blood.\n"
				+ "Prevention: Wear gloves if you must touch the person, and avoid surfaces the person has\ntouched.\n\n"
				+ "You will come across three gym members who may or may not show any indication of the \nviruses. Your job is to protect yourself from the viruses.\n\n"
				+ "This information will not be available while you are going through the test! Good Luck!");
		area.setEditable(false);
		area.setBounds(80, 150, 800, 375);
		area.setFont(font1);
		add(area);
		addMouseListener(this);
		setSize(1000, 650);
      setTitle("Test Level Instructions");
		setLayout(null);
		setVisible(true);
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				new CloseWindow(windowName);
			}
		});
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		Graphics g = getGraphics();
		if(e.getX() > continueRectX 
				&& e.getX() < continueRectX + RectWidth 
				&& e.getY() > continueRectY 
				&& e.getY() < continueRectY + RectHeight) {		
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(continueRectX, continueRectY, RectWidth, RectHeight);
			g.setColor(Color.BLACK);
			g.drawString("Continue", continueTextX, continueTextY);
			new TestLevelQuestion();
			dispose();
		}	
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		Graphics g = getGraphics();
		g.setColor(Color.GRAY);
		g.fillRect(continueRectX, continueRectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Continue", continueTextX, continueTextY);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		Graphics g = getGraphics();
		g.setColor(Color.GRAY);
		g.fillRect(continueRectX, continueRectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Continue", continueTextX, continueTextY);		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		Graphics g = getGraphics();
		g.setColor(Color.GRAY);
		g.fillRect(continueRectX, continueRectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Continue", continueTextX, continueTextY);		
	}
}
