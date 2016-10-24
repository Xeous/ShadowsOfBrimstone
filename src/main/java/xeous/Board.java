package xeous;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Gabe on 2016.10.23..
 */
public class Board extends JPanel {

    private Point mousePos;
    private boolean ingame;

    public Board() {

        addKeyListener(new MyKeyAdapter());
        addMouseListener(new MyMouseAdapter());
        setFocusable(true);
        setBackground(Color.black);

    }


    private class MyKeyAdapter extends KeyAdapter {

        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();

            if (ingame) {
                if (key == KeyEvent.VK_A) {

                }
                if (key == KeyEvent.VK_D) {

                }
                if (key == KeyEvent.VK_W) {

                }
                if (key == KeyEvent.VK_S) {

                }
            }
        }
    }

    private class MyMouseAdapter extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            mousePos = new Point(x, y);
        }
    }

}
