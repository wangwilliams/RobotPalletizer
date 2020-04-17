package com.wangyunpeng.test;

import java.awt.*;
import javax.swing.*;

public class BorderLayoutDemo {

    private static void addComponentsToPane(Container pane) {
        // content pane默认是BorderLayout，因此这里可以省略
        //pane.setLayout(new BorderLayout());  

        // 构造函数BorderLayout(int horizontalGap, int verticalGap)
        // 设置组件的水平和竖直方向上间隔
        //pane.setLayout(new BorderLayout(10, 20)); 

        JButton button = new JButton("Button 1 (PAGE_START)");
        pane.add(button, BorderLayout.PAGE_START);

        //Make the center component big, since that's the
        //typical usage of BorderLayout.
        button = new JButton("Button 2 (CENTER)");
        button.setPreferredSize(new Dimension(200, 100));
        pane.add(button, BorderLayout.CENTER);

        button = new JButton("Button 3 (LINE_START)");
        pane.add(button, BorderLayout.LINE_START);

        button = new JButton("Long-Named Button 4 (PAGE_END)");
        pane.add(button, BorderLayout.PAGE_END);

        button = new JButton("5 (LINE_END)");
        pane.add(button, BorderLayout.LINE_END);

    }

    private static void createAndShowGUI() {

        //Create and set up the window.
        JFrame frame = new JFrame("BorderLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
