import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.MouseListener;

public class TestLevelFailed extends JFrame implements MouseListener {
	
      private int RectWidth = 100; 
    	private int RectHeight = 40;
      private int backToTestRectX = 425;
   	private int backToTestRectY = 650;
   	private int backToTestTextX = 440;
   	private int backToTestTextY = 675;
      private int windowName = 10;
	
	public TestLevelFailed() {
      JLabel label = new JLabel();  
      label.setIcon(new ImageIcon("C:\\Users\\rushi\\Desktop\\ICS ISP\\Pictures\\Example Logo.png"));
      label.setBounds(120, -80, 950, 350);
      add(label);
      addMouseListener(this);
		setSize(1000, 800);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
      Font font1 = new Font("Monospaced", Font.BOLD, 30);
		JTextArea message=new JTextArea("       You have been INFECTED! \n\n\n        You did not take the \n         proper precautions! \n\n\n        Stay safe next time!");  
		message.setBounds(150,225,650,350);  
		message.setFont(font1);
		message.setEditable(false);
		add(message);
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
		   if(e.getX() > backToTestRectX 
   			&& e.getX() < backToTestRectX + RectWidth 
			   && e.getY() > backToTestRectY 
				&& e.getY() < backToTestRectY + RectHeight) {		
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(backToTestRectX, backToTestRectY, RectWidth, RectHeight);
			g.setColor(Color.BLACK);
			g.drawString("Back to Test", backToTestTextX, backToTestTextY);
			new TestLevel();
			dispose();
 		}	
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		Graphics g = getGraphics();
      g.setColor(Color.GRAY);
		g.fillRect(backToTestRectX, backToTestRectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Back to Test", backToTestTextX, backToTestTextY);  
	}

	@Override
	public void mouseEntered(MouseEvent e) {
      Graphics g = getGraphics();
      g.setColor(Color.GRAY);
		g.fillRect(backToTestRectX, backToTestRectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Back to Test", backToTestTextX, backToTestTextY);  
	}

	@Override
	public void mouseExited(MouseEvent e) {
		Graphics g = getGraphics();
      g.setColor(Color.GRAY);
		g.fillRect(backToTestRectX, backToTestRectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Back to Test", backToTestTextX, backToTestTextY);     		
	}
}
