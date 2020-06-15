/*
Name: Atharva Bhalerao, Rushi Barot
Date: Monday, June 15, 2020
Teacher: Ms. Krasteva
Description: This class is the second question for the test level.
*/

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.MouseListener;

public class TestLevelQuestion2 extends JFrame implements MouseListener {

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
	private int option5RectX = 425;
	private int option5RectY = 500;
	private int option5TextX = option5RectX + 20;
	private int option5TextY = option5RectY + 25;
	private int submitRectX = 860;
	private int submitRectY = 585;
	private int submitTextX = submitRectX + 30;
	private int submitTextY = submitRectY + 25;
	private boolean clicked1 = false;
	private boolean clicked2 = false;
	private boolean clicked3 = false;
	private boolean clicked4 = false;
	private boolean clicked5 = false;
	private int totalClicked = 0;
	private int windowName = 8;
   private int randomNum = 0;


	public TestLevelQuestion2() {
		JLabel label = new JLabel();  
		label.setIcon(new ImageIcon("C:\\Users\\rushi\\Desktop\\ICS ISP\\Pictures\\Example Logo.png"));
		//label.setIcon(new ImageIcon("C:\\Users\\athar\\eclipse-workspace\\Contagion\\src\\Pictures\\Example Logo.png"));
		label.setBounds(120, -80, 950, 350);
		add(label);
		addMouseListener(this);
		setSize(1000, 650);
      setTitle("Test Level Question 2");
		setLayout(null);
      randomNum = 1 + (int)(Math.random()*3);
      Font font1 = new Font("Monospaced", Font.PLAIN, 18);
      if (randomNum == 1)
      {
      	JTextArea opt1 = new JTextArea("You see Tony near the dumbbell rack.\n" 
          + "You notice that he is coughing a lot and is \nshivering tremendously.\n" 
          + "What precautions do you take?");
   		opt1.setEditable(false);
   		opt1.setBounds(190, 225, 550, 125);
   		opt1.setFont(font1);
   		add(opt1);
      }
      else if (randomNum == 2)
      {
      	JTextArea opt2 = new JTextArea("You see Priyanka coming out of the yoga studio.\n" 
          + "She’s sneezing a lot, but other than that she \nseems normal.\n"
          + "What precautions do you take?");
   		opt2.setEditable(false);
   		opt2.setBounds(190, 225, 550, 125);
   		opt2.setFont(font1);
   		add(opt2);
      }
      else if (randomNum == 3)
      {
      	JTextArea opt3 = new JTextArea("You meet Kentaro as he exits the changing room.\n"
          + "His face has some dark spots on it, and he seems \nto be sweating an awful lot for someone who just \ncame into the gym.\n"
          + "What precautions do you take?");
   		opt3.setEditable(false);
   		opt3.setBounds(190, 225, 550, 125);
   		opt3.setFont(font1);
   		add(opt3);
      }
      
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
			if (totalClicked < 2 && totalClicked >= 0 && clicked5 == false)
			{
				if (clicked1 == true)
					totalClicked--;
				else
					totalClicked++;
				clicked1 ^= true;
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(option1RectX, option1RectY, RectWidth, RectHeight);
				g.setColor(Color.BLACK);
				g.drawString("Put on Face Mask", option1TextX, option1TextY);
			}
			else if (totalClicked == 2 && clicked1 == true)
			{
				clicked1 = false;
				totalClicked--;
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(option1RectX, option1RectY, RectWidth, RectHeight);
				g.setColor(Color.BLACK);
				g.drawString("Put on Face Mask", option1TextX, option1TextY);
			}
		}
		if(e.getX() > option2RectX 
				&& e.getX() < option2RectX + RectWidth 
				&& e.getY() > option2RectY 
				&& e.getY() < option2RectY + RectHeight) {
			if (totalClicked < 2 && totalClicked >= 0 && clicked5 == false)
			{
				if (clicked2 == true)
					totalClicked--;
				else
					totalClicked++;
				clicked2 ^= true;		
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(option2RectX, option2RectY, RectWidth, RectHeight);
				g.setColor(Color.BLACK);
				g.drawString("Wear Gloves", option2TextX, option2TextY);
			}
			else if (totalClicked == 2 && clicked2 == true)
			{
				clicked2 ^= true;		
				totalClicked--;
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(option2RectX, option2RectY, RectWidth, RectHeight);
				g.setColor(Color.BLACK);
				g.drawString("Wear Gloves", option2TextX, option2TextY);
			}
		}
		if(e.getX() > option3RectX 
				&& e.getX() < option3RectX + RectWidth 
				&& e.getY() > option3RectY 
				&& e.getY() < option3RectY + RectHeight) {
			if (totalClicked < 2 && totalClicked >= 0 && clicked5 == false)
			{
				if (clicked3 == true)
					totalClicked--;
				else
					totalClicked++;
				clicked3 ^= true;		
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(option3RectX, option3RectY, RectWidth, RectHeight);
				g.setColor(Color.BLACK);
				g.drawString("Stand 2 Metres", option3TextXa, option3TextYa);
				g.drawString("Apart", option3TextXb, option3TextYb);
			}
			else if (totalClicked == 2 && clicked3 == true)
			{
				clicked3 ^= true;		
				totalClicked--;
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(option3RectX, option3RectY, RectWidth, RectHeight);
				g.setColor(Color.BLACK);
				g.drawString("Stand 2 Metres", option3TextXa, option3TextYa);
				g.drawString("Apart", option3TextXb, option3TextYb);
			}
		}
		if(e.getX() > option4RectX 
				&& e.getX() < option4RectX + RectWidth 
				&& e.getY() > option4RectY 
				&& e.getY() < option4RectY + RectHeight) {		
			if (totalClicked < 2 && totalClicked >= 0 && clicked5 == false)
			{
				if (clicked4 == true)
					totalClicked--;
				else
					totalClicked++;
				clicked4 ^= true;
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(option4RectX, option4RectY, RectWidth, RectHeight);
				g.setColor(Color.BLACK);
				g.drawString("Clean Surfaces", option4TextX, option4TextY);
			}
			else if (totalClicked == 2 && clicked4 == true)
			{
				clicked4 ^= true;
				totalClicked--;
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(option4RectX, option4RectY, RectWidth, RectHeight);
				g.setColor(Color.BLACK);
				g.drawString("Clean Surfaces", option4TextX, option4TextY);
			}

		}
		if (e.getX() > option5RectX 
				&& e.getX() < option5RectX + RectWidth 
				&& e.getY() > option5RectY 
				&& e.getY() < option5RectY + RectHeight) {	
			if(totalClicked < 1 && totalClicked >= 0) {
				if(clicked5) {
					totalClicked--;
				}
				else {
					totalClicked++;
				}
				clicked5 ^= true;
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(option5RectX, option5RectY, RectWidth, RectHeight);
				g.setColor(Color.BLACK);
				g.drawString("Do Nothing", option5TextX, option5TextY);	
			}
			else if (totalClicked == 1 && clicked5 == true)
			{
				clicked5 ^= true;
				totalClicked--;
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(option5RectX, option5RectY, RectWidth, RectHeight);
				g.setColor(Color.BLACK);
				g.drawString("Do Nothing", option5TextX, option5TextY);
			}
		}
		if(e.getX() > submitRectX 
				&& e.getX() < submitRectX + RectWidth 
				&& e.getY() > submitRectY 
				&& e.getY() < submitRectY + RectHeight) {		
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(submitRectX, submitRectY, RectWidth, RectHeight);
			g.setColor(Color.BLACK);
			g.drawString("Submit", submitTextX, submitTextY);
			if (randomNum == 1 && clicked1 == true && clicked3 == true)
         {
     			new ErrorCheck(true);
			   new TestLevelQuestion3();
         }
			else if (randomNum == 2 && clicked5 == true)
         {
     			new ErrorCheck(true);
			   new TestLevelQuestion3();
         }
         else if (randomNum == 3 && clicked2 == true && clicked4 == true)
         {
     			new ErrorCheck(true);
			   new TestLevelQuestion3();
         }
         else 
            new TestLevelFailed();
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
		g.drawRect(120, 255, 70, 40);
		g.setColor(Color.BLACK);
		g.drawString("Question 2:", 125, 280);
		if (clicked1)
			g.setColor(Color.LIGHT_GRAY);
		else
			g.setColor(Color.GRAY); 
		g.fillRect(option1RectX, option1RectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Put on Face Mask", option1TextX, option1TextY);
		if (clicked2)
			g.setColor(Color.LIGHT_GRAY);
		else
			g.setColor(Color.GRAY);
		g.fillRect(option2RectX, option2RectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Wear Gloves", option2TextX, option2TextY);
		if (clicked3)
			g.setColor(Color.LIGHT_GRAY);
		else
			g.setColor(Color.GRAY);
		g.fillRect(option3RectX, option3RectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Stand 2 Metres", option3TextXa, option3TextYa);
		g.drawString("Apart", option3TextXb, option3TextYb);
		if (clicked4)
			g.setColor(Color.LIGHT_GRAY);
		else
			g.setColor(Color.GRAY);
		g.fillRect(option4RectX, option4RectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Clean Surfaces", option4TextX, option4TextY);
		g.setColor(Color.GRAY);
		g.fillRect(submitRectX, submitRectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Submit", submitTextX, submitTextY);   
		if (clicked5)
			g.setColor(Color.LIGHT_GRAY);
		else 
			g.setColor(Color.GRAY);
		g.fillRect(option5RectX, option5RectY, RectWidth, RectHeight);
		g.setColor(Color.BLACK);
		g.drawString("Do Nothing", option5TextX, option5TextY);
		g.setColor(Color.GRAY);        
	}
}
