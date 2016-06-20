/**
 * Created by Administrator on 2016/6/20.
 */
public class Driver {
    private String name;
    private Car car;

    public Driver() {
    }

    public Driver(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void start(){
        System.out.println(this.name+"发动了"+this.car.getName());
    }

    public void drive(){
        System.out.println(this.name+"以"+this.car.getSpeed()+"公里的时速驾驶着"+this.car.getName());
    }

    public void crash(){
        System.out.println(this.name+"以"+this.car.getSpeed()+"公里的时速撞树上了，车报废，损失"+this.car.getPrice()+"万");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Driver driver = (Driver) o;

        if (name != null ? !name.equals(driver.name) : driver.name != null) return false;
        return car != null ? car.equals(driver.car) : driver.car == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (car != null ? car.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", car=" + car +
                '}';
    }
}
