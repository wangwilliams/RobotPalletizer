package com.wangyunpeng.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author wangyunpeng
 * @date 2020/4/17
 */
public class JTextFieldDemo implements ActionListener {

    JTextField leftJtf;
    JTextField rightJtf;
    JTextField resultJlb;
    JTextFieldDemo(){

        JFrame frame = new JFrame("JTextFieldDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new FlowLayout());

        leftJtf = new JTextField(5);
        rightJtf = new JTextField(5);

        leftJtf.setActionCommand("leftJtf");
        leftJtf.addActionListener(this);
        rightJtf.setActionCommand("rightJtf");
        rightJtf.addActionListener(this);

        JButton jBtn = new JButton("=");
        jBtn.addActionListener(this);

        resultJlb = new JTextField(5);

        frame.add(leftJtf);
        frame.add(new JLabel("+"));
        frame.add(rightJtf);
        frame.add(jBtn);
        frame.add(resultJlb);

        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new JTextFieldDemo();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        // TODO Auto-generated method stub
        if(ae.getActionCommand().equals("=")) {
            resultJlb.setText(Integer.valueOf(leftJtf.getText()) + Integer.valueOf(rightJtf.getText())+"");
        }else if(ae.getActionCommand().equals("leftJtf")) {
            leftJtf.setText("");
        }else if(ae.getActionCommand().equals("rightJtf")) {
            rightJtf.setText("");
        }

    }
}