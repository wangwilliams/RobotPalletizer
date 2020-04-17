package com.wangyunpeng.test;

/**
 * @author wangyunpeng
 * @date 2020/4/16
 */
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;
import javax.swing.*;

//1. 监听者类ButtonListener实现ActionListener接口
class ButtonListener  implements ActionListener{
    public void actionPerformed(ActionEvent e) {  // 4. 当按钮btnUp或btnDown被按下，此函数调用
        String name = ((JButton)e.getSource()).getText();
        System.out.println("Button " + name + " is clicked");
        synchronized (ButtonTest.LOCK) {
            try {
                FileWriter fileWriter = new FileWriter("G:\\RobotPalletizer\\a.txt",true);
                fileWriter.append("Button " + name + " is clicked\n");
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
}
public class ButtonTest {
    public final static Object LOCK = new Object();

    private ButtonListener bl;
    ButtonTest(){
        bl = new ButtonListener();  // 2. 创建监听者类对象bl
        JFrame frame = new JFrame("ButtonTest");
        frame.setVisible(true);
        frame.setLocation(380,50);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new FlowLayout());
        // 等价于frame.getContentPane().setLayout(new FlowLayout());
        JButton btnUp = new JButton("Up");
        JButton btnDown = new JButton("Down");

        btnUp.addActionListener(bl);  // 3.1 注册bl到btnUp按钮中
        btnDown.addActionListener(bl);  // 3.2 注册bl到btnDown按钮中

        frame.add(btnUp);
        frame.add(btnDown);

        //frame.pack();
        //frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ButtonTest();
            }
        });
        Thread read = new Thread(()->{
            while (true) {
                synchronized (LOCK) {
                    try {
                        FileReader fileReader = new FileReader("G:\\RobotPalletizer\\a.txt");
                        Scanner scanner = new Scanner(fileReader);
                        String line = scanner.nextLine();
                        while (scanner.hasNextLine()){
                            line = scanner.nextLine();
                        }
                        System.out.println("READ ：" + line);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        read.start();
    }
}
