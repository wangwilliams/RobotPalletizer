package com.wangyunpeng.view;

import java.awt.*;

/**
 * @author wangyunpeng
 * @date 2020/4/18
 */
public class MyButton extends Button {
    private final static int BUTTON_SIZE = 60;

    public MyButton(String label) throws HeadlessException {
        super(label);
        this.setSize(BUTTON_SIZE,BUTTON_SIZE);
    }

    public static int getButtonSize() {
        return BUTTON_SIZE;
    }
}
