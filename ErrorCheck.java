/*
Name: Atharva Bhalerao, Rushi Barot
Date: Monday, June 15, 2020
Teacher: Ms. Krasteva
Description: This class displays a message stating if the question is wrong or correct.
*/

import javax.swing.*;

public class ErrorCheck {
    public ErrorCheck(boolean answer) {      
    	if(!answer) {
    		JOptionPane.showMessageDialog(null, "That is the wrong answer! Try Again!", "Sorry", JOptionPane.ERROR_MESSAGE);
    	}
    	else {
    		JOptionPane.showMessageDialog(null, "That is the right answer!", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
    	}
    }

}