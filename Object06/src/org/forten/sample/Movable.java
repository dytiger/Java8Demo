package org.forten.sample;

/**
 * Created by Administrator on 2016/7/1.
 */
public interface Movable {
    // 接口中的变量，无论是否显式声明，都是public static final的
    String desc = "可移动的";

    // 接口中的方法，无论是否显式声明，都是public abstract的
    void run();
}
