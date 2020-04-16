package com.wangyunpeng.test;

/**
 * @author wangyunpeng
 * @date 2020/4/16
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//1. 监听者类ButtonListener实现ActionListener接口
class ButtonListener  implements ActionListener{
    public void actionPerformed(ActionEvent e) {  // 4. 当按钮btnUp或btnDown被按下，此函数调用
        String name = ((JButton)e.getSource()).getText();
        System.out.println("Button " + name + " is clicked");
    }
}
public class ButtonTest {
    private ButtonListener bl;
    ButtonTest(){
        bl = new ButtonListener();  // 2. 创建监听者类对象bl
        JFrame frame = new JFrame("ButtonTest");
        frame.setSize(275, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new FlowLayout());
        // 等价于frame.getContentPane().setLayout(new FlowLayout());
        JButton btnUp = new JButton("Up");
        JButton btnDown = new JButton("Down");

        btnUp.addActionListener(bl);  // 3.1 注册bl到btnUp按钮中
        btnDown.addActionListener(bl);  // 3.2 注册bl到btnDown按钮中

        frame.add(btnUp);
        frame.add(btnDown);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ButtonTest();
            }
        });
    }
}
