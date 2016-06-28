package org.forten.sample;

/**
 * Created by Administrator on 2016/6/28.
 */
public class Box {
    private int x;
    private int y;
    private int z;

    public Box(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getArea(){
        return 2*(x*y+x*z+y*z);
    }
}
