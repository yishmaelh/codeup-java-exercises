package pratice;

public class Duck {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Duck(String name, int age) throws IllegalArgumentException {
        this.name = name;
        this.age = age;
    }
}
