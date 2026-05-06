import java.awt.*;
import java.awt.event.*;

public class ColorSelector extends Frame implements ActionListener {
    Button r, g, b;

    ColorSelector() {
        setLayout(new FlowLayout());

        r = new Button("Red");
        g = new Button("Green");
        b = new Button("Blue");

        add(r);
        add(g);
        add(b);

        r.addActionListener(this);
        g.addActionListener(this);
        b.addActionListener(this);

        setSize(300, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == r)
            setBackground(Color.red);
        else if (e.getSource() == g)
            setBackground(Color.green);
        else
            setBackground(Color.blue);
    }

    public static void main(String[] args) {
        new ColorSelector();
    }
}
