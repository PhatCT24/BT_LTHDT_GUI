package eventhandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ui extends Frame implements ActionListener {
    TextField t;
    public ui(){
        setLayout(new FlowLayout());
        t = new TextField("                ");
        add(t);
        Button b = new Button("Click");
        add(b);
        b.addActionListener(this);
        setSize(300,150);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        t.setText("Hello world");
    }
}
