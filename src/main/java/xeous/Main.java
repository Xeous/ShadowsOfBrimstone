package xeous;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{

    public static void main(String args[]) {
        new Main();
    }

    public Main() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(200, 10);
        setResizable(false);
        JPanel panel = new Board();
        Button b = new Button();
        b.setLabel("Alma");
        panel.add(b);
        add(panel);
        setSize(889, 710);
        setVisible(true);
    }
}
