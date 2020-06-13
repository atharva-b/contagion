import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.MouseListener;


public class MouseListenerContagion extends JFrame implements MouseListener {
	private int RectWidth = 150; 
	private int RectHeight = 40;
	private int newGameRectX = 325;
	private int newGameRectY = 300;
	private int newGameTextX = 370; 
	private int newGameTextY = 325; 
	private int quitRectX = 325;
	private int quitRectY = 360;
	private int quitTextX = 388;
	private int quitTextY = 385;
	private int windowName = 1;
	
	public MouseListenerContagion() {      
      JLabel label = new JLabel();  
      label.setIcon(new ImageIcon("C:\\Users\\athar\\eclipse-workspace\\Contagion\\src\\Example Logo.png"));
      label.setBounds(0, -100, 950, 350);
      add(label);
      addMouseListener(this);
      setSize(800, 600);
      setTitle("Contagion");
      setLayout(null);		
      setVisible(true);
      addWindowListener(new java.awt.event.WindowAdapter() {
    	  public void windowClosing(java.awt.event.WindowEvent e) {
    		  new CloseWindow(windowName);
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
			new BeginnerLevelInstructions();
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
			new CloseWindow(windowName);
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
