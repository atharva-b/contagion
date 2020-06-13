import java.awt.*;
import java.awt.event.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;


public class MouseListenerContagion extends JFrame implements MouseListener {
	private int RectWidth = 100; 
	private int RectHeight = 40;
	private int newGameRectX = 450;
	private int newGameRectY = 400;
	private int newGameTextX = 470; 
	private int newGameTextY = 425; 
	private int quitRectX = 450;
	private int quitRectY = 460;
	private int quitTextX = 488;
	private int quitTextY = 485;
	
	public MouseListenerContagion() {      
      JLabel label = new JLabel();  
      //label.setIcon(new ImageIcon("C:\\Users\\athar\\eclipse-workspace\\Contagion\\src\\Example Logo.png"));
      label.setIcon(new ImageIcon("C:\\Users\\rushi\\Desktop\\ICS ISP\\Pictures\\Example Logo.png"));
      label.setBounds(120, -100, 950, 350);
      add(label);
		addMouseListener(this);
		setSize(1000, 800);
		setTitle("Contagion");
		setLayout(null);		
		setVisible(true);
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				new CloseWindow();
			}
		});
 	}
	
	public void mouseClicked(MouseEvent e) {
		drawGraphics();
	}
	public void mousePressed(MouseEvent e) {
		Graphics g = getGraphics();
		drawGraphics();
		if(e.getX() > newGameRectX 
				&& e.getX() < newGameRectX + RectWidth 
				&& e.getY() > newGameRectY 
				&& e.getY() < newGameRectY + RectHeight) {		
			g.setColor(Color.CYAN);
			g.fillRect(newGameRectX, newGameRectY, RectWidth, RectHeight);
			g.setColor(Color.BLACK);
			g.drawString("New Game", newGameTextX, newGameTextY);
			dispose();
			new BeginnerLevel();
		}
		if (e.getX() > quitRectX 
				&& e.getX() < quitRectX + RectWidth 
				&& e.getY() > quitRectY 
				&& e.getY() < quitRectY + RectHeight) {
			g.setColor(Color.PINK);
			g.fillRect(quitRectX, quitRectY, RectWidth, RectHeight);
			g.setColor(Color.BLACK);
			g.drawString("Quit", quitTextX, quitTextY);
			dispose();
			new CloseWindow();
		}
	}	
	public void mouseReleased(MouseEvent e) {
		drawGraphics();
	}
	public void mouseEntered(MouseEvent e) {
		drawGraphics();
	}
	public void mouseExited(MouseEvent e) {
		drawGraphics();
	}	
	
	public void drawGraphics() {
		Graphics g = getGraphics();
		g.setColor(Color.BLUE);
		g.fillRect(newGameRectX, newGameRectY, RectWidth, RectHeight);
		g.setColor(Color.WHITE);
		g.drawString("New Game", newGameTextX, newGameTextY);
		g.setColor(Color.RED);
		g.fillRect(quitRectX, quitRectY, RectWidth, RectHeight);
		g.setColor(Color.WHITE);
		g.drawString("Quit", quitTextX, quitTextY);
	}
}
