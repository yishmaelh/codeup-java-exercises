package pratice;

public class Mallard extends Duck implements Quackable{
    private int flySpeed;

    public Mallard(String name, int age, int flySpeed) throws IllegalArgumentException {
        super(name, age);
        this.flySpeed = flySpeed;
    }

    public int getFlySpeed() {
        return flySpeed;
    }

    public void setFlySpeed(int flySpeed) {
        this.flySpeed = flySpeed;
    }

    @Override
    public void Quack() {
        System.out.println("QUACK");
    }
}
