import java.awt.*;
import java.awt.event.*;

public class FontChanger extends Frame implements ItemListener {
    Choice c;
    Label l;

    FontChanger() {
        setLayout(new FlowLayout());

        c = new Choice();
        c.add("Serif");
        c.add("SansSerif");
        c.add("Monospaced");

        l = new Label("Sample Text");

        add(c);
        add(l);

        c.addItemListener(this);

        setSize(300, 200);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        String font = c.getSelectedItem();
        l.setFont(new Font(font, Font.PLAIN, 20));
    }

    public static void main(String[] args) {
        new FontChanger();
    }
}
