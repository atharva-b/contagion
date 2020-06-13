import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.MouseListener;

public class BeginnerLevelQ1Picture extends JFrame implements MouseListener {
	
      private int RectWidth = 100; 
    	private int RectHeight = 40;
   	private int exitRectX = 100;
   	private int exitRectY = 240;
   	private int exitTextX = 140;
   	private int exitTextY = 265;
	
	public BeginnerLevelQ1Picture() {      
      JLabel label = new JLabel();  
      label.setIcon(new ImageIcon("C:\\Users\\rushi\\Desktop\\ICS ISP\\Pictures\\BeginnerLevelQ1Picture.jpg"));
      label.setBounds(20, 20, 250, 160);
      add(label);
      addMouseListener(this);
      setLocation(350,200);
      setSize(300, 300);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
