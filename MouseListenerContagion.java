import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.MouseListener;


public class MouseListenerContagion extends JFrame implements MouseListener {
	private int RectWidth = 100; 
	private int RectHeight = 40;
	private int newGameRectX = 400;
	private int newGameRectY = 280;
	private int newGameTextX = 420; 
	private int newGameTextY = 305; 
	private int quitRectX = 400;
	private int quitRectY = 350;
	private int quitTextX = 438;
	private int quitTextY = 375;
	
	public MouseListenerContagion() {
      JLabel label = new JLabel();  
      label.setIcon(new ImageIcon("C:\\Users\\rushi\\Desktop\\ICS ISP\\Example Logo.png"));
      label.setBounds(50, -80, 950, 350);
      add(label);
		addMouseListener(this);
		setSize(900, 600);
		setTitle("Contagion");
		setLayout(null);		
		setVisible(true);
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				new CloseWindow();
			}
		});
 	}
	
	public void mouseClicked(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {
		Graphics g = getGraphics();
		if(e.getX() > newGameRectX 
				&& e.getX() < newGameRectX + RectWidth 
				&& e.getY() > newGameRectY 
				&& e.getY() < newGameRectY + RectHeight) {		
			g.setColor(Color.CYAN);
			g.fillRect(newGameRectX, newGameRectY, RectWidth, RectHeight);
			g.setColor(Color.BLACK);
			g.drawString("New Game", newGameTextX, newGameTextY);
			new BeginnerLevel();
			dispose();
		}
		if (e.getX() > quitRectX 
				&& e.getX() < quitRectX + RectWidth 
				&& e.getY() > quitRectY 
				&& e.getY() < quitRectY + RectHeight) {
			g.setColor(Color.PINK);
			g.fillRect(quitRectX, quitRectY, RectWidth, RectHeight);
			g.setColor(Color.BLACK);
			g.drawString("Quit", quitTextX, quitTextY);
			new CloseWindow();
			dispose();
		}
	}	
	public void mouseReleased(MouseEvent e) {
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
	public void mouseEntered(MouseEvent e) {
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
	public void mouseExited(MouseEvent e) {
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
