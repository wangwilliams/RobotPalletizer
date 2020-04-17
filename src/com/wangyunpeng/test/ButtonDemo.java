package com.wangyunpeng.test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonDemo implements ActionListener{
    JTextField tf;  // tf是ButtonDemo类的成员变量
    public void actionPerformed(ActionEvent e) {
        String name = ((JButton)e.getSource()).getText();
        tf.setText("Button " + name + " is clicked");  // 直接访问类的成员变量tf
    }

    ButtonDemo(){
        JFrame frame = new JFrame("ButtonDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new FlowLayout());
        // 等价于frame.getContentPane().setLayout(new FlowLayout());
        JButton btnUp = new JButton("Up");
        JButton btnDown = new JButton("Down");
        tf = new JTextField(20);

        btnUp.addActionListener(this);
        btnDown.addActionListener(this);

        frame.add(btnUp);
        frame.add(btnDown);
        frame.add(tf);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ButtonDemo();
            }
        });
    }
}