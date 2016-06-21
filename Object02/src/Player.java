import java.util.Random;

/**
 * Created by Administrator on 2016/6/21.
 */
public class Player {
    private String name;
    private int hp;
    private int ap;
    private Weapon weapon;

    public Player() {

    }

    public Player(String name, int hp, int ap, Weapon weapon) {
        this.name = name;
        this.hp = hp;
        this.ap = ap;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAp() {
        return ap;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        if (weapon == null) {
            System.out.println(name + "徒手对对方造成" + getFinalHurt() + "点伤害。");
        } else {
            System.out.println(name + "使用" + weapon.getName() + "对对方造成" + getFinalHurt() + "点伤害。");
        }
    }

    public int attack(Player other) {
        int hurt = getFinalHurt();
        other.setHp(other.getHp() - hurt);
        System.out.println(this.getName() + "对" + other.getName() + "造成" + hurt + "点伤害。" + other.getName() + "当前血量为" + other.getHp());
        return hurt;
    }

    private int getFinalHurt() {
        if(isMiss()){return 0;}
        int hurt = ap;
        if (weapon != null) {
            hurt = weapon.getFinalHurt() + hurt;
        }
        if(isDoubleHurt()){
            return hurt*2;
        }else{
            return hurt;
        }
    }

    private boolean isDoubleHurt(){
        int t = NumberUtil.getIntRandom(0,99);
        if (t < 10) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isMiss() {
        int t = NumberUtil.getIntRandom(0,99);
        if (t < 5) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Player player = (Player) o;

        if (hp != player.hp) return false;
        if (ap != player.ap) return false;
        if (name != null ? !name.equals(player.name) : player.name != null) return false;
        return weapon != null ? weapon.equals(player.weapon) : player.weapon == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + hp;
        result = 31 * result + ap;
        result = 31 * result + (weapon != null ? weapon.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", ap=" + ap +
                ", weapon=" + weapon +
                '}';
    }
}
