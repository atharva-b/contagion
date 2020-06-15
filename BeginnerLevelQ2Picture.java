/*
Name: Atharva Bhalerao, Rushi Barot
Date: Monday, June 15, 2020
Teacher: Ms. Krasteva
Description: This class displays a picture for the beginner level question 2 in a new JFrame.
*/

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.MouseListener;

public class BeginnerLevelQ2Picture extends JFrame implements MouseListener {

	private int RectWidth = 100; 
	private int RectHeight = 40;
	private int exitRectX = 200;
	private int exitRectY = 340;
	private int exitTextX = 240;
	private int exitTextY = 365;

	public BeginnerLevelQ2Picture() {      
		JLabel label = new JLabel();  
		label.setIcon(new ImageIcon("C:\\Users\\athar\\eclipse-workspace\\Contagion\\src\\Pictures\\BeginnerLevelQ2Picture.png"));
		label.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\rushi\\Desktop\\ICS ISP\\Pictures\\BeginnerLevelQ2Picture.png").getImage().getScaledInstance(360, 270, Image.SCALE_DEFAULT)));		
		label.setBounds(65, 0, 600, 300);
		add(label);
		addMouseListener(this);
		setLocation(250,150);
		setSize(500, 400);
      setTitle("Picture for Beginner Level Question 2");
		setLayout(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		drawGraphics();		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		Graphics g = getGraphics();
		drawGraphics();
		if(e.getX() > exitRectX 
				&& e.getX() < exitRectX + RectWidth 
				&& e.getY() > exitRectY 
				&& e.getY() < exitRectY + RectHeight) {		
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(exitRectX, exitRectY, RectWidth, RectHeight);
			g.setColor(Color.BLACK);
			g.drawString("Exit", exitTextX, exitTextY);
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

	public void drawGraphics() {
		Graphics g = getGraphics();
		g.setColor(Color.GRAY);
		g.fillRect(exitRectX, exitRectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Exit", exitTextX, exitTextY);  
	}  
}
