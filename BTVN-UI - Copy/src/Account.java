import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Account {
    private String first_name;
    private String last_name;
    private String email;
    private String username;
    private String password;
    private String mobile;


    public Account(String first_name, String last_name, String email, String username, String password, String mobile) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.mobile = mobile;
    }

    public void AddAccount() throws IOException {
        FileWriter fw = new FileWriter("E:/java/JAVA/BTVN-UI/src/Account.txt", true);
        fw.write(this.username + "\n" + this.password + "\n");
        fw.close();
    }

    public static boolean checklogin(String username, String password) throws IOException {
        Scanner sc = new Scanner(new File("E:/java/JAVA/BTVN-UI/src/Account.txt"));
        while (sc.hasNextLine()) {
            String user = sc.nextLine();
            String pass = sc.nextLine();
            if (user.equals(username) && pass.equals(password)) {
                return true;
            }
        }
        return false;
    }
}
