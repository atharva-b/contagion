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
		label.setIcon(new ImageIcon("C:\\Users\\athar\\eclipse-workspace\\Contagion\\src\\Pictures\\Example Logo.png"));
		label.setIcon(new ImageIcon("C:\\Users\\rushi\\Desktop\\ICS ISP\\Pictures\\Example Logo.png"));
		label.setBounds(120, -100, 950, 350);
		add(label);
		addMouseListener(this);
		setSize(1000, 650);
		setLayout(null);
		Font headerFont = new Font("Monospaced", Font.BOLD, 20);
		Font bodyFont = new Font("Monospaced", Font.PLAIN, 13);
		JTextArea topMiddle = new JTextArea("Flu Virus");
		topMiddle.setEditable(false);
		topMiddle.setBounds(295, 170, 300, 40);
		topMiddle.setFont(headerFont);
		add(topMiddle);
		JTextArea topRight = new JTextArea("Zika Virus");
		topRight.setEditable(false);
		topRight.setBounds(595, 170, 300, 40);
		topRight.setFont(headerFont);
		add(topRight);
		JTextArea secondLeft = new JTextArea("Symptoms");
		secondLeft.setEditable(false);
		secondLeft.setBounds(95, 215, 200, 105);
		secondLeft.setFont(headerFont);
		add(secondLeft);
		JTextArea thirdLeft = new JTextArea("Transmission");
		thirdLeft.setEditable(false);
		thirdLeft.setBounds(95, 325, 200, 105);
		thirdLeft.setFont(headerFont);
		add(thirdLeft);
		JTextArea bottomLeft = new JTextArea("Prevention");
		bottomLeft.setEditable(false);
		bottomLeft.setBounds(95, 435, 200, 105);
		bottomLeft.setFont(headerFont);
		add(bottomLeft);
		JTextArea secondMiddle = new JTextArea("Symptoms of the flu virus\ninclude: fever, cough, sore throat,\nrunny/stuffy nose, body aches,\nheadaches, fatigue, possible\nvomiting and diarrhea.");
		secondMiddle.setEditable(false);
		secondMiddle.setBounds(295, 215, 300, 105);
		secondMiddle.setFont(bodyFont);
		add(secondMiddle);
		JTextArea thirdMiddle = new JTextArea("The flu virus is spread by droplets\nthrough the air. The flu virus can\nstay on metal and plastic for up to\n48 hours. The flu virus survives for\nshorter times on porous surfaces.");
		thirdMiddle.setEditable(false);
		thirdMiddle.setBounds(295, 325, 300, 105);
		thirdMiddle.setFont(bodyFont);
		add(thirdMiddle);
		JTextArea bottomMiddle = new JTextArea("Keep distance. Stay home. Cover mouth\nand nose when you sneeze or cough.\nWash hands a lot and sanitize\nsurfaces.");
		bottomMiddle.setEditable(false);
		bottomMiddle.setBounds(295, 435, 300, 105);
		bottomMiddle.setFont(bodyFont);
		add(bottomMiddle);
		JTextArea secondRight = new JTextArea("Symptoms of the Zika virus include:\nrash, itching over the entire body,\nhigh temperature, headache, joint\npain, muscle pain, red eyes, lower\nback pain, pain behind the eyes.");
		secondRight.setEditable(false);
		secondRight.setBounds(595, 215, 300, 105);
		secondRight.setFont(bodyFont);
		add(secondRight);
		JTextArea thirdRight = new JTextArea("The Zika virus can be transmitted\nprimarily through mosquito bites,\nfrom mother to child, through sex,\nand through blood transfusion.");
		thirdRight.setEditable(false);
		thirdRight.setBounds(595, 325, 300, 105);
		thirdRight.setFont(bodyFont);
		add(thirdRight);
		JTextArea bottomRight = new JTextArea("Use insect repellents. Wear\nlong-sleeve shirts and long pants to\ncover exposed skin. Stay and sleep\nin screened or air-conditioned rooms.\nConsider using mosquito nets.");
		bottomRight.setEditable(false);
		bottomRight.setBounds(595,435, 300, 105);
		bottomRight.setFont(bodyFont);
		add(bottomRight);
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
		g.drawRect(100, 200, 800, 375); //large rect
		g.drawLine(300, 200, 300, 575); //left vertical
		g.drawLine(600, 200, 600, 575); //right vertical
		g.drawLine(100, 245, 900, 245); //top hztl
		g.drawLine(100, 355, 900, 355); //mid hztl
		g.drawLine(100, 465, 900, 465); //bottom hztl
	}

}
