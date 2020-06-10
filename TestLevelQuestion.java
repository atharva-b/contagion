import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.MouseListener;

public class TestLevelQuestion extends JFrame implements MouseListener {
	
      private int RectWidth = 100; 
    	private int RectHeight = 40;
   	private int option1RectX = 250;
   	private int option1RectY = 450;
   	private int option1TextX = 252;
   	private int option1TextY = 475;
   	private int option2RectX = 600;
   	private int option2RectY = 450;
   	private int option2TextX = 615;
   	private int option2TextY = 475;      
   	private int option3RectX = 250;
   	private int option3RectY = 550;
   	private int option3TextXa = 260;
   	private int option3TextYa = 567;
      private int option3TextXb = 285;
   	private int option3TextYb = 583;
   	private int option4RectX = 600;
   	private int option4RectY = 550;
   	private int option4TextX = 610;
   	private int option4TextY = 575;
      private int submitRectX = 425;
   	private int submitRectY = 650;
   	private int submitTextX = 455;
   	private int submitTextY = 675;
	
	public TestLevelQuestion() {
      JLabel label = new JLabel();  
      label.setIcon(new ImageIcon("C:\\Users\\rushi\\Desktop\\ICS ISP\\Example Logo.png"));
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
		if(e.getX() > option1RectX 
				&& e.getX() < option1RectX + RectWidth 
				&& e.getY() > option1RectY 
				&& e.getY() < option1RectY + RectHeight) {		
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(option1RectX, option1RectY, RectWidth, RectHeight);
			g.setColor(Color.BLACK);
			g.drawString("Put on Face Mask", option1TextX, option1TextY);
			//new ErrorCheck();
			dispose();
		}
      if(e.getX() > option2RectX 
				&& e.getX() < option2RectX + RectWidth 
				&& e.getY() > option2RectY 
				&& e.getY() < option2RectY + RectHeight) {		
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(option2RectX, option2RectY, RectWidth, RectHeight);
			g.setColor(Color.BLACK);
			g.drawString("Wear Gloves", option2TextX, option2TextY);
			//new ErrorCheck();
			dispose();
		}
      if(e.getX() > option3RectX 
				&& e.getX() < option3RectX + RectWidth 
				&& e.getY() > option3RectY 
				&& e.getY() < option3RectY + RectHeight) {		
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(option3RectX, option3RectY, RectWidth, RectHeight);
			g.setColor(Color.BLACK);
			g.drawString("Stand 2 Metres", option3TextXa, option3TextYa);
         g.drawString("Apart", option3TextXb, option3TextYb);
			//new ErrorCheck();
			dispose();
		}
      if(e.getX() > option4RectX 
				&& e.getX() < option4RectX + RectWidth 
				&& e.getY() > option4RectY 
				&& e.getY() < option4RectY + RectHeight) {		
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(option4RectX, option4RectY, RectWidth, RectHeight);
			g.setColor(Color.BLACK);
			g.drawString("Clean Surfaces", option4TextX, option4TextY);
			//new BeginnerLevelEnding();
			dispose();
		}
         if(e.getX() > submitRectX 
   			&& e.getX() < submitRectX + RectWidth 
			   && e.getY() > submitRectY 
				&& e.getY() < submitRectY + RectHeight) {		
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(submitRectX, submitRectY, RectWidth, RectHeight);
			g.setColor(Color.BLACK);
			g.drawString("Submit", submitTextX, submitTextY);
			new TestLevelFinalScreen();
			dispose();
 		}	
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		Graphics g = getGraphics();
      g.setColor(Color.GRAY);
		g.fillRect(option1RectX, option1RectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Put on Face Mask", option1TextX, option1TextY);
		g.setColor(Color.GRAY);
      g.fillRect(option2RectX, option2RectY, RectWidth, RectHeight);
   	g.setColor(Color.BLACK);
		g.drawString("Wear Gloves", option2TextX, option2TextY);
      g.setColor(Color.GRAY);
		g.fillRect(option3RectX, option3RectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Stand 2 Metres", option3TextXa, option3TextYa);
      g.drawString("Apart", option3TextXb, option3TextYb);
 		g.setColor(Color.GRAY);
		g.fillRect(option4RectX, option4RectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Clean Surfaces", option4TextX, option4TextY);
      g.setColor(Color.GRAY);
		g.fillRect(submitRectX, submitRectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Submit", submitTextX, submitTextY);     
	}

	@Override
	public void mouseEntered(MouseEvent e) {
      Graphics g = getGraphics();
      g.setColor(Color.GRAY);
		g.fillRect(option1RectX, option1RectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Put on Face Mask", option1TextX, option1TextY);
		g.setColor(Color.GRAY);
      g.fillRect(option2RectX, option2RectY, RectWidth, RectHeight);
   	g.setColor(Color.BLACK);
		g.drawString("Wear Gloves", option2TextX, option2TextY);
      g.setColor(Color.GRAY);
		g.fillRect(option3RectX, option3RectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Stand 2 Metres", option3TextXa, option3TextYa);
      g.drawString("Apart", option3TextXb, option3TextYb);
      g.setColor(Color.GRAY);
		g.fillRect(option4RectX, option4RectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Clean Surfaces", option4TextX, option4TextY);
      g.setColor(Color.GRAY);
		g.fillRect(submitRectX, submitRectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Submit", submitTextX, submitTextY);     	
	}

	@Override
	public void mouseExited(MouseEvent e) {
		Graphics g = getGraphics();
      g.setColor(Color.GRAY);
		g.fillRect(option1RectX, option1RectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Put on Face Mask", option1TextX, option1TextY);
		g.setColor(Color.GRAY);
      g.fillRect(option2RectX, option2RectY, RectWidth, RectHeight);
   	g.setColor(Color.BLACK);
		g.drawString("Wear Gloves", option2TextX, option2TextY);
      g.setColor(Color.GRAY);
		g.fillRect(option3RectX, option3RectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Stand 2 Metres", option3TextXa, option3TextYa);
      g.drawString("Apart", option3TextXb, option3TextYb);
      g.setColor(Color.GRAY);
		g.fillRect(option4RectX, option4RectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Clean Surfaces", option4TextX, option4TextY);
      g.setColor(Color.GRAY);
		g.fillRect(submitRectX, submitRectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Submit", submitTextX, submitTextY);    		
	}
}
