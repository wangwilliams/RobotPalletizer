package com.wangyunpeng;

import com.wangyunpeng.view.ControlView;

/**
 * @author wangyunpeng
 * @date 2020/4/17
 */
public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ControlView.concreteControlView();
            }
        });
    }
}
