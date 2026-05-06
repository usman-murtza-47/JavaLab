import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener {
    TextField t1, t2;
    Button add, sub;
    Label l;

    Calculator() {
        setLayout(new FlowLayout());

        t1 = new TextField(10);
        t2 = new TextField(10);
        add = new Button("Add");
        sub = new Button("Subtract");
        l = new Label("Result:");

        add(t1);
        add(t2);
        add(add);
        add(sub);
        add(l);

        add.addActionListener(this);
        sub.addActionListener(this);

        setSize(300, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());

        if (e.getSource() == add)
            l.setText("Result: " + (a + b));
        else
            l.setText("Result: " + (a - b));
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
