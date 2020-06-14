import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.MouseListener;

public class BeginnerLevelQuestion1 extends JFrame implements MouseListener {

	private int RectWidth = 100; 
	private int RectHeight = 40;
	private int option1RectX = 250;
	private int option1RectY = 550;
	private int option1TextX = 258;
	private int option1TextY = 575;
	private int option2RectX = 600;
	private int option2RectY = 550;
	private int option2TextXa = 615;
	private int option2TextYa = 567;
	private int option2TextXb = 630;
	private int option2TextYb = 583;      
	private int option3RectX = 250;
	private int option3RectY = 650;
	private int option3TextXa = 272;
	private int option3TextYa = 667;
	private int option3TextXb = 275;
	private int option3TextYb = 683;
	private int option4RectX = 600;
	private int option4RectY = 650;
	private int option4TextX = 608;
	private int option4TextY = 675;
	private int pictureRectX = 430;
	private int pictureRectY = 450;
	private int pictureTextX = 445;
	private int pictureTextY = 475;
	private int questionRectX = 200;
	private int questionRectY = 210;
	private int questionTextX = 210;
	private int questionTextY = 235;
	private int windowName = 4;


	public BeginnerLevelQuestion1() {
		JLabel label = new JLabel();  
		//label.setIcon(new ImageIcon("C:\\Users\\rushi\\Desktop\\ICS ISP\\Pictures\\Example Logo.png"));
		label.setIcon(new ImageIcon("C:\\Users\\athar\\eclipse-workspace\\Contagion\\src\\Pictures\\Example Logo.PNG"));
		label.setBounds(120, -80, 950, 350);
		add(label);
		addMouseListener(this);
		setSize(1000, 800);
		setLayout(null);
		Font font1 = new Font("Monospaced", Font.BOLD, 20);
		JTextArea question1 = new JTextArea("What is the best way for Kareena\nto protect herself and everyone\nin the gym from the Zika carrying\nmosquitos outside?");
		question1.setEditable(false);
		question1.setFont(font1);
		question1.setBounds(320, 180, 400, 150);
		add(question1);
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
		if(e.getX() > option1RectX 
				&& e.getX() < option1RectX + RectWidth 
				&& e.getY() > option1RectY 
				&& e.getY() < option1RectY + RectHeight) {		
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(option1RectX, option1RectY, RectWidth, RectHeight);
			g.setColor(Color.BLACK);
			g.drawString("Insect Repellent", option1TextX, option1TextY);
			new ErrorCheck();
		}
		if(e.getX() > option2RectX 
				&& e.getX() < option2RectX + RectWidth 
				&& e.getY() > option2RectY 
				&& e.getY() < option2RectY + RectHeight) {		
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(option2RectX, option2RectY, RectWidth, RectHeight);
			g.setColor(Color.BLACK);
			g.drawString("Long Sleeve", option2TextXa, option2TextYa);
			g.drawString("Clothes", option2TextXb, option2TextYb);
			new ErrorCheck();
		}
		if(e.getX() > option3RectX 
				&& e.getX() < option3RectX + RectWidth 
				&& e.getY() > option3RectY 
				&& e.getY() < option3RectY + RectHeight) {		
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(option3RectX, option3RectY, RectWidth, RectHeight);
			g.setColor(Color.BLACK);
			g.drawString("Close the", option3TextXa, option3TextYa);
			g.drawString("Windows", option3TextXb, option3TextYb);
			new ErrorCheck();
		}
		if(e.getX() > option4RectX 
				&& e.getX() < option4RectX + RectWidth 
				&& e.getY() > option4RectY 
				&& e.getY() < option4RectY + RectHeight) {		
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(option4RectX, option4RectY, RectWidth, RectHeight);
			g.setColor(Color.BLACK);
			g.drawString("All of the Above", option4TextX, option4TextY);
			new BeginnerLevelQuestion2();
			dispose();
		}
		if(e.getX() > pictureRectX 
				&& e.getX() < pictureRectX + RectWidth 
				&& e.getY() > pictureRectY 
				&& e.getY() < pictureRectY + RectHeight) {		
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(pictureRectX, pictureRectY, RectWidth, RectHeight);
			g.setColor(Color.BLACK);
			g.drawString("Open Picture", pictureTextX, pictureTextY);
			new BeginnerLevelQ1Picture();
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
		g.drawRect(questionRectX, questionRectY, 70, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Question:", questionTextX, questionTextY);
		g.setColor(Color.GRAY);
		g.fillRect(option1RectX, option1RectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Insect Repellent", option1TextX, option1TextY);
		g.setColor(Color.GRAY);
		g.fillRect(option2RectX, option2RectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Long Sleeve", option2TextXa, option2TextYa);
		g.drawString("Clothes", option2TextXb, option2TextYb);
		g.setColor(Color.GRAY);
		g.fillRect(option3RectX, option3RectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Close the", option3TextXa, option3TextYa);
		g.drawString("Windows", option3TextXb, option3TextYb);
		g.setColor(Color.GRAY);
		g.fillRect(option4RectX, option4RectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("All of the Above", option4TextX, option4TextY);  
		g.setColor(Color.GRAY);
		g.fillRect(pictureRectX, pictureRectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Open Picture", pictureTextX, pictureTextY);       
	}
}
