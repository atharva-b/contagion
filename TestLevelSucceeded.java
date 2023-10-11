/*
Name: Atharva Bhalerao, Rushi Barot
Date: Monday, June 15, 2020
Teacher: Ms. Krasteva
Description: This class displays the screen shown when the user gets all test questions correct.
*/

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.MouseListener;

public class TestLevelSucceeded extends JFrame implements MouseListener {

	private int RectWidth = 100; 
	private int RectHeight = 40;
	private int mainMenuRectX = 425;
	private int mainMenuRectY = 500;
	private int mainMenuTextX = mainMenuRectX + 20;
	private int mainMenuTextY = mainMenuRectY + 25;
	private int windowName = 9;

	public TestLevelSucceeded() {
		JLabel label = new JLabel();  
		
		label.setIcon(new ImageIcon("Images/Example Logo.png"));
		label.setBounds(120, -100, 950, 350);
		add(label);
		Font font1 = new Font("Monospaced", Font.BOLD, 20);
		JTextArea area = new JTextArea("Congratulations!\n\n"
				+ "You have completed the game. Hopefully you understand why it is\nimportant to learn about different viruses so that you can keep\nyourself and others safe.\n\n\n\n\n"
				+ "Thank you very much for playing!");
		area.setEditable(false);
		area.setFont(font1);
		area.setBounds(80, 150, 840, 300);
		add(area);
		addMouseListener(this);
		setSize(1000, 600);
      setTitle("Succeeded Message");
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				new CloseWindow(windowName);
			}
		});
	}

	
	public void drawGraphics() {
		Graphics g = getGraphics();
		g.setColor(Color.GRAY);
		g.fillRect(mainMenuRectX, mainMenuRectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Main Menu", mainMenuTextX, mainMenuTextY);  
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		drawGraphics();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		Graphics g = getGraphics();
		drawGraphics();
		if(e.getX() > mainMenuRectX 
				&& e.getX() < mainMenuRectX + RectWidth 
				&& e.getY() > mainMenuRectY 
				&& e.getY() < mainMenuRectY + RectHeight) {		
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(mainMenuRectX, mainMenuRectY, RectWidth, RectHeight);
			g.setColor(Color.BLACK);
			g.drawString("Main Menu", mainMenuTextX, mainMenuTextY);
			new MouseListenerContagion();
			dispose();
		}	
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		drawGraphics();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		drawGraphics();
	}

	@Override
	public void mouseExited(MouseEvent e) {
		drawGraphics();
	}
}