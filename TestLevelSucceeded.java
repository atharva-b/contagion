import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.MouseListener;

public class TestLevelSucceeded extends JFrame implements MouseListener {
	
      private int RectWidth = 100; 
    	private int RectHeight = 40;
      private int mainMenuRectX = 425;
   	private int mainMenuRectY = 650;
   	private int mainMenuTextX = 445;
   	private int mainMenuTextY = 675;
	
	public TestLevelSucceeded() {
      JLabel label = new JLabel();  
      label.setIcon(new ImageIcon("C:\\Users\\rushi\\Desktop\\ICS ISP\\Pictures\\Example Logo.png"));
      label.setBounds(120, -80, 950, 350);
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
		Graphics g = getGraphics();
      g.setColor(Color.GRAY);
		g.fillRect(mainMenuRectX, mainMenuRectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Main Menu", mainMenuTextX, mainMenuTextY);  
	}

	@Override
	public void mouseEntered(MouseEvent e) {
      Graphics g = getGraphics();
      g.setColor(Color.GRAY);
		g.fillRect(mainMenuRectX, mainMenuRectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Main Menu", mainMenuTextX, mainMenuTextY);  
	}

	@Override
	public void mouseExited(MouseEvent e) {
		Graphics g = getGraphics();
      g.setColor(Color.GRAY);
		g.fillRect(mainMenuRectX, mainMenuRectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Main Menu", mainMenuTextX, mainMenuTextY);     		
	}
}
