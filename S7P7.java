import java.awt.*;
import java.awt.event.*;

public class ClickCounter extends Frame implements ActionListener {
    Button b;
    Label l;
    int count = 0;

    ClickCounter() {
        setLayout(new FlowLayout());

        b = new Button("Click Me!");
        l = new Label("Count: 0");

        add(b);
        add(l);

        b.addActionListener(this);

        setSize(300, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        count++;
        l.setText("Count: " + count);
    }

    public static void main(String[] args) {
        new ClickCounter();
    }
}
