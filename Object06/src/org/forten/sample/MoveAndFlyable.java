package org.forten.sample;

/**
 * Created by Administrator on 2016/7/1.
 */
// 接口之间也可以出现继承关系，但与类的继承不同，一个接口可以同时有多个父接口，
// 这个接口会拥有所有父接口中的方法和常量
public interface MoveAndFlyable extends Movable,Flyable{

}
