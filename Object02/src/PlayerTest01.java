/**
 * Created by Administrator on 2016/6/21.
 */
public class PlayerTest01 {
    public static void main(String[] args) {
        Weapon w1 = new Weapon("霜之哀伤",500,1000);
        Weapon w2 = new Weapon("霜之忧伤",300,600);

        Player p1 = new Player("张辽",15600,300,w1);
        Player p2 = new Player("吕布",16600,400,w2);
        while(p1.getHp()>0&&p2.getHp()>0){
            int v1 = p1.attack(p2);
            if(p2.getHp()<=0){
                break;
            }
            int v2 = p2.attack(p1);
        }
    }
}
