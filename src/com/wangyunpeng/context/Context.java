package com.wangyunpeng.context;

import java.util.Stack;

/**
 * @author wangyunpeng
 * @date 2020/4/18
 */
public class Context {
    private static Context instance = new Context();

    public Context() {
        try {
            this.state = new ControlState();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Context getInstance() {
        return instance;
    }

    private State state;
    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
