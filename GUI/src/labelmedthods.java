import java.awt.*;

public class labelmedthods {
    public static void main(String[] args) {
        Frame myF = new Frame("Frame has a label!");
        myF.setSize(300,150);
        myF.setLayout(new GridLayout(5,2 ));
        for(int i =0; i<10; i++){
            myF.add(new Button("Click" + i));
        }
        myF.setVisible(true);
//        Label l = new Label();
//        l.setText("my dick big");
//        l.setAlignment(l.CENTER);
//        myF.add(l);
//        TextField myTF = new TextField("A Text Field");
//        myF.add(myTF);
//        Button myBT = new Button("Click!");
//        myF.add(myBT);
//        myF.setVisible(true);
    }
}
