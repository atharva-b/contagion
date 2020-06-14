import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.MouseListener;

public class BeginnerLevelInstructions extends JFrame implements MouseListener{

	private int continueRectX = 175;
	private int continueRectY = 510;
	private int mainMenuRectX = 50;
	private int mainMenuRectY = continueRectY;
	private int rectWidth = 100;
	private int rectHeight = 40;
	private int continueTextX = 200;
	private int continueTextY = 535;
	private int mainMenuTextX = 70;
	private int mainMenuTextY = continueTextY;
	private int windowName = 2;


	public BeginnerLevelInstructions() {
		addMouseListener(this);
		JLabel label = new JLabel();  
		//label.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\athar\\eclipse-workspace\\Contagion\\src\\Pictures\\Example Logo.png").getImage().getScaledInstance(530, 130, Image.SCALE_DEFAULT)));
		label.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\rushi\\Desktop\\ICS ISP\\Pictures\\Example Logo.png").getImage().getScaledInstance(530, 130, Image.SCALE_DEFAULT)));
      label.setBounds(260, 325, 950, 350);
		add(label);
		setSize(800, 600);
		setTitle("Contagion");
		setLayout(null);
		Font font1 = new Font("Monospaced", Font.BOLD, 20);
		JTextArea area=new JTextArea("Welcome to Contagion! \n\n"
				+ "For the Beginner Level, you will be given 2 scenarios:\none deals with the Flu and one deals with the Zika virus. \n\n"
				+ "Both scenarios revolve around a Fitness Centre setting,\nso keep that in mind!\n\n"
				+ "You will have to answer both questions based on the\ninformation given to you on the next page. \n\n\n\n"
				+ "Good Luck!");  
		area.setBounds(30,30,740,400);  
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
		// TODO Auto-generated method stub
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
			dispose();
			new BeginnerLevel();
		}
		if(e.getX() > mainMenuRectX 
				&& e.getX() < mainMenuRectX + rectWidth 
				&& e.getY() > mainMenuRectY 
				&& e.getY() < mainMenuRectY + rectHeight) {		
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(mainMenuRectX, mainMenuRectY, rectWidth, rectHeight);
			g.setColor(Color.BLACK);
			g.drawString("Main Menu", mainMenuTextX, mainMenuTextY);
			dispose();
			new MouseListenerContagion();
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		drawGraphics();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		drawGraphics();
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		drawGraphics();
	}

	public void drawGraphics() {
		Graphics g = getGraphics();
		g.setColor(Color.GRAY);
		g.fillRect(continueRectX, continueRectY, rectWidth, rectHeight);
		g.fillRect(mainMenuRectX, mainMenuRectY, rectWidth, rectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Continue", continueTextX, continueTextY);
		g.drawString("Main Menu", mainMenuTextX, mainMenuTextY);
	}

}
