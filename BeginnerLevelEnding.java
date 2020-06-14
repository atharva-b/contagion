import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.MouseListener;

public class BeginnerLevelEnding extends JFrame implements MouseListener {

	private int continueRectX = 650; 
	private int continueRectY = 525;
	private int RectWidth = 100; 
	private int RectHeight = 40;
	private int continueTextX = 675;
	private int continueTextY = 550;
	private int windowName = 6;

	public BeginnerLevelEnding() {
		JLabel label = new JLabel();  
		//label.setIcon(new ImageIcon("C:\\Users\\rushi\\Desktop\\ICS ISP\\Pictures\\Example Logo.png"));
		label.setIcon(new ImageIcon("C:\\Users\\athar\\eclipse-workspace\\Contagion\\src\\Pictures\\Example Logo.png"));
		label.setBounds(0, -100, 950, 350);
		add(label);
		addMouseListener(this);
		setSize(800, 600);
		setLayout(null);
		Font font1 = new Font("Monospaced", Font.BOLD, 40);
		JTextArea area=new JTextArea(" Congratulations! You have \n  completed the learning \n    level successfully!");  
		area.setBounds (75,150,650,280);  
		area.setFont(font1);
		area.setEditable(false);
		add(area); 
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
		drawGraphics();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		Graphics g = getGraphics();
		drawGraphics();
		if(e.getX() > continueRectX 
				&& e.getX() < continueRectX + RectWidth 
				&& e.getY() > continueRectY 
				&& e.getY() < continueRectY + RectHeight) {		
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(continueRectX, continueRectY, RectWidth, RectHeight);
			g.setColor(Color.BLACK);
			g.drawString("Continue", continueTextX, continueTextY);
			new TestLevel();
			dispose();
		}	
	}

	public void drawGraphics() {
		Graphics g = getGraphics();
		g.setColor(Color.GRAY);
		g.fillRect(continueRectX, continueRectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Continue", continueTextX, continueTextY);
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
