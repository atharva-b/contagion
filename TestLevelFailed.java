import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.MouseListener;

public class TestLevelFailed extends JFrame implements MouseListener {

	private int RectWidth = 100; 
	private int RectHeight = 40;
	private int backToTestRectX = 425;
	private int backToTestRectY = 500;
	private int backToTestTextX = backToTestRectX + 15;
	private int backToTestTextY = backToTestRectY + 25;
	private int windowName = 10;

	public TestLevelFailed() {
		JLabel label = new JLabel();  
		//label.setIcon(new ImageIcon("C:\\Users\\rushi\\Desktop\\ICS ISP\\Pictures\\Example Logo.png"));
		label.setIcon(new ImageIcon("C:\\Users\\athar\\eclipse-workspace\\Contagion\\src\\Pictures\\Example Logo.png"));
		label.setBounds(120, -80, 950, 350);
		add(label);
		Font font1 = new Font("Monospaced", Font.BOLD, 20);
		JTextArea area = new JTextArea("Sorry!\n\n"
				+ "You got the answer wrong.\n\n\n\n\n\n"
				+ "Go back to the start of the test to try again.");
		area.setEditable(false);
		area.setFont(font1);
		area.setBounds(80, 150, 840, 300);
		add(area);
		addMouseListener(this);
		setSize(1000, 600);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				new CloseWindow(windowName);
			}
		});
	}

	public void drawGraphics() {
		Graphics g = getGraphics();
		g.setColor(Color.GRAY);
		g.fillRect(backToTestRectX, backToTestRectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Back to Test", backToTestTextX, backToTestTextY);  
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		drawGraphics();
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
}
