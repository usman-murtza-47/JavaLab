import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseTracker extends Applet {
    int x = 0, y = 0;

    public void init() {
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                repaint();
            }
        });
    }

    public void paint(Graphics g) {
        g.drawString("Clicked at: (" + x + ", " + y + ")", 100, 100);
    }
}
