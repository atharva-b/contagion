import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.MouseListener;

public class BeginnerLevelIntermediate extends JFrame implements MouseListener {
	
   private int RectWidth = 100; 
	private int RectHeight = 40;
	private int continueRectX = 850; 
 	private int continueRectY = 730;
  	private int continueTextX = 875;
  	private int continueTextY = 755;
   private int goBackRectX = 50;
   private int goBackRectY = 730;
   private int goBackTextX = 75;
   private int goBackTextY = 755;
	
	public BeginnerLevelIntermediate() {
      JLabel label = new JLabel();  
      label.setIcon(new ImageIcon("C:\\Users\\rushi\\Desktop\\ICS ISP\\Pictures\\Example Logo.png"));
      label.setBounds(120, -100, 950, 350);
      add(label);
      addMouseListener(this);
		setSize(1000, 800);
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
		if(e.getX() > continueRectX 
				&& e.getX() < continueRectX + RectWidth 
				&& e.getY() > continueRectY 
				&& e.getY() < continueRectY + RectHeight) {		
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(continueRectX, continueRectY, RectWidth, RectHeight);
			g.setColor(Color.BLACK);
			g.drawString("Continue", continueTextX, continueTextY);
			new BeginnerLevelQuestion1();
			dispose();
		}
      if(e.getX() > goBackRectX 
				&& e.getX() < goBackRectX + RectWidth 
				&& e.getY() > goBackRectY 
				&& e.getY() < goBackRectY + RectHeight) {		
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(goBackRectX, goBackRectY, RectWidth, RectHeight);
			g.setColor(Color.BLACK);
			g.drawString("Go Back", goBackTextX, goBackTextY);
			new BeginnerLevel();
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
      g.setColor(Color.GRAY);
		g.fillRect(goBackRectX, goBackRectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Go Back", goBackTextX, goBackTextY);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		Graphics g = getGraphics();
		g.setColor(Color.GRAY);
		g.fillRect(continueRectX, continueRectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Continue", continueTextX, continueTextY);		
      g.setColor(Color.GRAY);
		g.fillRect(goBackRectX, goBackRectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Go Back", goBackTextX, goBackTextY);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		Graphics g = getGraphics();
		g.setColor(Color.GRAY);
		g.fillRect(continueRectX, continueRectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Continue", continueTextX, continueTextY);		
      g.setColor(Color.GRAY);
		g.fillRect(goBackRectX, goBackRectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Go Back", goBackTextX, goBackTextY);
	}
}
