import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.MouseListener;

public class ErrorCheck extends JFrame implements MouseListener {
	
      private int RectWidth = 100; 
    	private int RectHeight = 40;
   	private int exitRectX = 50;
   	private int exitRectY = 80;
   	private int exitTextX = 90;
   	private int exitTextY = 105;
	
	public ErrorCheck() {      
      addMouseListener(this);
		setSize(200, 200);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
	   Graphics g = getGraphics();
		if(e.getX() > exitRectX 
				&& e.getX() < exitRectX + RectWidth 
				&& e.getY() > exitRectY 
				&& e.getY() < exitRectY + RectHeight) {		
			g.setColor(Color.GRAY);
			g.fillRect(exitRectX, exitRectY, RectWidth, RectHeight);
			g.setColor(Color.BLACK);
			g.drawString("Exit", exitTextX, exitTextY);
			new BeginnerLevelQuestion1();
			dispose();
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		Graphics g = getGraphics();
	   g.setColor(Color.GRAY);
		g.fillRect(exitRectX, exitRectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Exit", exitTextX, exitTextY);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		Graphics g = getGraphics();
		g.setColor(Color.GRAY);
		g.fillRect(exitRectX, exitRectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Exit", exitTextX, exitTextY);	
	}

	@Override
	public void mouseExited(MouseEvent e) {
		Graphics g = getGraphics();
		g.setColor(Color.GRAY);
		g.fillRect(exitRectX, exitRectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Exit", exitTextX, exitTextY);
	}
}
