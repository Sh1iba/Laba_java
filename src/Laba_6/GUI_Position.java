package Laba_6;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI_Position {
    public GUI_Position() {
        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(3);
        frame.setSize(500, 300);
        JButton b1 = new JButton("NORTH");
        frame.add(b1, "North");
        b1.setToolTipText("Добро пожаловать в");
        JButton b2 = new JButton("SOUTH");
        frame.add(b2, "South");
        b2.setToolTipText("Добро пожаловать Абха");
        JButton b3 = new JButton("EAST");
        frame.add(b3, "East");
        b3.setToolTipText("Добро пожаловать в Дахране");
        JButton b4 = new JButton("CENTER");
        frame.add(b4, "Center");
        b4.setToolTipText("Добро пожаловать в ");
        JButton b5 = new JButton("WEST");
        frame.add(b5, "West");
        b5.setToolTipText("Добро пожаловать в Джидда");
        frame.setVisible(true);
    }
}
