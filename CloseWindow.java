import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.*;


public class CloseWindow extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CloseWindow() {
		setTitle("Contagion");
		JButton yes = new JButton("Yes");
		JButton no = new JButton("No");
		yes.setBounds(60, 120, 80, 60);
		no.setBounds(160, 120, 80, 60);
		add(yes);
		add(no);
		yes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		no.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new MouseListenerContagion();
			}
		});
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {//
				new MouseListenerContagion();
			}
		});
		setSize(300, 250);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	
	public void paint(Graphics g) {
		g.drawString("Are you sure you want to exit?", 75, 90);
	}
	
			
}
