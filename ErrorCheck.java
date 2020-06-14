import javax.swing.*;

public class ErrorCheck {
    public ErrorCheck(boolean answer) {      
    	if(!answer) {
    		JOptionPane.showMessageDialog(null, "That is the wrong answer!", "Sorry", JOptionPane.ERROR_MESSAGE);
    	}
    	else {
    		JOptionPane.showMessageDialog(null, "That is the right answer!", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
    	}
    }

}