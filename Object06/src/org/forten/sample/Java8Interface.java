package org.forten.sample;

/**
 * Created by Administrator on 2016/7/1.
 */
public interface Java8Interface {
    // public abstract
    int getNum();

    // Java 8以后可以在接口中加入具体方法，这种方法被称为接口的默认方法
    // 为了日后系统的维护工作而引入，方便在既有接口中添加新方法，而避免所有实现类都被强制实现此方法
    default void printInfo(){
        System.out.println("这是Java 8接口中的默认方法打印出的文本");
    }

    // Java 8以后还可以在接口中加入公有的静态方法
    // 作用是可以在接口中直接提供功能相关的工具方法
    static void printSomething(){
        System.out.println("这是Java 8接口中的静态方法打印出的文本");
    }
}
