import java.applet.Applet;
import java.awt.Graphics;
import java.util.Date;

public class DateTimeApplet extends Applet {
    public void paint(Graphics g) {
        Date d = new Date();
        g.drawString("Current Date and Time: " + d.toString(), 50, 100);
    }
}
