import java.applet.Applet;
import java.awt.Graphics;

public class ParamApplet extends Applet {
    String name;

    public void init() {
        name = getParameter("name");
    }

    public void paint(Graphics g) {
        g.drawString("Hello, " + name + "!", 100, 100);
    }
}
