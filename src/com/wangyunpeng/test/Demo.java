package com.wangyunpeng.test;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * @author wangyunpeng
 * @date 2020/4/15
 */
public class Demo {
    public static void main(String[] args) {
        JFrame window1 =new JFrame("QQ飞车");  //创建一个window1对象
        java.awt.Container con = window1.getContentPane(); //调用容器的方法
        con.setBackground(Color.BLACK); //设置窗口的背景颜色
        window1.setVisible(true); //设置窗口可视化
        window1.setSize(800, 600); //设置生成窗口的大小
        window1.setLocation(380, 50); //设置生成窗口在屏幕上的位置
        window1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //设置窗口的关闭功能
    }


    private static void setBorder(Border createEmptyBorder) {
        // TODO Auto-generated method stub
        setBorder(BorderFactory.createEmptyBorder());
    }
}
