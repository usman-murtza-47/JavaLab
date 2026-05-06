import java.awt.*;
import java.awt.event.*;

public class LoginForm extends Frame implements ActionListener {
    TextField t1, t2;
    Label l;
    Button b;

    LoginForm() {
        setLayout(new FlowLayout());

        add(new Label("Username"));
        t1 = new TextField(20);
        add(t1);

        add(new Label("Password"));
        t2 = new TextField(20);
        t2.setEchoChar('*');
        add(t2);

        b = new Button("Login");
        add(b);

        l = new Label("");
        add(l);

        b.addActionListener(this);

        setSize(300, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (t1.getText().equals("admin") && t2.getText().equals("1234"))
            l.setText("Login Successful");
        else
            l.setText("Invalid Login");
    }

    public static void main(String[] args) {
        new LoginForm();
    }
}
