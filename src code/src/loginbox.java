import com.sun.net.httpserver.Authenticator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class loginbox extends JFrame {
    private JTextField username;
    private JPasswordField password;
    private JButton button1;
    private JPanel panelmain;

    public JPanel getPanelmain(){
        return panelmain;
    }


    public loginbox() throws IOException {

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usn = username.getText();
                String pw =  new String(password.getPassword());
                try {
                    boolean res = Account.checklogin(usn,pw);
                    if (res) {
                        JOptionPane.showMessageDialog(button1, "Login Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(button1, "Login Failed: Incorrect username or password", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (IOException ex){
                    ex.printStackTrace();
                }
            }
        });
    }

    public static void main(String[] args) throws IOException {
        loginbox login = new loginbox();
        login.setContentPane(login.panelmain);
        login.setSize(300,300);
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
