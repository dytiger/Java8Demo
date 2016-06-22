/**
 * Created by Administrator on 2016/6/22.
 */
public class ArgumentsPass {
    public void changeX(int x){
        x = x * 10;
    }

    public void changeBox1(Box box){
        box = new Box(100,200,300);
    }

    public void changeBox2(Box box){
        box.setX(box.getX()*10);
        box.setY(box.getY()*10);
        box.setZ(box.getZ()*10);
    }

    public static void main(String[] args) {
        ArgumentsPass ap = new ArgumentsPass();
        int x = 5;
        ap.changeX(x);
        System.out.println(x);

        Box box = new Box(5,3,7);
        ap.changeBox1(box);
        System.out.println(box);

        box = new Box(5,3,7);
        ap.changeBox2(box);
        System.out.println(box);
    }
}
