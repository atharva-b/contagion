import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Splashscreen extends JPanel implements ActionListener {
  Image myImage = (new ImageIcon("Images/postplay logo.png").getImage()).getScaledInstance(600, 600, Image.SCALE_DEFAULT);
  Timer timer = new Timer(30, this);

  private float alpha = 0;

  public Splashscreen() {
    timer.start();
  }

  public void paint(Graphics g) {
    super.paint(g);
    Graphics2D g2d = (Graphics2D) g;

    g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
    g2d.drawImage(myImage, 10, 10, null);
  }
  public void actionPerformed(ActionEvent e) {
	alpha += 0.01f;
	if(alpha >= 1f) {
		alpha = 1f;
		timer.stop();
	}
    repaint();
  }

}

