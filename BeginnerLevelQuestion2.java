import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.MouseListener;

public class BeginnerLevelQuestion2 extends JFrame implements MouseListener {

	private int RectWidth = 250; 
	private int RectHeight = 60;
	private int RectWidth1 = 100; 
	private int RectHeight1 = 40;
	private int option1RectX = 175;
	private int option1RectY = 550;
	private int option1TextX = 255;
	private int option1TextY = 585;
	private int option2RectX = 535;
	private int option2RectY = 550;
	private int option2TextX = 590;
	private int option2TextY = 585;
	private int option3RectX = 175;
	private int option3RectY = 650;
	private int option3TextX = 250;
	private int option3TextY = 685;
	private int option4RectX = 535;
	private int option4RectY = 650;
	private int option4TextX = 610;
	private int option4TextY = 685;
	private int pictureRectX = 430;
	private int pictureRectY = 450;
	private int pictureTextX = 445;
	private int pictureTextY = 475;
	private int questionRectX = 200;
	private int questionRectY = 210;
	private int questionTextX = 210;
	private int questionTextY = 235;
	private int windowName = 5; 

	public BeginnerLevelQuestion2() {
		JLabel label = new JLabel();  
		//label.setIcon(new ImageIcon("C:\\Users\\athar\\eclipse-workspace\\Contagion\\src\\Pictures\\Example Logo.PNG"));
		label.setIcon(new ImageIcon("C:\\Users\\rushi\\Desktop\\ICS ISP\\Pictures\\Example Logo.png"));		
      label.setBounds(120, -80, 950, 350);
		add(label);
		addMouseListener(this);
		setSize(1000, 800);
		setLayout(null);
		Font font1 = new Font("Monospaced", Font.BOLD, 20);
		JTextArea question2 = new JTextArea("On which surfaces found in the\ngym is the Flu virus likely to\nstay on the longest?");
		question2.setEditable(false);
		question2.setFont(font1);
		question2.setBounds(320, 180, 400, 150);
		add(question2);
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				new CloseWindow(windowName);
			}
		});
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
		if(e.getX() > pictureRectX 
				&& e.getX() < pictureRectX + RectWidth1 
				&& e.getY() > pictureRectY 
				&& e.getY() < pictureRectY + RectHeight1) {		
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(pictureRectX, pictureRectY, RectWidth1, RectHeight1);
			g.setColor(Color.BLACK);
			g.drawString("Open Picture", pictureTextX, pictureTextY);
			new BeginnerLevelQ2Picture();
		} 	
      g.setFont(new Font("Monospaced", Font.BOLD, 20)); 	
		if(e.getX() > option1RectX 
				&& e.getX() < option1RectX + RectWidth 
				&& e.getY() > option1RectY 
				&& e.getY() < option1RectY + RectHeight) {		
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(option1RectX, option1RectY, RectWidth, RectHeight);
			g.setColor(Color.BLACK);
			g.drawString("Weights", option1TextX, option1TextY);
			new BeginnerLevelEnding();
			dispose();
		}
		if(e.getX() > option2RectX 
				&& e.getX() < option2RectX + RectWidth 
				&& e.getY() > option2RectY 
				&& e.getY() < option2RectY + RectHeight) {		
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(option2RectX, option2RectY, RectWidth, RectHeight);
			g.setColor(Color.BLACK);
			g.drawString("Paper Towels", option2TextX, option2TextY);
			new ErrorCheck();
		}
		if(e.getX() > option3RectX 
				&& e.getX() < option3RectX + RectWidth 
				&& e.getY() > option3RectY 
				&& e.getY() < option3RectY + RectHeight) {		
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(option3RectX, option3RectY, RectWidth, RectHeight);
			g.setColor(Color.BLACK);
			g.drawString("Clothing", option3TextX, option3TextY);
			new ErrorCheck();
		}
		if(e.getX() > option4RectX 
				&& e.getX() < option4RectX + RectWidth 
				&& e.getY() > option4RectY 
				&& e.getY() < option4RectY + RectHeight) {		
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(option4RectX, option4RectY, RectWidth, RectHeight);
			g.setColor(Color.BLACK);
			g.drawString("Yoga Mat", option4TextX, option4TextY);
			new ErrorCheck();
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
		g.drawRect(questionRectX, questionRectY, 70, RectHeight1);
		g.setColor(Color.BLACK);
		g.drawString("Question:", questionTextX, questionTextY);
		g.setColor(Color.GRAY);
		g.fillRect(pictureRectX, pictureRectY, RectWidth1, RectHeight1);
		g.setColor(Color.BLACK);
		g.drawString("Open Picture", pictureTextX, pictureTextY); 
      g.setFont(new Font("Monospaced", Font.BOLD, 20)); 
		g.setColor(Color.GRAY);
		g.fillRect(option1RectX, option1RectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Weights", option1TextX, option1TextY);
		g.setColor(Color.GRAY);
		g.fillRect(option2RectX, option2RectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Paper Towels", option2TextX, option2TextY);
		g.setColor(Color.GRAY);
		g.fillRect(option3RectX, option3RectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Clothing", option3TextX, option3TextY);
		g.setColor(Color.GRAY);
		g.fillRect(option4RectX, option4RectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Yoga Mat", option4TextX, option4TextY);         
	}
}
