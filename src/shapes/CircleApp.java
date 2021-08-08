package shapes;


import util.Input;

public class CircleApp {

    public static void main(String[] args){


        do {
            System.out.println("Enter your circle's radius: ");
            Input inputRadius = new Input();
            double radius = inputRadius.getDouble();
            Circle circle = new Circle(radius);
            System.out.println("The area is: " + circle.getArea());
            System.out.println("The circumference is: " +  circle.getCircumference());


        }
    }
}
