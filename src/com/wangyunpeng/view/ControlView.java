package com.wangyunpeng.view;

import com.wangyunpeng.test.ButtonTest;

import javax.swing.*;
import java.awt.*;

/**
 * @author wangyunpeng
 * @date 2020/4/18
 */
public class ControlView {
    final static int SCREEN_WIDTH = 960;
    final static int SCREEN_HEIGHT = 800;
    final static int BUTTON_SIZE = MyButton.getButtonSize();
    final static int FRONT_BUTTON_WIDTH_SIZE = 100;
    final static int FRONT_BUTTON_HEIGHT_SIZE = 520;
    final static int TEXT_AREA = 20;

    private static Button upButton;
    private static Button downButton;
    private static Button rightButton;
    private static Button leftButton;
    private static Button frontButton;
    private static Button behindButton;
    private static Button enterButton;
    private static Button deleteButton;
    private static Button quitButton;
    private static Button grabButton;
    private static JTextArea textArea;

    static {
        upButton = new MyButton("up");
        downButton = new MyButton("down");
        rightButton = new MyButton("rignt");
        leftButton = new MyButton("left");
        frontButton = new MyButton("front");
        behindButton = new MyButton("behind");
        enterButton = new MyButton("enter");
        deleteButton = new MyButton("delete");
        quitButton = new MyButton("quit");
        grabButton = new MyButton("grap");
        textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setFont(new Font(null,Font.PLAIN,18));
        textArea.setSize(SCREEN_WIDTH-2*TEXT_AREA,480);
    }

    public static void concreteControlView() {
        JFrame frame = new JFrame("码垛机器人控制系统");
        frame.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设置每个案件在程序中的位置
        frontButton.setLocation(FRONT_BUTTON_WIDTH_SIZE, FRONT_BUTTON_HEIGHT_SIZE);
        leftButton.setLocation(FRONT_BUTTON_WIDTH_SIZE - BUTTON_SIZE, FRONT_BUTTON_HEIGHT_SIZE + BUTTON_SIZE);
        rightButton.setLocation(FRONT_BUTTON_WIDTH_SIZE + BUTTON_SIZE, FRONT_BUTTON_HEIGHT_SIZE + BUTTON_SIZE);
        behindButton.setLocation(FRONT_BUTTON_WIDTH_SIZE, FRONT_BUTTON_HEIGHT_SIZE + 2 * BUTTON_SIZE);
        upButton.setLocation(FRONT_BUTTON_WIDTH_SIZE + 2 * BUTTON_SIZE, FRONT_BUTTON_HEIGHT_SIZE);
        downButton.setLocation(FRONT_BUTTON_WIDTH_SIZE + 2 * BUTTON_SIZE, FRONT_BUTTON_HEIGHT_SIZE + 2 * BUTTON_SIZE);
        grabButton.setLocation(FRONT_BUTTON_WIDTH_SIZE, FRONT_BUTTON_HEIGHT_SIZE + BUTTON_SIZE);
        quitButton.setLocation(FRONT_BUTTON_WIDTH_SIZE + 11 * BUTTON_SIZE, FRONT_BUTTON_HEIGHT_SIZE);
        deleteButton.setLocation(FRONT_BUTTON_WIDTH_SIZE + 11 * BUTTON_SIZE, FRONT_BUTTON_HEIGHT_SIZE + BUTTON_SIZE);
        enterButton.setLocation(FRONT_BUTTON_WIDTH_SIZE + 11 * BUTTON_SIZE, FRONT_BUTTON_HEIGHT_SIZE + BUTTON_SIZE * 2);
        textArea.setLocation(TEXT_AREA,TEXT_AREA);


        JPanel jPanel = new JPanel(null);
        jPanel.add(frontButton);
        jPanel.add(leftButton);
        jPanel.add(rightButton);
        jPanel.add(behindButton);
        jPanel.add(upButton);
        jPanel.add(downButton);
        jPanel.add(grabButton);
        jPanel.add(quitButton);
        jPanel.add(deleteButton);
        jPanel.add(enterButton);
        jPanel.add(textArea);

        frame.add(jPanel);
        frame.setVisible(true);
    }
}
