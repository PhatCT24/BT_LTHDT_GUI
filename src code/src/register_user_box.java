import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class register_user_box extends JFrame {
    private JPanel panelmain;
    private JTextField First_Name;
    private JTextField Last_name;
    private JTextField email;
    private JButton registerButton;
    private JTextField username;
    private JTextField mobile_number;
    private JButton loginButton;
    private JPasswordField password;


    public void register() throws IOException {
        String fname = First_Name.getText();
        String lname = Last_name.getText();
        String eadd = email.getText();
        String usn = username.getText();
        String pw = new String(password.getPassword());
        String mob = mobile_number.getText();

        boolean res = Account.checklogin(usn, pw);
        if (res) {
            JOptionPane.showMessageDialog(this, "Register Failed: Username already exists", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Account acc = new Account(fname, lname, eadd, usn,pw, mob);
            try{
                acc.AddAccount();
            } catch (IOException e) {
            }
            JOptionPane.showMessageDialog(this, "Register Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public register_user_box()  {
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    register();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    loginbox loginbox_frame = new loginbox();
                    loginbox_frame.setSize(300,300);
                    loginbox_frame.setContentPane(loginbox_frame.getPanelmain());
                    loginbox_frame.setLocationRelativeTo(null);
                    loginbox_frame.setVisible(true);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }

    public static void main(String[] args) {
        register_user_box register = new register_user_box();
        register.setContentPane(register.panelmain);
        register.setSize(900,450);
        register.setLocationRelativeTo(null);
        register.setVisible(true);
        register.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}



