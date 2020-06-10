import java.awt.event.*;
import javax.swing.*;
import java.awt.event.MouseListener;
import java.awt.*;


public class CloseWindow extends JFrame implements MouseListener{

	private int RectWidth = 60; 
  	private int RectHeight = 40;
  	private int yesRectX = 70;
  	private int yesRectY = 120;
  	private int yesTextX = 88;
  	private int yesTextY = 145;
   private int noRectX = 170;
  	private int noRectY = 120;
  	private int noTextX = 193;
  	private int noTextY = 145;

	public CloseWindow() {
		addMouseListener(this);
  		setTitle("Contagion");
      setLocation(350,200);
      setSize(300, 200);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g) {
		g.drawString("Are you sure you want to exit?", 75, 90);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
	   Graphics g = getGraphics();
		if(e.getX() > yesRectX 
				&& e.getX() < yesRectX + RectWidth 
				&& e.getY() > yesRectY 
				&& e.getY() < yesRectY + RectHeight) {		
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(yesRectX, yesRectY, RectWidth, RectHeight);
			g.setColor(Color.BLACK);
			g.drawString("Yes", yesTextX, yesTextY);
			dispose();
		}
		if(e.getX() > noRectX 
				&& e.getX() < noRectX + RectWidth 
				&& e.getY() > noRectY 
				&& e.getY() < noRectY + RectHeight) {		
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(noRectX, noRectY, RectWidth, RectHeight);
			g.setColor(Color.BLACK);
			g.drawString("No", noTextX, noTextY);
			new MouseListenerContagion();
			dispose();
		}	
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		Graphics g = getGraphics();
		g.setColor(Color.GRAY);
		g.fillRect(yesRectX, yesRectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Yes", yesTextX, yesTextY);
		g.setColor(Color.GRAY);
		g.fillRect(noRectX, noRectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("No", noTextX, noTextY);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		Graphics g = getGraphics();
		g.setColor(Color.GRAY);
		g.fillRect(yesRectX, yesRectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Yes", yesTextX, yesTextY);
		g.setColor(Color.GRAY);
		g.fillRect(noRectX, noRectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("No", noTextX, noTextY);		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		Graphics g = getGraphics();
		g.setColor(Color.GRAY);
		g.fillRect(yesRectX, yesRectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Yes", yesTextX, yesTextY);
		g.setColor(Color.GRAY);
		g.fillRect(noRectX, noRectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("No", noTextX, noTextY);	
	}
		
   
}
