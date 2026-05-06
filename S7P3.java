import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class FlagApplet extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.orange);
        g.fillRect(100, 50, 300, 50);

        g.setColor(Color.white);
        g.fillRect(100, 100, 300, 50);

        g.setColor(Color.green);
        g.fillRect(100, 150, 300, 50);

        g.setColor(Color.blue);
        g.drawOval(225, 105, 50, 40);
    }
}
