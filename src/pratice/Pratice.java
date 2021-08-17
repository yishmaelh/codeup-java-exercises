package pratice;

public class Pratice {
    public static double multiply(int x, int y){
        return x * y;
    }

    public static double multiply(double x, double y){
        return x * y;
    }

    public static void getMallardDetails(Mallard duck){
        System.out.println("The mallard " + duck.getName() + " flies at a speed of " + duck.getFlySpeed() + " mph.");
    }

    public static void main(String[] args) {
        System.out.println(multiply(5,8));
        System.out.println(multiply(4.5, 10.2));
        Mallard mallard = new Mallard("Howard", 3, 10);
        getMallardDetails(mallard);
    }

}
