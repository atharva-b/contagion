import java.awt.event.*;
import javax.swing.*;
import java.awt.event.MouseListener;
import java.awt.*;


public class CloseWindow{

  	private int parentWindow = 0; 
  	private int input = 0;

	public CloseWindow(int parentWindow) {
		input = JOptionPane.showConfirmDialog(null, "Are you sure you want to leave? Your progress will not be saved.", "Contagion", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
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
         case 4:
            new BeginnerLevelQuestion1();
            break;
         case 5:
            new BeginnerLevelQuestion2();
            break;
         case 6:
            new BeginnerLevelEnding();
            break;
         case 7:
            new TestLevel();
            break;
         case 8:
            new TestLevelQuestion();
            break;
         case 9:
            new TestLevelSucceeded();
            break;
         case 10:
            new TestLevelFailed();
            break;
			default:
				new MouseListenerContagion();
			}
		}
	}
	
}