import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.MouseListener;	


public class BeginnerLevel extends JFrame implements MouseListener {
	
	private int continueRectX = 850; 
 	private int continueRectY = 590;
 	private int goBackRectX = 50;
 	private int goBackRectY = 590;
 	private int rectWidth = 100; 
	private int rectHeight = 40;
  	private int continueTextX = 877;
  	private int continueTextY = 615;
  	private int goBackTextX = 75;
  	private int goBackTextY = 615;
  	private int windowName = 3;
	
	public BeginnerLevel() {
      JLabel label = new JLabel();  
      label.setIcon(new ImageIcon("C:\\Users\\athar\\eclipse-workspace\\Contagion\\src\\Example Logo.png"));
      label.setBounds(120, -100, 950, 350);
      add(label);
      addMouseListener(this);
      setSize(1000, 650);
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
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
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
			new BeginnerLevelQuestion1();
			dispose();
		}
		if(e.getX() > goBackRectX 
				&& e.getX() < goBackRectX + rectWidth 
				&& e.getY() > goBackRectY 
				&& e.getY() < goBackRectY + rectHeight) {		
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(goBackRectX, goBackRectY, rectWidth, rectHeight);
			g.setColor(Color.BLACK);
			g.drawString("Go Back", goBackTextX, goBackTextY);
			new BeginnerLevelInstructions();
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
		g.fillRect(continueRectX, continueRectY, rectWidth, rectHeight);
		g.fillRect(goBackRectX, goBackRectY, rectWidth, rectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Continue", continueTextX, continueTextY);
		g.drawString("Go Back", goBackTextX, goBackTextY);
		g.drawRect(100, 200, 800, 375);
		g.drawLine(300, 200, 300, 575);
		g.drawLine(600, 200, 600, 575);
		g.drawLine(100, 245, 900, 245);
		g.drawLine(100, 355, 900, 355);
		g.drawLine(100, 465, 900, 465);
	}
	
}
