/**
 * Created by Administrator on 2016/7/5.
 */
public enum Size {
    S("小号"),M("中号"),L("大号"),XL("超大号"),XXL("特大号");

    private String desc;

    Size(String desc){
        this.desc = desc;
    }

    public String getDesc(){
        return desc;
    }
}
