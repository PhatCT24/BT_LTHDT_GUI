import javax.swing.*;
import java.awt.*;

public class login {
    public static void main(String[] args){
        Frame F = new Frame("Login");
        F.setSize(800,500);
        F.setLayout(new BoxLayout(F,BoxLayout.Y_AXIS));
        Panel p1 = new Panel();
        p1.setLayout(new GridLayout(3,2,10,10));
        p1.add(new Label("username: "));
        p1.add(new TextField());
        p1.add(new Label("Password: "));
        p1.add(new TextField());
        p1.add(new Label());
        p1.add(new Button("login"));

        Panel p2 = new Panel();
        p2.setLayout(new FlowLayout());
        p2.add(new Button("Reset password"));
        p2.add(new Button("Register"));

        F.add(p1);
        F.add(p2);
        F.setVisible(true);

//        Label username = new Label("username");
//        username.setAlignment(username.CENTER);
//        TextField login = new TextField();
//        login.setSize(new Dimension(50,20));
//        F.add(username);
//        F.add(login);
//        Label pass = new Label("Password");
//        pass.setAlignment(pass.CENTER);
//        TextField passw = new TextField();
//        passw.setPreferredSize(new Dimension(100,20));
//        F.add(pass);
//        F.add(passw);
//        Label t = new Label();
//        F.add(t);
//        Button loginB = new Button("Login");
//        F.add(loginB);
//        F.setVisible(true);

    }
}
