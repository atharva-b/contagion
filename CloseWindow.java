import java.awt.event.*;
import javax.swing.*;
import java.awt.event.MouseListener;
import java.awt.*;


public class CloseWindow{

  	private int parentWindow = 0; 
  	private int input = 0;

	public CloseWindow(int parentWindow) {
		input = JOptionPane.showConfirmDialog(null, "Would you like to Exit?", "Contagion", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
		this.parentWindow = parentWindow;
		windowClosing();
	}

	public void windowClosing() {
		if(input == 0) {
			System.exit(0);
		}
		else if (input == 1){
			switch (parentWindow) {
			case 1: 
				new MouseListenerContagion();
				break;
			case 2:
				new BeginnerLevelInstructions();
				break;
			case 3:
				new BeginnerLevel();
				break;
			default:
				new MouseListenerContagion();
			}
		}
	}
	
}
