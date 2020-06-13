import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.MouseListener;

public class BeginnerLevelInstructions extends JFrame implements MouseListener{
	
	private int continueRectX = 250;
	private int continueRectY = 525;
	private int mainMenuRectX = 50;
	private int mainMenuRectY = continueRectY;
	private int rectWidth = 100;
	private int rectHeight = 40;
	private int continueTextX = 275;
	private int continueTextY = 550;
	private int mainMenuTextX = 70;
	private int mainMenuTextY = continueTextY;
	private int windowName = 2;
	
	
	public BeginnerLevelInstructions() {
		addMouseListener(this);
		setSize(400, 600);
		setLocation (100, 25);
		setTitle("Contagion");
		setLayout(null);
		addWindowListener(new java.awt.event.WindowAdapter() {
	    	  public void windowClosing(java.awt.event.WindowEvent e) {
	    		  new CloseWindow(windowName);
	    		  }
	    	  });
		setVisible(true);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		drawGraphics();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		Graphics g = getGraphics();
		drawGraphics();
		if(e.getX() > continueRectX 
				&& e.getX() < continueRectX + rectWidth 
				&& e.getY() > continueRectY 
				&& e.getY() < continueRectY + rectHeight) {		
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(continueRectX, continueRectY, rectWidth, rectHeight);
			g.setColor(Color.BLACK);
			g.drawString("Continue", continueTextX, continueTextY);
			dispose();
			new BeginnerLevel();
		}
		if(e.getX() > mainMenuRectX 
				&& e.getX() < mainMenuRectX + rectWidth 
				&& e.getY() > mainMenuRectY 
				&& e.getY() < mainMenuRectY + rectHeight) {		
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(mainMenuRectX, mainMenuRectY, rectWidth, rectHeight);
			g.setColor(Color.BLACK);
			g.drawString("Main Menu", mainMenuTextX, mainMenuTextY);
			dispose();
			new MouseListenerContagion();
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		drawGraphics();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		drawGraphics();
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		drawGraphics();
	}
	
	public void drawGraphics() {
		Graphics g = getGraphics();
		g.setColor(Color.GRAY);
		g.fillRect(continueRectX, continueRectY, rectWidth, rectHeight);
		g.fillRect(mainMenuRectX, mainMenuRectY, rectWidth, rectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Continue", continueTextX, continueTextY);
		g.drawString("Main Menu", mainMenuTextX, mainMenuTextY);
	}
	
}