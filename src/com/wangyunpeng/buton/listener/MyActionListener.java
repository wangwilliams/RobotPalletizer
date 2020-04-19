package com.wangyunpeng.buton.listener;

import com.wangyunpeng.context.Context;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author wangyunpeng
 * @date 2020/4/19
 */
public abstract class MyActionListener implements ActionListener {
    public abstract void actionPerformed(ActionEvent e,Context context);

    @Override
    public void actionPerformed(ActionEvent e) {
        this.actionPerformed(e,Context.getInstance());
    }
}
